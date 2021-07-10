package com.sparta.week01_exercise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sparta.week01_exercise.person.Person;

@RestController
public class PersonController {

    @GetMapping("/myinfo")
    public Person getInfo(){
        return new Person("장현애", 22, "학생");
    }
}
