class NeedForSpeed {

    private final int speed;
    private int initialBattery = 100;
    private final int batteryDrain;

    private int distanceDriven;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public int getSpeed() {
        return speed;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }

    public int getInitialBattery() {
        return initialBattery;
    }

    public boolean batteryDrained() {
        return initialBattery < batteryDrain;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (initialBattery >= batteryDrain) {
            distanceDriven += speed;
            initialBattery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {

    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        float meters = (float) distance / car.getSpeed();
        float battery = (float) car.getInitialBattery() / car.getBatteryDrain();
        return battery >= meters;
    }
}