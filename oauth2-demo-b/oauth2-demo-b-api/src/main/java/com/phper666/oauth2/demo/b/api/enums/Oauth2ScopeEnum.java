package com.phper666.oauth2.demo.b.api.enums;

import lombok.Getter;

/**
 * 授权时需要的权限
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-27 21:14:30
 * @software IntelliJ IDEA
 */
@Getter
public enum Oauth2ScopeEnum {
    /**
     *
     */
    READ("read", "授权范围-只能获取用户一小部分数据");

    private final String scope;

    private final String desc;

    Oauth2ScopeEnum(String scope, String desc) {
        this.scope = scope;
        this.desc = desc;
    }
}
