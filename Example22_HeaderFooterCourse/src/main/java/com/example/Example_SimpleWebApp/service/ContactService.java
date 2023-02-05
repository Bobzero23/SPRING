package com.example.Example_SimpleWebApp.service;

import com.example.Example_SimpleWebApp.controller.ContactController;
import com.example.Example_SimpleWebApp.model.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private static Logger log =  LoggerFactory.getLogger(ContactService.class);

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
