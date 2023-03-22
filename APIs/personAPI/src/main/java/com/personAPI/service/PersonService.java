package com.personAPI.service;

import com.personAPI.dto.PersonDto;


import java.util.List;
import java.util.Optional;

public interface PersonService {
    List<PersonDto> getAllPersons();
    Optional<PersonDto> getPersonById(Long id);
    PersonDto createPersonDto(PersonDto personDto);
    boolean deletePerson(Long id);

    PersonDto updatePersonDto(Long id, PersonDto updatedPersonDto);
}
