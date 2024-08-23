public class Lasagna {

    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int minutes) {
        totalTime = expectedMinutesInOven();
        return totalTime - minutes;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    int totalTime = expectedMinutesInOven();

    public int totalTimeInMinutes(int layers, int minutes) {
        int timeToPreparation = preparationTimeInMinutes(layers);
        return minutes + timeToPreparation;
    }
}
