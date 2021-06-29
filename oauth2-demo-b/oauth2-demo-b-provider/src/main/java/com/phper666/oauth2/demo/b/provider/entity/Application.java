package com.phper666.oauth2.demo.b.provider.entity;

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
 * @date 2021-06-27 20:50:55
 * @software IntelliJ IDEA
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("b_application")
public class Application extends Model<Application> {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 接入应用的唯一id
     */
    private String clientId;

    /**
     * 分发给接入应用的秘钥
     */
    private String clientSecret;

    /**
     * 接入应用的描述
     */
    private String desc;

    /**
     * 接入应用的官网
     */
    private String webUrl;
}
