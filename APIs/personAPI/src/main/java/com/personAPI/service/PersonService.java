package com.personAPI.service;


import com.personAPI.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonRepository personRepository;

   public PersonService(PersonRepository personRepository) {
       this.personRepository = personRepository;
   }
}
