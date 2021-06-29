package com.phper666.oauth2.demo.b.api.rpc;

import com.phper666.oauth2.demo.b.api.dto.UserDto;

/**
 * 给其它内部服务调用的方法
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-28 09:49:14
 * @software IntelliJ IDEA
 */
public interface UserRpc {
    UserDto getUserDetail(Long id);
}
