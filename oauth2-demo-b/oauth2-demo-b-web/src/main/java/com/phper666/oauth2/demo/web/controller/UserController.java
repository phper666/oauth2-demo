package com.phper666.oauth2.demo.web.controller;

import cn.hutool.core.bean.BeanUtil;
import com.phper666.oauth2.demo.b.api.apiservice.UserService;
import com.phper666.oauth2.demo.b.api.dto.UserDto;
import com.phper666.oauth2.demo.common.util.CommonResult;
import com.phper666.oauth2.demo.web.vo.request.InsertUserRequestVo;
import com.phper666.oauth2.demo.web.vo.request.UpdateUserRequestVo;
import com.phper666.oauth2.demo.web.vo.response.UserResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author yuzhao.li
 * @email 562405704@qq.com
 * @date 2021-06-29 22:20:49
 * @software IntelliJ IDEA
 */
@RestController
@RequestMapping("/b/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PatchMapping("/list")
    public CommonResult<List<UserResponseVo>> list(){
        List<UserDto> list = userService.getUserList();
        return CommonResult.success(BeanUtil.copyToList(list, UserResponseVo.class));
    }

    @GetMapping("/{user_id}")
    public CommonResult<UserResponseVo> detail(@PathVariable(value = "user_id") Long userId){
        UserDto dto = userService.getUserDetail(userId);
        UserResponseVo result = new UserResponseVo();
        BeanUtil.copyProperties(dto, result);
        return CommonResult.success(result);
    }

    @PostMapping("")
    public CommonResult<Boolean> insertUser(@Valid InsertUserRequestVo insertUserRequestVo){
        UserDto dto = new UserDto();
        BeanUtil.copyProperties(insertUserRequestVo, dto);
        return CommonResult.success(userService.insertUser(dto));
    }

    @PatchMapping("")
    public CommonResult<Boolean> updateUser(@Valid UpdateUserRequestVo updateUserRequestVo){
        UserDto dto = new UserDto();
        BeanUtil.copyProperties(updateUserRequestVo, dto);
        return CommonResult.success(userService.updateUser(dto));
    }

    @PatchMapping("/{user_id}")
    public CommonResult<Boolean> deleteUser(@PathVariable(value = "user_id") Long userId){
        return CommonResult.success(userService.deleteUser(userId));
    }
}
