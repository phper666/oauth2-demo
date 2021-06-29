package com.phper666.oauth2.demo.web.vo.response;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-29 22:22:48
 * @software IntelliJ IDEA
 */
@Data
@Accessors(chain = true)
public class UserResponseVo {
    private String id;

    private String username;

    private String email;

    private String phoneNumber;

    private String password;

    private Integer sex;

    private String desc;

    private String avatar;

    private String profession;
}
