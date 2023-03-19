package com.personAPI.controller;

import com.personAPI.dto.PersonDto;
import com.personAPI.model.Person;
import com.personAPI.impl.PersonServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    private final PersonServiceImpl personService;

    public PersonController(PersonServiceImpl personService) {
        this.personService = personService;
    }

    @PostMapping
    public ResponseEntity<PersonDto> createPerson(@RequestBody @Valid PersonDto personDto) {
        PersonDto createdPersonDto = personService.createPersonDto(personDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPersonDto);
    }

    @GetMapping
    public List<PersonDto> getAllPersons() {
        List<PersonDto> persons = personService.getAllPersons();
        return persons;
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonDto> getPersonById(@PathVariable Long id) {
        Optional<PersonDto> optionalPerson = personService.getPersonById(id);
        if (optionalPerson.isPresent()) {
            return ResponseEntity.ok(optionalPerson.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<PersonDto> updatePerson(@PathVariable Long id,@RequestBody @Valid PersonDto updatedPersonDto) {
        PersonDto updated = personService.updatePersonDto(id, updatedPersonDto);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePerson(@PathVariable Long id) {
        boolean isDeleted = personService.deletePerson(id);
        if (isDeleted) {
            return ResponseEntity.ok("Person with id " + id + " is deleted successfully");
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Person with id " + id + " not found");
        }
    }
}
