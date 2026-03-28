package Questions.Logging;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private List<Appender> appenders = new ArrayList<>();
    private LogLevel level;

    public Logger(LogLevel level) {
        this.level = level;
    }
    public void addAppender(Appender appender) {
        appenders.add(appender);
    }
    public void removeAppender(Appender appender) {
        appenders.remove(appender);
    }

    public void log(LogLevel level, String message) {
        if(level.ordinal() >= this.level.ordinal()) {
            LogMessage msg = new LogMessage(message, level);
            for(Appender appender : appenders) {
                appender.append(msg);
            }
        }


    }
    // convenience methods
    public void info(String msg) { log(LogLevel.INFO, msg); }
    public void debug(String msg) { log(LogLevel.DEBUG, msg); }
    public void error(String msg) { log(LogLevel.ERROR, msg); }
}
