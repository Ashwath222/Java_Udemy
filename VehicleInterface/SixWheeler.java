package VehicleInterface;

public class SixWheeler extends LandVehicle{

    public SixWheeler(int gears, String name) {
        super(6, gears, "Steering Wheel", name, true);
    }

    @Override
    public void start() {
        System.out.println("Key inserted and rotated");
        super.start();
    }

    @Override
    public void stop() {
        System.out.println("Key rotated");
        super.stop();
        System.out.println("Key removed");
    }
}
