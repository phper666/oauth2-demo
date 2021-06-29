package com.phper666.oauth2.demo.common.servlet.advice;

/**
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-28 20:33:47
 * @software IntelliJ IDEA
 */

import com.phper666.oauth2.demo.common.exception.ApiException;
import com.phper666.oauth2.demo.common.exception.ErrorCodeConstant;
import com.phper666.oauth2.demo.common.exception.ServiceException;
import com.phper666.oauth2.demo.common.util.CommonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.nio.file.AccessDeniedException;

@RestControllerAdvice(
        annotations = {RestController.class}
)
public class RestExceptionHandleAdvice {
    private static final Logger log = LoggerFactory.getLogger(RestExceptionHandleAdvice.class);

    public RestExceptionHandleAdvice() {
    }

    @ExceptionHandler({AccessDeniedException.class})
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public CommonResult<Object> accessDeniedException(AccessDeniedException e) {
        return CommonResult.failed(ErrorCodeConstant.FORBIDDEN, e.getMessage());
    }

    @ExceptionHandler({Exception.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public CommonResult<Object> exception(HttpServletRequest request, Exception e) {
        log.error("request: " + request.getRequestURI() + ", exception: " + e.getMessage(), e);
        return CommonResult.failed(ErrorCodeConstant.INTERNAL_SERVER_ERROR, e.getMessage());
    }

    @ExceptionHandler({ApiException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public CommonResult<Object> apiException(HttpServletRequest request, ApiException e) {
        log.error("request: " + request.getRequestURI() + ", exception: " + e.getMessage(), e);
        return CommonResult.failed(e.getCode(), e.getMessage());
    }

    @ExceptionHandler({ServiceException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public CommonResult<Object> serviceException(HttpServletRequest request, ServiceException e) {
        log.error("request: " + request.getRequestURI() + ", exception: " + e.getMessage(), e);
        return CommonResult.failed(e.getCode(), e.getMessage());
    }
}
