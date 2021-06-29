package com.phper666.oauth2.demo.b.provider.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import com.phper666.oauth2.demo.b.api.dto.UserDto;
import com.phper666.oauth2.demo.b.provider.core.UserCore;
import com.phper666.oauth2.demo.b.provider.entity.User;
import com.phper666.oauth2.demo.b.api.apiservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-28 10:19:56
 * @software IntelliJ IDEA
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserCore userCore;

    @Override
    public List<UserDto> getUserList() {
        List<User> list = userCore.getUserList();
        return BeanUtil.copyToList(list, UserDto.class);
    }

    @Override
    public UserDto getUserDetail(Long id) {
        User data = userCore.getUserDetailById(id);
        if (ObjectUtil.isNull(data)) {
            return null;
        }
        UserDto userDto = new UserDto();
        BeanUtil.copyProperties(data, userDto);
        return userDto;
    }

    @Override
    public boolean insertUser(UserDto insertDto) {
        User user = new User();
        BeanUtil.copyProperties(insertDto, user);
        return userCore.insertUser(user);
    }

    @Override
    public boolean updateUser(UserDto updateDto) {
        Long id = updateDto.getId();
        User updateData = new User();
        BeanUtil.copyProperties(updateDto, updateData);
        return userCore.updateUser(id, updateData);
    }

    @Override
    public boolean deleteUser(Long id) {
        return userCore.deleteUser(id);
    }
}
