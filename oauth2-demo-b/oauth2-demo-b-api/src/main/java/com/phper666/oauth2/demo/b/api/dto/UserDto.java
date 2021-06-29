package com.phper666.oauth2.demo.b.api.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-27 20:31:33
 * @software IntelliJ IDEA
 */
@Data
@Accessors(chain = true)
public class UserDto implements Serializable {
    @NotNull(message = "id不能为空")
    private Long id;

    private String username;

    private String email;

    private String phoneNumber;

    private Integer sex;

    private String desc;

    private String avatar;

    private String profession;
}
