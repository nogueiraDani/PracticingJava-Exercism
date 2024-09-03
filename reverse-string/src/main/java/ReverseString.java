class ReverseString {

    String reverse(String inputString) {
        StringBuilder reverseString = new StringBuilder(inputString);
        return reverseString.reverse().toString();
    }
}
