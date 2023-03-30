package com.personAPI.service;

import com.personAPI.dto.PersonDto;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    PersonDto createPerson(PersonDto personDto);
    List<PersonDto> getAllPersons();
    Optional<PersonDto> getPersonById(long id);
    PersonDto updatePerson(long id);
    boolean deletePerson(long id);

}
