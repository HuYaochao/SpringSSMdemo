package org.company.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;


@Controller
@SessionAttributes("username")
public class LoginController {

    // 处理登录请求
    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session) {
        // 简单的用户验证逻辑（在实际应用中应使用数据库）
        if ("a".equals(username) && "a".equals(password)) {
            session.setAttribute("username", username);
            return "redirect:/home.html";
        } else {
            return "redirect:/login.html?error=true";
        }
    }

    // 处理登出请求
    @RequestMapping("/logout")
    public String logout(HttpSession session, SessionStatus sessionStatus) {
        session.invalidate(); // 销毁会话
        sessionStatus.setComplete(); // 标记会话完成
        return "redirect:/login.html";
    }
}



//@Controller
//@ResponseBody
////@RequestMapping("/test")
//public class LoginController {
//
//    @RequestMapping("findById/{id}")
//    public String findById(@PathVariable Integer id){
//        System.out.println(id);
//        return "index";
//    }
//
//
//    @RequestMapping("login3")
//    public String login3(@RequestParam(name="name1",required = false,defaultValue = "zs") String name){
//        System.out.println(name);
//        return "index";
//    }
//
//    @RequestMapping(value = "login1",method = RequestMethod.GET)
//    public String login(){
//        return "index";
//    }
//}
