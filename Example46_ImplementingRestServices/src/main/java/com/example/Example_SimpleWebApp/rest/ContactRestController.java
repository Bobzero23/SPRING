package com.example.Example_SimpleWebApp.rest;

import com.example.Example_SimpleWebApp.model.Contact;
import com.example.Example_SimpleWebApp.model.Response;
import com.example.Example_SimpleWebApp.repository.ContactRepository;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
/*@Controller*/
@RestController
@RequestMapping(path = "/api/contact")
public class ContactRestController {

    @Autowired
    ContactRepository contactRepository;

    @GetMapping("/getMessagesByStatus")
    /*@ResponseBody*/
    public List<Contact> getMessagesByStatus(@RequestParam(name = "status") String status) {
        return contactRepository.findByStatus(status);
    }

    @GetMapping("/getAllMsgsByStatus")
   /* @ResponseBody*/
    public List<Contact> getAllMsgssByStatus(@RequestBody Contact contact) {
        if (null != contact && null != contact.getStatus()) {
            return contactRepository.findByStatus(contact.getStatus());
        }else {
            return List.of();
        }
    }

    @PostMapping("/saveMsg")
    public ResponseEntity<Response> saveMsg(@RequestHeader("invocationFrom") String invocationFrom,
                                            @Valid @RequestBody Contact contact) {
        log.info(String.format("Header invocationFrom = %s", invocationFrom));
        contactRepository.save(contact);
        Response response = new Response();
        response.setStatusCode("200");
        response.setStatusMsg("Message saved successfully");
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .header("isMsgSaved", "true")
                .body(response);
    }

    @DeleteMapping("/deleteMsg")
    public ResponseEntity<Response> deleteMsg(RequestEntity<Contact> requestEntity) {
        HttpHeaders headers = requestEntity.getHeaders();
        headers.forEach((key, value) -> {
            log.info(String.format(
                    "Header '%s' = '%s'", key, value.stream().collect(Collectors.joining("|"))));
        });
        Contact contact = requestEntity.getBody();
        contactRepository.deleteById(contact.getContactId());
        Response response = new Response();
        response.setStatusCode("200");
        response.setStatusMsg("Message Successfully Deleted");
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(response);
    }
}
