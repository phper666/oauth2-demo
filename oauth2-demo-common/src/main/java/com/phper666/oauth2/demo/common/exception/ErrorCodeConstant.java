package com.phper666.oauth2.demo.common.exception;

/**
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-28 20:26:46
 * @software IntelliJ IDEA
 */
public interface ErrorCodeConstant {
    ErrorCode SUCCESS = new ErrorCode(0, "success");
    ErrorCode BAD_REQUEST = new ErrorCode(400, "bad request");
    ErrorCode UNAUTHORIZED = new ErrorCode(401, "unauthorized");
    ErrorCode FORBIDDEN = new ErrorCode(403, "forbidden");
    ErrorCode NOT_FOUND = new ErrorCode(404, "not found");
    ErrorCode METHOD_NOT_ALLOWED = new ErrorCode(405, "method not allowed");
    ErrorCode INTERNAL_SERVER_ERROR = new ErrorCode(500, "internal server error");
    ErrorCode UNKNOWN = new ErrorCode(999, "unknown error");
}
