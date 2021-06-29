package com.phper666.oauth2.demo.b.provider.core;

import com.baomidou.mybatisplus.extension.service.IService;
import com.phper666.oauth2.demo.b.provider.entity.User;

import java.util.List;

/**
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-27 20:24:39
 * @software IntelliJ IDEA
 */
public interface UserCore extends IService<User> {
    List<User> getUserList();

    User getUserDetailById(Long id);

    User getUserDetailByUsername(String username);

    User getUserDetailByPhoneNumber(String phoneNumber);

    boolean insertUser(User inserData);

    boolean updateUser(Long id, User updateData);

    boolean deleteUser(Long id);
}
