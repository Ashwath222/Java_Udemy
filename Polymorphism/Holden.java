package Polymorphism;

public class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return "Holden Engine is starting";
    }

    public String accelerate() {
        return "Holden is accelerating";
    }

    public String brake() {
        return "Holden is braking";
    }
}
