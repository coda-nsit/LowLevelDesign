package Questions.Logging;

public class client {

    public static void main(String args [] ){
        Formatter formatter = new StringFormater();
        Appender appender = new ConsoleAppender(formatter);
        Logger logger = new Logger(LogLevel.DEBUG);
        logger.addAppender(appender);
        logger.addAppender(new FileAppender("app1.log", formatter));

        logger.info("Application started");
        logger.error("Something went wrong");
    }
}
