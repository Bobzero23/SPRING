package com.personAPI.impl;

import com.personAPI.dto.PersonDto;
import com.personAPI.model.Person;
import com.personAPI.reposistory.PersonRepository;
import com.personAPI.service.PersonService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

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

    @Override
    public PersonDto createPerson(PersonDto personDto) {
        Person person = modelMapper.map(personDto, Person.class);
        Person createdPerson = personRepository.save(person);
        return modelMapper.map(createdPerson, PersonDto.class);
    }

    @Override
    public List<PersonDto> getAllPersons() {
        List<Person> personList = personRepository.findAll();
        List<PersonDto> personDtoList = personList.stream().map(person -> modelMapper.map
                (person, PersonDto.class)).collect(Collectors.toList());
        return personDtoList;
    }

    @Override
    public Optional<PersonDto> getPersonById(long id) {
        Optional<Person> optionalPerson = personRepository.findById(id);
        return optionalPerson.map(person -> modelMapper.map(person, PersonDto.class));
    }

    @Override
    public PersonDto updatePerson(long id) {
        return null;
    }

    @Override
    public boolean deletePerson(long id) {
        return false;
    }
}
