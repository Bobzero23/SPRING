package bean9_wiring1_methodCall;

/*bean class*/
public class Vehicle {

    /*field*/
    private String name;

    /*constructor*/
    public Vehicle(){
        System.out.println("Vehicle bean created by Spring");
    }

    /*getter*/
    public String getName() {
        return name;
    }

    /*setter*/
    public void setName(String name) {
        this.name = name;
    }

    /*just a method*/
    public  void method(){
        System.out.println("Method from Vehicle class");
    }

    /*to String method*/
    @Override
    public String toString() {
     return "Vehicle name is: " + name;
    }
}
