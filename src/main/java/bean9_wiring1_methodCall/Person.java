package bean9_wiring1_methodCall;

/*pojo class*/
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

    /*getting the vehicle*/
    public Vehicle getVehicle(){
        return vehicle;
    }

    /*setting the vehicle*/
    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }


}
