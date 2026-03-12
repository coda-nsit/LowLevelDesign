package Questions.NotificationSystem;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    public void send(Notification notification, List<String> channels){
        for(String channel : channels){
            NotificationChannel notificationChannel = NotificationFactory.getChannel(channel);
            notificationChannel.sendMessage(notification);
        }
    }
}
