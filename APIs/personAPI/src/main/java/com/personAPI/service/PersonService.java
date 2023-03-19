package com.personAPI.service;


import com.personAPI.model.Person;
import com.personAPI.repository.PersonRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository personRepository;

   public PersonService(PersonRepository personRepository) {
       this.personRepository = personRepository;
   }

   public List<Person> getAllPerson() {
       return personRepository.findAll();
   }

   public Optional<Person> getPersonById(Long id) {
       return personRepository.findById(id);
   }

   public Person createPerson(Person person) {
       return personRepository.save(person);
   }

   public boolean deletePerson(Long id) {
       Optional<Person> optionalPerson = personRepository.findById(id);
       if(optionalPerson.isPresent()) {
           personRepository.deleteById(id);
           return true;
       }else {
           return false;
       }
   }

   public Person updatePerson(Long id, Person updatedPerson) {
       Optional<Person> optionalPerson = personRepository.findById(id);
       if(optionalPerson.isPresent()) {
           Person person = optionalPerson.get();
           person.setName(updatedPerson.getName());
           person.setAge(updatedPerson.getAge());
           return personRepository.save(person);
       }else {
           throw new EntityNotFoundException("Person not found with id " + id);
       }
   }

}
