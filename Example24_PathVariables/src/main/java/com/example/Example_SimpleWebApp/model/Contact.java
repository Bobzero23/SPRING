package com.example.Example_SimpleWebApp.model;


import lombok.Data;

@Data
public class Contact {
    private String name;
    private String mobileNum;
    private String email;
    private String subject;
    private String message;

}
