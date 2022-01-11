package com.example.PersonJava.controller;

import com.example.PersonJava.services.CreatePerson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/person")
public class PersonController {


        @Autowired
        CreatePerson createPerson;

        @GetMapping("/generateperson")
        public void generate() {
            createPerson.dataDasePeople();
            log.info("Siamo nell Controller");
        }
}
