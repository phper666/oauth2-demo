package com.phper666.oauth2.demo.b.provider.core.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.phper666.oauth2.demo.b.provider.core.UserCore;
import com.phper666.oauth2.demo.b.provider.entity.User;
import com.phper666.oauth2.demo.b.provider.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-27 20:25:56
 * @software IntelliJ IDEA
 */
@Service
public class UserCodeImpl extends ServiceImpl<UserMapper, User> implements UserCore {
    @Override
    public List<User> getUserList() {
        return list();
    }

    @Override
    public User getUserDetailById(Long id) {
        return getById(id);
    }

    @Override
    public User getUserDetailByUsername(String username) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(User::getUsername, username);
        return getOne(queryWrapper);
    }

    @Override
    public User getUserDetailByPhoneNumber(String phoneNumber) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(User::getPhoneNumber, phoneNumber);
        return getOne(queryWrapper);
    }

    @Override
    public boolean insertUser(User inserData) {
        return save(inserData);
    }

    @Override
    public boolean updateUser(Long id, User updateData) {
        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
        updateWrapper.lambda().eq(User::getId, id);
        return update(updateData, updateWrapper);
    }

    @Override
    public boolean deleteUser(Long id) {
        return removeById(id);
    }
}
