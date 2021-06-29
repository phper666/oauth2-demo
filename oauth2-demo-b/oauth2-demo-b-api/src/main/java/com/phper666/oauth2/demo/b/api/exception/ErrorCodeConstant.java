package com.phper666.oauth2.demo.b.api.exception;

import com.phper666.oauth2.demo.common.exception.ErrorCode;

/**
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-28 20:26:46
 * @software IntelliJ IDEA
 */
public interface ErrorCodeConstant {
    ErrorCode UNDEFINED_EXCEPTION_ERROR = new ErrorCode(-1, "Undefined exception error");

    ErrorCode CLIENT_ID_NOT_EXIST_EXCEPTION_ERROR = new ErrorCode(1000000000, "ClientId does not exist");

    ErrorCode AUTHORIZATION_CODE_NOT_EXIST_EXCEPTION_ERROR = new ErrorCode(1000000001, "Authorization code does not exist");

    ErrorCode CLIENT_SECRET_EXCEPTION_ERROR = new ErrorCode(1000000002, "ClientSecret error");
}
