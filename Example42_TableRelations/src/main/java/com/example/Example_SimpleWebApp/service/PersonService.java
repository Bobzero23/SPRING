package com.example.Example_SimpleWebApp.service;

import com.example.Example_SimpleWebApp.constants.EazySchoolConstants;
import com.example.Example_SimpleWebApp.model.Person;
import com.example.Example_SimpleWebApp.model.Roles;
import com.example.Example_SimpleWebApp.repository.PersonRepository;
import com.example.Example_SimpleWebApp.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private RolesRepository rolesRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public boolean createNewPerson(Person person) {
        boolean isSaved = false;
        Roles role = rolesRepository.getByRoleName(EazySchoolConstants.STUDENT_ROLE);
        person.setRoles(role);
        person.setPwd(passwordEncoder.encode(person.getPwd())); //encoding the password
        person = personRepository.save(person);
        if (null != person && person.getPersonId() > 0) {
            isSaved = true;
        }
        return isSaved;
    }
}
