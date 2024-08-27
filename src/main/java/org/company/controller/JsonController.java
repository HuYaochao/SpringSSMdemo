package org.company.controller;

import org.company.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/json")
public class JsonController {
    @PostMapping("/login")
    public String login(@RequestBody User user){
        System.out.println(user);
        return "redirect:/index.html";
    }

    @GetMapping("/findAll")
    public List<User> findAll() {
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setId(1);
        user.setUsername("hyc");
        user.setPassword("hyc");
        list.add(user);
        return list;
    }
}
