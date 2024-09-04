class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String numString = Integer.toString(numberToCheck);
        int[] numArray =
                numString.chars().map(c -> Character.getNumericValue((char) c)).toArray();

        int result = 0;
        for (int number : numArray) {
            result += (int)Math.pow(number, numArray.length);
        }
        return result == numberToCheck;
    }

}
