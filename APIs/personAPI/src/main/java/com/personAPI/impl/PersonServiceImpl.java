package com.personAPI.impl;


import com.personAPI.controller.PersonController;
import com.personAPI.dto.PersonDto;
import com.personAPI.model.Person;
import com.personAPI.repository.PersonRepository;
import com.personAPI.service.PersonService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;
    private final ModelMapper modelMapper;

   public PersonServiceImpl(PersonRepository personRepository, ModelMapper modelMapper) {
       this.personRepository = personRepository;
       this.modelMapper = modelMapper;
   }

   public List<PersonDto> getAllPersons() {
       List<Person> persons = personRepository.findAll();
       return persons.stream().map(person -> modelMapper.map(person, PersonDto.class))
               .collect(Collectors.toList());
   }

   public Optional<PersonDto> getPersonById(Long id) {
       Optional<Person> optionalPerson = personRepository.findById(id);
       return optionalPerson.map(person -> modelMapper.map(person, PersonDto.class));
   }

   public PersonDto createPersonDto(PersonDto personDto) {
       Person person = modelMapper.map(personDto, Person.class);
       Person createdPerson = personRepository.save(person);
       return modelMapper.map(createdPerson, PersonDto.class);
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

   public PersonDto updatePersonDto(Long id, PersonDto updatedPersonDto) {
       Optional<Person> optionalPerson = personRepository.findById(id);
       if(optionalPerson.isPresent()) {
           Person person = optionalPerson.get();
           person.setName(updatedPersonDto.getName());
           person.setAge(updatedPersonDto.getAge());
           Person updatedPerson = personRepository.save(person);
           return modelMapper.map(updatedPerson, PersonDto.class);
       }else {
           throw new EntityNotFoundException("Person not found with id " + id);
       }
   }

}
