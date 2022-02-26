package com.example.Project.controllers;

import com.example.Project.DTOS.PersonDTO;
import com.example.Project.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/persons")
public class Person {

    public final PersonService personService;

    @Autowired
    public Person(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public ResponseEntity<List<PersonDTO>> getPeople() {
        return new ResponseEntity<>(personService.getAllPeople(), HttpStatus.OK);
    }


    @GetMapping(value = "/{person}")
    public ResponseEntity<String> getPerson(@PathVariable String person) {
        return new ResponseEntity<>(person, HttpStatus.OK);
    }


    @PostMapping()
    public ResponseEntity<String> createPerson(@RequestBody PersonDTO personData) {
        personService.createPerson(personData);
        return new ResponseEntity<>("Successfully created", HttpStatus.CREATED);
    }

}