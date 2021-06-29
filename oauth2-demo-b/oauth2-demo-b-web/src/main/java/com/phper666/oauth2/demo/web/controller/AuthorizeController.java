package com.phper666.oauth2.demo.web.controller;

import cn.hutool.core.bean.BeanUtil;
import com.phper666.oauth2.demo.b.api.apiservice.Oauth2Service;
import com.phper666.oauth2.demo.b.api.dto.Oauth2AccessTokenByAuthorizationCodeModeDto;
import com.phper666.oauth2.demo.b.api.dto.Oauth2AuthorizeCodeDto;
import com.phper666.oauth2.demo.common.util.CommonResult;
import com.phper666.oauth2.demo.web.vo.request.Oauth2AccessTokenByAuthorizationCodeModeRequestVo;
import com.phper666.oauth2.demo.web.vo.request.Oauth2AuthorizeCodeRequestVo;
import com.phper666.oauth2.demo.web.vo.response.Oauth2AccessTokenResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-29 22:20:49
 * @software IntelliJ IDEA
 */
@RestController
@RequestMapping("/b/authorize")
public class AuthorizeController {
    @Autowired
    private Oauth2Service oauth2Service;

    /**
     * 使用authorization_code方式获取授权码
     * @param vo
     * @return
     */
    @GetMapping("/authorization_code_mode/get_code")
    public CommonResult<String> getAuthorizeCodeByOauth2AuthorizationCodeMode(@Valid Oauth2AuthorizeCodeRequestVo vo){
        Oauth2AuthorizeCodeDto dto = new Oauth2AuthorizeCodeDto();
        BeanUtil.copyProperties(vo, dto);
        return CommonResult.success(oauth2Service.getAuthorizeCodeByOauth2AuthorizationCodeMode(dto));
    }

    /**
     * 使用authorization_code方式获取accessToken
     * @param vo
     * @return
     */
    @GetMapping("/authorization_code_mode/get_code")
    public CommonResult<Oauth2AccessTokenResponseVo> getAccessTokenByOauth2AuthorizationCodeMode(@Valid Oauth2AccessTokenByAuthorizationCodeModeRequestVo vo){
        Oauth2AccessTokenByAuthorizationCodeModeDto dto = new Oauth2AccessTokenByAuthorizationCodeModeDto();
        BeanUtil.copyProperties(vo, dto);
        return CommonResult.success(BeanUtil.copyProperties(oauth2Service.getAccessTokenByOauth2AuthorizationCodeMode(dto), Oauth2AccessTokenResponseVo.class));
    }
}
