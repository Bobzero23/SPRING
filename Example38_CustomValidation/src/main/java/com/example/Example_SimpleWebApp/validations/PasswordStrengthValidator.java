package com.example.Example_SimpleWebApp.validations;

import com.example.Example_SimpleWebApp.annotations.PasswordValidator;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

public class PasswordStrengthValidator implements ConstraintValidator<PasswordValidator, String>{
    List<String> weakPasswords;

    @Override
    public void initialize(PasswordValidator passwordValidator) {
        ConstraintValidator.super.initialize(passwordValidator);
        weakPasswords = Arrays.asList("12345", "password", "qwerty");
    }

    @Override
    public boolean isValid(String PasswordField, ConstraintValidatorContext context) {
        return false;
    }
}
