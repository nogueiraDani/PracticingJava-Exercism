import java.util.Comparator;
import java.util.List;

public class TestTrack implements Comparator<ProductionRemoteControlCar> {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        TestTrack test = new TestTrack();
        cars.sort(test);
        return cars.reversed();
    }

    @Override
    public int compare(ProductionRemoteControlCar o1, ProductionRemoteControlCar o2) {
        return o1.compareTo(o2);
    }

    @Override
    public Comparator<ProductionRemoteControlCar> reversed() {
        return Comparator.super.reversed();
    }
}
