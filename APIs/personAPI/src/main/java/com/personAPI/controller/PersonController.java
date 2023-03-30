package com.personAPI.controller;

import com.personAPI.dto.PersonDto;
import com.personAPI.model.Person;
import com.personAPI.service.PersonService;
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
    public ResponseEntity<PersonDto> createPerson(@RequestBody @Valid PersonDto personDto) {
        PersonDto createdPerson = personService.createPerson(personDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPerson);
    }

    @GetMapping
    public ResponseEntity<List<PersonDto>> getAllPersons() {
        List<PersonDto> personDtos = personService.getAllPersons();
        return ResponseEntity.ok(personDtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonDto> getPersonById(@PathVariable long id) {
        Optional<PersonDto> optionalPersonDto = personService.getPersonById(id);

        if (optionalPersonDto.isPresent()) {
            return ResponseEntity.ok(optionalPersonDto.get());
        }else {
            return ResponseEntity.notFound().build();
        }

    }


}
