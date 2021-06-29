package com.phper666.oauth2.demo.b.api.apiservice;

import com.phper666.oauth2.demo.b.api.dto.*;
import com.phper666.oauth2.demo.b.api.dto.result.Oauth2AccessTokenDtoResult;

/**
 * 本服务直接提供给web端的接口
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-28 11:30:28
 * @software IntelliJ IDEA
 */
public interface Oauth2Service {
    /**
     * 获取预授权码，当前使用的是oauth2的授权码方式
     * @return
     */
    String getAuthorizeCodeByOauth2AuthorizationCodeMode(Oauth2AuthorizeCodeDto dto);

    /**
     * 获取授权后的accessToken,oauth2的授权码方式
     * @return
     */
    Oauth2AccessTokenDtoResult getAccessTokenByOauth2AuthorizationCodeMode(Oauth2AccessTokenByAuthorizationCodeModeDto dto);

    /**
     * 获取accessToken,oauth2的隐藏式获取
     * @return
     */
    Oauth2AccessTokenDtoResult getAccessTokenByImplicitMode(Oauth2AccessTokenByImplicitModeDto dto);

    /**
     * 获取accessToken,oauth2的密码式获取
     * @return
     */
    Oauth2AccessTokenDtoResult getAccessTokenByPasswordMode(Oauth2AccessTokenByPasswordModeDto dto);

    /**
     * 获取accessToken,oauth2的凭证式获取
     * @return
     */
    Oauth2AccessTokenDtoResult getAccessTokenByClientCredentialsMode(Oauth2AccessTokenByClientCredentialsModeDto dto);

    /**
     * 获取accessToken,oauth2的刷新token方式获取
     * @return
     */
    Oauth2AccessTokenDtoResult getAccessTokenByRefreshTokenMode(Oauth2AccessTokenByRefreshTokenModeDto dto);
}
