package VehicleInterface;

public class Main {
    public static void main(String[] args) {
        LandVehicle bicycle = new TwoWheeler(6 ,"Hero", false);
        bicycle.stop();
        bicycle.start();
        bicycle.idle();
        bicycle.stop();

        Vehicle car = new FourWheeler(6,"Mitsubishi","button");
        car.stop();
        car.idle();
        car.start();
        car.idle();
        car.stop();
    }
}
