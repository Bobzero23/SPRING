package com.example.Example_SimpleWebApp.validations;

import com.example.Example_SimpleWebApp.annotations.FieldsValueMatch;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.BeanWrapperImpl;

public class FieldsValueMatchValidator implements ConstraintValidator <FieldsValueMatch, Object> {
    // I mentioned object because I want to use two fields of the class and not only one

    public String field;
    public String fieldMatch;


    @Override
    public void initialize(FieldsValueMatch constraintAnnotation) {
        // we've also mentioned this two fields method in the interface we are creating annotations
        this.field = constraintAnnotation.field();
        this.fieldMatch = constraintAnnotation.fieldMatch();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        // here we're just getting the values written in the fields
        Object fieldValue = new BeanWrapperImpl(value).getPropertyValue(field);
        Object fieldMatchValue = new BeanWrapperImpl(value).getPropertyValue(fieldMatch);

        /**we commented this code because we were validating twice*/
        // condition to check if they match
        /*if (fieldValue != null) {
            if (fieldValue.toString().startsWith("$2a")){
                return true;
            }else {
                return fieldValue.equals(fieldMatchValue);
            }
        }else {
            return fieldMatchValue == null;
        }*/

        if (null != fieldValue) {
            return fieldValue.equals(fieldMatchValue);
        }else {
            return fieldMatchValue == null;
        }
    }
}
