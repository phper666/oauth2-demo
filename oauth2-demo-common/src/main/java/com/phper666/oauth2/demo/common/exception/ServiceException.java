package com.phper666.oauth2.demo.common.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-27 12:16:12
 * @software IntelliJ IDEA
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class ServiceException extends RuntimeException {
    private Integer code;
    private String message;

    public ServiceException() {
    }

    public ServiceException(ErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }

    public ServiceException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
