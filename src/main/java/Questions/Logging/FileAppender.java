package Questions.Logging;

import java.io.FileWriter;
import java.io.IOException;

public class FileAppender implements Appender {
    Formatter formatter;
    String filepath;

    public FileAppender(String filepath, Formatter formatter) {
        this.formatter = formatter;
        this.filepath = filepath;
    }
    @Override
    public void append(LogMessage message) {
        try (FileWriter fw = new FileWriter(filepath, true)) {
            fw.write(formatter.format(message) + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
