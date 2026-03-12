package Questions.NotificationSystem;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        Notification notification = new Notification("baishali@gmail.com", "How are you");
        NotificationService service = new NotificationService();
        service.send(notification, Arrays.asList("SMS", "WHATSAPP"));
    }
}
