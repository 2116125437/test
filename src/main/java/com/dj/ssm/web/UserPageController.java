package com.dj.ssm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user/")
public class UserPageController {

    @RequestMapping("toLogin")
    public String toLogin() {
        return "user/test";
    }



}
