public class LogLine {

    private String logLevel;

    public LogLine(String logLine) {
        this.logLevel = logLine;
    }

    public LogLevel getLogLevel() {
        String[] subs = logLevel.split(": ");
        String sub = subs[0]
                .replace("[", "")
                .replace("]", "");
        return switch (sub){
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        String[] subs = logLevel.split(": ");
        LogLevel log = getLogLevel();
        return log.getNumberLogLevel() + ":" + subs[1];
    }
}
