package com.phper666.oauth2.demo.b.provider.core;

import com.baomidou.mybatisplus.extension.service.IService;
import com.phper666.oauth2.demo.b.provider.entity.Application;

/**
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-28 11:51:51
 * @software IntelliJ IDEA
 */
public interface ApplicationCore extends IService<Application> {
    boolean checkByClientId(String clientId);

    Application getByClientId(String clientId);
}
