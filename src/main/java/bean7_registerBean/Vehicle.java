package bean7_registerBean;

/*A field class*/
public class Vehicle {

    /*creating a field*/
    private String name;

    /*getter*/
    public String getName(){
        return name;
    }

    /*setter*/
    public void setName(String name){
        this.name = name;
    }

    /*Normal method to print something*/
    public void method(){
        System.out.println("This is from register Bean..");
    }
}
