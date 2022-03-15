package VehicleInterface;

public class ThreeWheeler extends LandVehicle{

    public ThreeWheeler(int gears, String name, boolean engine) {
        super(3, gears, "Handle", name, engine);
    }

    @Override
    public void start() {
        if(hasEngine()) {
            System.out.println("Key inserted and rotated");
        }
        super.start();
    }

    @Override
    public void stop() {
        if (hasEngine()) {
            System.out.println("Key rotated");
            super.stop();
            System.out.println("Key removed");
        }
        super.stop();
    }
}
