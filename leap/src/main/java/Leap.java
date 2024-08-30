class Leap {

    boolean isLeapYear(int year) {
        boolean divisibleby4 = year % 4 == 0;
        boolean divisibleby100 = year % 100 == 0;
        boolean divisibleby400 = year % 400 == 0;

        /*
        if (divisibleby4 && !divisibleby100) {
            return true;
        } else if (divisibleby4) {
            return divisibleby400;
        } else {
            return false;
        }*/

        return (divisibleby4 && !divisibleby100 || (divisibleby4 && divisibleby400));
    }
}
