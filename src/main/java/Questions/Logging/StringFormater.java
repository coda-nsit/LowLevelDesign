package Questions.Logging;

public class StringFormater implements Formatter {
    @Override
    public String format(LogMessage message) {
        return message.getTimestamp() + " [" + message.getLevel() + "] " + message.getMessage();
    }
}
