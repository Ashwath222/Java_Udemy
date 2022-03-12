package Polymorphism;

public class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return "Mitsubishi Engine is starting";
    }

    public String accelerate() {
        return "Mitsubishi is accelerating";
    }

    public String brake() {
        return "Mitsubishi is braking";
    }
}
