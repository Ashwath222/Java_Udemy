package VehicleInterface;

public class TwoWheeler extends LandVehicle{

    public TwoWheeler(int gears, String name, boolean engine) {
        super(2, gears, "Handle", name, engine);
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
        if(hasEngine()) {
            System.out.println("Key rotated");
            super.stop();
            System.out.println("key removed");
        }
        super.stop();
    }
}
