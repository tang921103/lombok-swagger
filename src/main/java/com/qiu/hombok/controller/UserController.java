package com.qiu.hombok.controller;

import com.qiu.hombok.entities.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(description = "用户管理")
public class UserController {
    @RequestMapping("/showLogin")
    @ApiOperation(value="登陆页面")
    public String showLogin(){
        return "login";
    }
    @RequestMapping("/login")
    @ResponseBody
    @ApiOperation(value="登陆",notes ="验证用户名和密码")
    public String login(User user){
        if(("tangqiu".equals(user.getUsername()) && ("123456".equals(user.getPassword())))){
            return "right";
        }
        return "error";
    }
    @RequestMapping("/find")
    @ResponseBody()
    @ApiOperation(value = "查询用户" ,notes="根据id查询用户")
    public User getUser(String id){
        System.out.println(id);
        User user = new User();
        user.setUsername("tang");
        user.setPassword(("123456"));
        return user;
    }
}
