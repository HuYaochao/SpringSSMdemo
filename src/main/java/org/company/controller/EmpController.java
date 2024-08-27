package org.company.controller;

import org.company.entity.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

@Controller
public class EmpController {

    @GetMapping(value = "deleteByIds")
    @ResponseBody
    public String deleteByIds(@RequestParam ArrayList<Integer> ids){
        System.out.println(ids);
        return "返回数据";
    }

    @PostMapping(value = "/add")
    @ResponseBody
    public String add(Emp emp){
        System.out.println(emp);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String now = simpleDateFormat.format(emp.getbirthday());
        System.out.println(now);
        System.out.println("success");
        return "success";
    }

}
