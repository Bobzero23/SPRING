package bean9_wiring1_methodCall;

/*bean class*/
public class Person {

    /*creating fields*/
    private String name;
    private Vehicle vehicle;

    /*constructor*/
    public Person(){
        System.out.println("Person bean created by Spring");
    }

    /*getter*/
    public String getName(){
        return name;
    }

    /*setter*/
    public void setName(String name){
        this.name = name;
    }

    /* just a method*/
    public void method(){
        System.out.println("Method from Person class");
    }


}
