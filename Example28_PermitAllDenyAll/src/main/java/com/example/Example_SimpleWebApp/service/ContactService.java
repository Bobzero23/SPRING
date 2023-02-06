package com.example.Example_SimpleWebApp.service;

import com.example.Example_SimpleWebApp.controller.ContactController;
import com.example.Example_SimpleWebApp.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Slf4j
@Service
//@RequestScope
//@SessionScope
@ApplicationScope
public class ContactService {

    private int counter = 0;

    public ContactService() {
        System.out.println("Contact Service bean initialized..");
    }
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

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
