package com.phper666.oauth2.demo.a.api.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-27 20:31:43
 * @software IntelliJ IDEA
 */
@Data
@Accessors(chain = true)
public class UserDto implements Serializable {
    private String username;

    private String password;

    private Integer sex;

    private String desc;

    private String avatar;

    private String profession;
}
