package com.phper666.oauth2.demo.b.api.dto;

import com.phper666.oauth2.demo.b.api.enums.Oauth2GrantTypeEnum;
import com.phper666.oauth2.demo.b.api.enums.Oauth2ResponseType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 凭证方式授权
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-27 21:17:03
 * @software IntelliJ IDEA
 */
@Data
@Accessors(chain = true)
public class Oauth2AccessTokenByClientCredentialsModeDto implements Serializable {
    private Oauth2GrantTypeEnum grantType = Oauth2GrantTypeEnum.CLIENT_CREDENTIALS;

    private Oauth2ResponseType responseType = Oauth2ResponseType.TOKEN;

    private String clientId;

    private String clientSecret;
}
