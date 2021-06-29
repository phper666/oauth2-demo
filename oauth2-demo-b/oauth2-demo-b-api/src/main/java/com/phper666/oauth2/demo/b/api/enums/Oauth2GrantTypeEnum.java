package com.phper666.oauth2.demo.b.api.enums;

import lombok.Getter;

/**
 * oauth2的授权类型
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-27 20:55:05
 * @software IntelliJ IDEA
 */
@Getter
public enum Oauth2GrantTypeEnum {
    /**
     *
     */
    AUTHORIZATION_CODE("authorization_code", "oauth2-授权码,第三方应用先申请一个授权码，然后再用该码获取令牌"),

    IMPLICIT("implicit", "oauth2-隐藏式,有些 Web 应用是纯前端应用，没有后端。这时就不能用上面的方式了，必须将令牌储存在前端。RFC 6749 就规定了第二种方式，允许直接向前端颁发令牌。这种方式没有授权码这个中间步骤，所以称为（授权码）\"隐藏式\"（implicit）"),

    PASSWORD("password", "oauth2-密码式,如果你高度信任某个应用，RFC 6749 也允许用户把用户名和密码，直接告诉该应用。该应用就使用你的密码，申请令牌，这种方式称为\"密码式\"（password）"),

    CLIENT_CREDENTIALS("client_credentials", "oauth2-凭证式,适用于没有前端的命令行应用，即在命令行下请求令牌"),

    REFRESH_TOKEN("refresh_token", "oauth2-更新令牌,令牌的有效期到了，如果让用户重新走一遍上面的流程，再申请一个新的令牌，很可能体验不好，而且也没有必要。OAuth 2.0 允许用户自动更新令牌");

    private final String grantType;

    private final String desc;

    Oauth2GrantTypeEnum(String grantType, String desc) {
        this.grantType = grantType;
        this.desc = desc;
    }
}
