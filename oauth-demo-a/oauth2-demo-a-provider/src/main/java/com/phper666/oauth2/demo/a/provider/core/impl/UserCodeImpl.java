package com.phper666.oauth2.demo.a.provider.core.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.phper666.oauth2.demo.a.provider.core.UserCore;
import com.phper666.oauth2.demo.a.provider.entity.User;
import com.phper666.oauth2.demo.a.provider.mapper.AUserMapper;
import org.springframework.stereotype.Service;

/**
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-27 20:25:56
 * @software IntelliJ IDEA
 */
@Service
public class UserCodeImpl extends ServiceImpl<AUserMapper, User> implements UserCore {
}
