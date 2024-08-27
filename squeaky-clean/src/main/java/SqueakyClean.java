import static java.lang.Character.*;

class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder newString = new StringBuilder();
        boolean kebab = false;
        for (char c : identifier.toCharArray()) {
            if (isWhitespace(c)) {
                newString.append('_');
            } else if (isDigit(c)) {
                if (c == '4') {
                    newString.append('a');
                } else if (c == '3') {
                    newString.append('e');
                } else if (c == '0') {
                    newString.append('o');
                } else if (c == '1') {
                    newString.append('l');
                } else if (c == '7') {
                    newString.append('t');
                }
            } else if (!isLetter(c) && !isDigit(c)) {
                kebab = c == '-';
            } else if (kebab) {
                newString.append(toUpperCase(c));
                kebab = false;
            } else {
                newString.append(c);
            }
        } return newString.toString();
    }
}

