package com.phper666.oauth2.demo.b.api.enums;

import lombok.Getter;

/**
 * oauth2的授权响应类型
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-27 21:23:53
 * @software IntelliJ IDEA
 */
@Getter
public enum Oauth2ResponseType {
    /**
     *
     */
    CODE("code", "oauth2授权时，返回一个code授权码(该code有时间限制，并且只能使用一次)，然后拿着这个code去换token"),

    TOKEN("accessToken", "直接表示返回access_token");

    private final String responseType;

    private final String desc;

    Oauth2ResponseType(String responseType, String desc) {
        this.responseType = responseType;
        this.desc = desc;
    }
}
