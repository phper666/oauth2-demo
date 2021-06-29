package com.phper666.oauth2.demo.a.provider.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-27 19:41:59
 * @software IntelliJ IDEA
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("a_user")
public class User extends Model<User> {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String username;

    private String password;

    private Integer sex;

    private String desc;

    private String avatar;

    private String profession;
}
