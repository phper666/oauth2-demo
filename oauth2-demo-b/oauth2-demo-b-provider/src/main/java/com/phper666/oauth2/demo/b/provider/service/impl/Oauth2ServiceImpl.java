package com.phper666.oauth2.demo.b.provider.service.impl;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import com.phper666.oauth2.demo.b.api.dto.*;
import com.phper666.oauth2.demo.b.api.dto.result.Oauth2AccessTokenDtoResult;
import com.phper666.oauth2.demo.b.api.exception.ErrorCodeConstant;
import com.phper666.oauth2.demo.b.provider.core.ApplicationCore;
import com.phper666.oauth2.demo.b.provider.entity.Application;
import com.phper666.oauth2.demo.b.api.apiservice.Oauth2Service;
import com.phper666.oauth2.demo.common.util.ExceptionUtil;
import com.phper666.oauth2.demo.common.util.RedisUtil;
import com.phper666.oauth2.demo.common.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 这只是个思路demo，实际可以自己的业务逻辑变得更加复杂和严谨点
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-28 11:30:37
 * @software IntelliJ IDEA
 */
@Service
public class Oauth2ServiceImpl implements Oauth2Service {
    @Autowired
    private ApplicationCore applicationCore;

    @Autowired
    private RedisUtil redisUtil;

    @Override
    public String getAuthorizeCodeByOauth2AuthorizationCodeMode(Oauth2AuthorizeCodeDto dto) {
        // 查询是否已经接入应用
        boolean isCheck = applicationCore.checkByClientId(dto.getClientId());
        if (!isCheck) {
            ExceptionUtil.serviceException(ErrorCodeConstant.CLIENT_ID_NOT_EXIST_EXCEPTION_ERROR);
        }

        // todo 根据scope来划分不同权限的授权码

        //授权码有效5分钟
        String code = StrUtil.uuid();
        redisUtil.set("oauth2_code", code, 300);

        String redirectUrl = dto.getRedirectUri();
        if (Utils.checkUrlIsMatchParams(redirectUrl)) {
            redirectUrl += "&code=" + code;
        } else {
            redirectUrl += "?code=" + code;
        }

        return redirectUrl;
    }

    @Override
    public Oauth2AccessTokenDtoResult getAccessTokenByOauth2AuthorizationCodeMode(Oauth2AccessTokenByAuthorizationCodeModeDto dto) {
        // 查询是否已经接入应用
        Application data = applicationCore.getByClientId(dto.getClientId());
        if (ObjectUtil.isNull(data)) {
            ExceptionUtil.serviceException(ErrorCodeConstant.CLIENT_ID_NOT_EXIST_EXCEPTION_ERROR);
        }
        String code = redisUtil.get("oauth2_code").toString();
        if (ObjectUtil.isNull(code)) {
            ExceptionUtil.serviceException(ErrorCodeConstant.AUTHORIZATION_CODE_NOT_EXIST_EXCEPTION_ERROR);
        }

        // 判断传过来的秘钥是否一致
        if (!data.getClientSecret().equals(dto.getClientSecret())) {
            ExceptionUtil.serviceException(ErrorCodeConstant.CLIENT_SECRET_EXCEPTION_ERROR);
        }

        // 生成accessToken和refreshToken
        String accessToken = RandomUtil.randomString(128);
        String refreshToken = RandomUtil.randomString(128);
        String accessTokenKey = data.getClientId() + "_accessToken";
        String refreshTokenKey = data.getClientId() + "_refreshToken";
        Integer accessTokenExpiresIn = 7200;
        // token默认两个小时
        redisUtil.set(accessTokenKey, accessToken, accessTokenExpiresIn);
        // 刷新token默认7天
        redisUtil.set(refreshTokenKey, refreshToken, 60 * 60 * 24 * 7);
        Oauth2AccessTokenDtoResult result = new Oauth2AccessTokenDtoResult();
        result.setAccessToken(accessToken).setRefreshToken(refreshToken).setExpiresIn(accessTokenExpiresIn);
        return result;
    }

    @Override
    public Oauth2AccessTokenDtoResult getAccessTokenByImplicitMode(Oauth2AccessTokenByImplicitModeDto dto) {
        return null;
    }

    @Override
    public Oauth2AccessTokenDtoResult getAccessTokenByPasswordMode(Oauth2AccessTokenByPasswordModeDto dto) {
        return null;
    }

    @Override
    public Oauth2AccessTokenDtoResult getAccessTokenByClientCredentialsMode(Oauth2AccessTokenByClientCredentialsModeDto dto) {
        return null;
    }

    @Override
    public Oauth2AccessTokenDtoResult getAccessTokenByRefreshTokenMode(Oauth2AccessTokenByRefreshTokenModeDto dto) {
        return null;
    }
}
