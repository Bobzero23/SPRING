package com.example.Example_SimpleWebApp.service;

import com.example.Example_SimpleWebApp.controller.ContactController;
import com.example.Example_SimpleWebApp.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@Slf4j
@Service
public class ContactService {


    /*
    * Save contact services into DB
    * @param contact
    * @param boolean
    */

    public boolean saveMessageDetails(Contact contact) {
        boolean isSaved = true;
        //TODO - Need to persist the data into DB table
        log.info(contact.toString());
        return isSaved;
    }

}
