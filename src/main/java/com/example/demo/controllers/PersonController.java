package com.example.demo.controllers;

import com.example.demo.Entities.Person;
import com.example.demo.servies.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/person")
@RequiredArgsConstructor
public class PersonController {
    @Autowired
    PersonService personService;

    @PostMapping
    public void savePerson(@RequestBody Person person) {
        personService.save(person);
    }

    @GetMapping()
    public Person getPerson(@RequestParam String id) {
        return personService.getPerson(id);
    }
}
