package com.personAPI.controller;

import com.personAPI.model.Person;
import com.personAPI.service.PersonService;
import org.hibernate.sql.Update;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public ResponseEntity<Person> createPerson(@RequestBody @Valid Person person) {
        Person createdPerson = personService.createPerson(person);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPerson);
    }

    @GetMapping
    public List<Person> getAllPersons() {
        return personService.getAllPerson();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable Long id) {
        Optional<Person> optionalPerson = personService.getPersonById(id);
        if (optionalPerson.isPresent()) {
            return ResponseEntity.ok(optionalPerson.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Person> updatePerson(@PathVariable Long id,@RequestBody @Valid Person updatedPerson) {
        Person updated = personService.updatePerson(id, updatedPerson);
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
