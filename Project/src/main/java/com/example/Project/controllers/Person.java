package com.example.Project.controllers;

import com.example.Project.DTOS.PersonDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/persons")
public class Person {
    @GetMapping
    public ResponseEntity<PersonDTO[]> getPeople(){
        return PersonService.getAllPeople();
    }


    @GetMapping(value = "/{person}")
    public ResponseEntity<String> getPerson(@PathVariable String person) {
        return new ResponseEntity<>(person, HttpStatus.OK);
    }




    @PostMapping()
    public ResponseEntity<PersonDTO> createPerson(@RequestBody PersonDTO personData){
        PersonDTO personCreated = new PersonDTO(personData.getName(), personData.getAge(), personData.getJob());
            return new ResponseEntity<>(personCreated,HttpStatus.CREATED);
    }

}