package com.phper666.oauth2.demo.common.exception;

/**
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-28 20:23:28
 * @software IntelliJ IDEA
 */
public class ErrorCode {
    private final Integer code;
    private final String message;

    public ErrorCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
