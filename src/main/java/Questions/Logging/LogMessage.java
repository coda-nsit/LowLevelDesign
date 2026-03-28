package Questions.Logging;

import java.util.Date;

public class LogMessage {
    private String message;
    private LogLevel level;
    private long timestamp;;

    public LogMessage(String message, LogLevel level) {
        this.message = message;
        this.level = level;
        this.timestamp = System.currentTimeMillis();
    }
    public String getMessage() { return message; }
    public LogLevel getLevel() { return level; }
    public long getTimestamp() { return timestamp; }
}
