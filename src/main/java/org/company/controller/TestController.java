package org.company.controller;


import org.company.entity.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class TestController {

    @GetMapping(value = "/test1")
    @ResponseBody
    public String test1(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute("username","zs");
        return "test";
    }

    @GetMapping(value = "/test")
    @ResponseBody
    public String test(){
        System.out.println("test!!!");
        return "test";
    }

    @GetMapping(value = "/emp/find")
    @ResponseBody
    public Emp test(Emp emp){
        System.out.println("test!!!");
        return emp;
    }


}
