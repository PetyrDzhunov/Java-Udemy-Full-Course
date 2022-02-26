package com.example.Project.services;

import com.example.Project.DTOS.PersonDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonServiceTest {
    private final PersonService personService = new PersonService();

    @Test
    public void getAllPeople_shouldGetAllPeople() {
        PersonDTO personDto = new PersonDTO("Dido",19,"Portier");

        List<PersonDTO> people = new ArrayList<>();
        people.add(personDto);
        personService.createPerson(personDto);

        assertEquals(people,personService.getAllPeople());

    }
}
