public class ProductionRemoteControlCar implements RemoteControlCar,
        Comparable<ProductionRemoteControlCar> {

    private int distance;
    private int vitories;

    public void drive() {
        this.distance += 10;
    }

    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return vitories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.vitories = numberOfVictories;
    }


    @Override
    public int compareTo(ProductionRemoteControlCar car) {
        return Integer.compare(this.vitories, car.vitories);
    }
}
