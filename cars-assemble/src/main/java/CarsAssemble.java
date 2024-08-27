public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double pattern = 221;
        if (speed >= 1 && speed <= 4) {
            return pattern * speed;
        } else if (speed >= 5 && speed <= 8) {
            return (pattern * speed) * 0.9;
        } else if (speed == 9) {
            return (pattern * speed) * 0.8;
        } else if (speed == 10) {
            return (pattern * speed) * 0.77;
        } else {
            return 0;
        }
    }

    public int workingItemsPerMinute(int speed) {
        double carsPerHour = productionRatePerHour(speed);
        return  (int) (carsPerHour / 60);
    }
}
