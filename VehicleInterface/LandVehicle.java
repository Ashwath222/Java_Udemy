package VehicleInterface;

public abstract class LandVehicle implements Vehicle{
    private final int  wheels, gears;
    private final String handle, name;
    private final boolean engine;   //some vehicles have engines but bicycles for example don't
    private boolean engineOn, isIdle;

    public boolean hasEngine() {
        return engine;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    public void setEngineOn(boolean engineOn) {
        this.engineOn = engineOn;
    }

    public LandVehicle(int wheels, int gears, String handle, String name, boolean engine) {
        this.wheels = wheels;
        this.gears = gears;
        this.handle = handle;
        this.name = name;
        this.engine = engine;
        this.engineOn = false;
        this.isIdle = false;
    }

    @Override
    public void start() {
        if(engine) {
            if(!engineOn) {
                setEngineOn(true);
                System.out.println(name + " has started");
            }
            else {
                if(isIdle) {
                    isIdle = false;
                    System.out.println(name + " has started from idle");
                }
                else {
                    System.out.println(name + " is already in a start position");
                }
            }
        }
        else {
            System.out.println(name + " has started");
        }
    }

    @Override
    public void stop() {
        if(engine) {
            if (engineOn) {
                setEngineOn(false);
                isIdle = false;
                System.out.println(name + " has stopped");
            }
            else {
                System.out.println(name + " is already in a stop position");
            }
        }
        else {
            System.out.println(name + " has stopped");
        }
    }

    @Override
    public void idle() {
        if(engine) {
            if (engineOn) {
                isIdle = true;
                System.out.println(name + " is in idle");
            } else {
                System.out.println(name + "'s engine is off, cannot be idle");
            }
        }
        else {
            System.out.println(name + " is in idle");
        }
    }
}
