package com.joyoudata.actuator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    /**
     * 前往认证(登录)页面
     *
     * @return
     */
    @RequestMapping("/user/list")
    public String toLogin() {
        return "pages/system/act_user_list.html"; // classpath: /templates/login.html
    }

}
