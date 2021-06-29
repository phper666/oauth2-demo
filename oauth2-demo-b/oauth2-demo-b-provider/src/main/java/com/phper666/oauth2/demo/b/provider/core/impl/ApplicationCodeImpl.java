package com.phper666.oauth2.demo.b.provider.core.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.phper666.oauth2.demo.b.provider.core.ApplicationCore;
import com.phper666.oauth2.demo.b.provider.entity.Application;
import com.phper666.oauth2.demo.b.provider.mapper.ApplicationMapper;
import org.springframework.stereotype.Service;

/**
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-27 20:25:56
 * @software IntelliJ IDEA
 */
@Service
public class ApplicationCodeImpl extends ServiceImpl<ApplicationMapper, Application> implements ApplicationCore {

    @Override
    public boolean checkByClientId(String clientId) {
        QueryWrapper<Application> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Application::getClientId, clientId);
        return ObjectUtil.isNotNull(getOne(queryWrapper));
    }

    @Override
    public Application getByClientId(String clientId) {
        QueryWrapper<Application> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Application::getClientId, clientId);
        return getOne(queryWrapper);
    }
}
