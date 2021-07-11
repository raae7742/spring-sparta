package com.sparta.week01_exercise.controller;

import com.sparta.week01_exercise.domain.PersonRepository;
import com.sparta.week01_exercise.domain.PersonRequestDto;
import com.sparta.week01_exercise.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.sparta.week01_exercise.domain.Person;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PersonController {

    private final PersonRepository personRepository;
    private final PersonService personService;

    @GetMapping("/myinfo")
    public Person getInfo(){
        return new Person("장현애", 22, "학생");
    }

    @GetMapping("/api/persons")
    public List<Person> getPersons(){
        return personRepository.findAll();
    }

    @PostMapping("/api/persons")
    public Person createPerson(@RequestBody PersonRequestDto requestDto){
        Person person = new Person(requestDto);
        return personRepository.save(person);
    }

    @PutMapping("/api/persons/{id}")
    public Long updatePerson(@PathVariable Long id, @RequestBody PersonRequestDto requestDto){
        return personService.update(id, requestDto);
    }

    @DeleteMapping("/api/persons/{id}")
    public Long deletePerson(@PathVariable Long id){
        personRepository.deleteById(id);
        return id;
    }
}
