package com.phper666.oauth2.demo.common.util;

import com.phper666.oauth2.demo.common.exception.ApiException;
import com.phper666.oauth2.demo.common.exception.ErrorCode;
import com.phper666.oauth2.demo.common.exception.ServiceException;

/**
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-28 10:34:20
 * @software IntelliJ IDEA
 */
public class ExceptionUtil {
    public static ServiceException serviceException(ErrorCode errorCode) {
        throw new ServiceException(errorCode);
    }

    public static ServiceException serviceException(Integer code, String message) {
        throw new ServiceException(code, message);
    }

    public static ApiException apiException(ErrorCode errorCode) {
        throw new ApiException(errorCode);
    }

    public static ApiException apiException(Integer code, String message) {
        throw new ApiException(code, message);
    }
}
