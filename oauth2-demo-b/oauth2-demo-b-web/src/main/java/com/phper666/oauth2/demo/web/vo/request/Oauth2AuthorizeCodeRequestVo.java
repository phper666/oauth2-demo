package com.phper666.oauth2.demo.web.vo.request;

import com.phper666.oauth2.demo.b.api.enums.Oauth2GrantTypeEnum;
import com.phper666.oauth2.demo.b.api.enums.Oauth2ResponseType;
import com.phper666.oauth2.demo.b.api.enums.Oauth2ScopeEnum;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-27 21:17:03
 * @software IntelliJ IDEA
 */
@Data
@Accessors(chain = true)
public class Oauth2AuthorizeCodeRequestVo {
    /**
     * oauth2授权码方式
     */
    private Oauth2GrantTypeEnum grantType;

    private Oauth2ResponseType responseType;

    private Oauth2ScopeEnum scope;

    private String clientId;

    private String redirectUri;
}
