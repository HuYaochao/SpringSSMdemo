package org.company.controller;

import org.company.entity.Person;
import org.company.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.adapter.ForwardedHeaderTransformer;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    private PersonMapper personMapper;

    @GetMapping("/find")
    @ResponseBody
    public List<Person> find() {
        List<Person> list = personMapper.find();
        System.out.println(list);
        for(Person i:list){
            System.out.println(i);
        }
        return list;
    }



}
