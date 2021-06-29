package com.phper666.oauth2.demo.b.api.dto;

import com.phper666.oauth2.demo.b.api.enums.Oauth2GrantTypeEnum;
import com.phper666.oauth2.demo.b.api.enums.Oauth2ResponseType;
import com.phper666.oauth2.demo.b.api.enums.Oauth2ScopeEnum;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 隐藏式方式授权
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-27 21:17:03
 * @software IntelliJ IDEA
 */
@Data
@Accessors(chain = true)
public class Oauth2AccessTokenByImplicitModeDto implements Serializable {
    private Oauth2GrantTypeEnum grantType = Oauth2GrantTypeEnum.IMPLICIT;

    private Oauth2ResponseType responseType = Oauth2ResponseType.TOKEN;

    private Oauth2ScopeEnum scope;

    private String clientId;

    private String redirectUri;
}
