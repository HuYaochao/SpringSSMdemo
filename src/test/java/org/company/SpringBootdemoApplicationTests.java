package org.company;

import org.company.controller.PersonController;
import org.company.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootdemoApplicationTests {

    @Autowired
    PersonController personController;
    @Test
    void contextLoads() {
         personController.find();


    }

}
