package com.phper666.oauth2.demo.b.api.apiservice;

import com.phper666.oauth2.demo.b.api.dto.UserDto;

import java.util.List;

/**
 * 本服务直接提供给web端的接口
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-28 10:18:34
 * @software IntelliJ IDEA
 */
public interface UserService {
    List<UserDto> getUserList();

    UserDto getUserDetail(Long id);

    boolean insertUser(UserDto insertDto);

    boolean updateUser(UserDto updateDto);

    boolean deleteUser(Long id);
}
