package bean5_component_annotation;

/*The field class which is gonna be our component*/

/*imports*/
import org.springframework.stereotype.Component;

import javax.lang.model.util.AbstractElementVisitor8;
import javax.lang.model.util.SimpleTypeVisitor8;

@Component
public class Vehicle {

    /*creating the field*/
    private String name;

    /*getter*/
    public String getName(){
        return name;
    }

    /*setter*/
    public void setName(String name){
        this.name = name;
    }

    /*creating a method to print What's up Bob*/
    public void method(){
        System.out.println("What's up Bobzero!!");
    }
}
