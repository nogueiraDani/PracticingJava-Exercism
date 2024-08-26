public class LogLevels {

    public static String message(String logLine) {
        String[] subs = logLine.split(": ");
        return subs[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] subs = logLine.split(": ");
        return subs[0]
                .replace("[", "")
                .replace("]", "")
                .toLowerCase();
    }

    public static String reformat(String logLine) {
        String message = message(logLine);
        String error = logLevel(logLine);
        //return String.format("%s (%s)", message, error);
        return message + " (" + error + ")";
    }
}
