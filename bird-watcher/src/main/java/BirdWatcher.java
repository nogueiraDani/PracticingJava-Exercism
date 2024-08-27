class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int i : birdsPerDay) {
            if (i == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int birds = 0;
        if (numberOfDays <= 7) {
            for (int i = 0; i < numberOfDays; i++) {
                birds += birdsPerDay[i];
            }
        } else {
            for (int i = 0; i < 7; i++) {
                birds += birdsPerDay[i];
            }
        }
        return birds;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int i : birdsPerDay) {
            if (i >= 5) {
                busyDays ++;
            }
        }
        return busyDays;
    }
}
