package com.example.Example_SimpleWebApp.service;

import com.example.Example_SimpleWebApp.constants.EazySchoolConstants;
import com.example.Example_SimpleWebApp.controller.ContactController;
import com.example.Example_SimpleWebApp.model.Contact;
import com.example.Example_SimpleWebApp.repository.ContactRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    /*
    * Save contact services into DB
    * @param contact
    * @param boolean
    */

    public boolean saveMessageDetails(Contact contact) {
        boolean isSaved = false;
        contact.setStatus(EazySchoolConstants.OPEN);
        contact.setCreatedBy(EazySchoolConstants.ANONYMOUS);
        contact.setCreatedAt(LocalDateTime.now());
        int result = contactRepository.saveContactMsg(contact);
        if (result > 0) {
            isSaved = true;
        }
        return isSaved;
    }

    public List<Contact> findMsgsWithOpenStatus() {
        List<Contact> contactMsgs = contactRepository.findMsgsWithStatus(EazySchoolConstants.OPEN);
        return contactMsgs;
    }

    public boolean updateMsgStatus(int contactId, String updatedBy) {
        boolean isUpdate = false;
        int result = contactRepository.updateMsgStatus(contactId, EazySchoolConstants.CLOSE, updatedBy);
        if(result > 0) {
            isUpdate = true;
        }
        return isUpdate;
    }

}
