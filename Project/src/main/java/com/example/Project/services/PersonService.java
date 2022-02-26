package com.example.Project.services;

import com.example.Project.DTOS.PersonDTO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    List<PersonDTO> people = new ArrayList<>();

    public PersonService() {

    }

    public List<PersonDTO> getAllPeople(){
       return this.people;
    }

    public void createPerson(PersonDTO person) {
      this.people.add(person);
    }
}
