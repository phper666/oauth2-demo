package com.phper666.oauth2.demo.web.vo.response;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-27 22:27:17
 * @software IntelliJ IDEA
 */
@Data
@Accessors(chain = true)
public class Oauth2AccessTokenResponseVo {
    private String accessToken;

    private String tokenType = "bearer";

    private String refreshToken;

    /**
     * 过期时间，单位秒
     */
    private Integer expiresIn;
}
