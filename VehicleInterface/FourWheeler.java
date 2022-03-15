package VehicleInterface;

public class FourWheeler extends LandVehicle{

    private final String start;

    public FourWheeler(int gears, String name, String start) {
        super(4, gears, "Steering Wheel", name, true);
        this.start = start.toLowerCase();
    }

    @Override
    public void start() {
        if(start.equals("key")) {
            System.out.println("Key inserted");
        }
        else {
            System.out.println(("Button pressed"));
        }
        super.start();
    }

    @Override
    public void stop() {
        if(start.equals("button")) {
            System.out.println("Button pressed");
        }
        else {
            System.out.println("Key rotated");
        }
        super.stop();
        if(start.equals("key")) {
            System.out.println("key removed");
        }
    }
}
