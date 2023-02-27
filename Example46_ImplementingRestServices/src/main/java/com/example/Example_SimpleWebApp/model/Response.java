package com.example.Example_SimpleWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor /*creates the constructor for the fields*/
@NoArgsConstructor /*set constructor with no input parameters*/
public class Response {
    private String statusCode;
    private String statusMsg;
}
