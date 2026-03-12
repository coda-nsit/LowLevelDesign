package Questions.NotificationSystem;

public class NotificationFactory {
    public static NotificationChannel getChannel(String type) {
        NotificationChannel notificationChannel = null;
        if (type.equalsIgnoreCase("whatsapp")) {
            return new WhatsappNotification();
        }
        else if (type.equalsIgnoreCase("sms")) {
            return new SMSNotification();
        }else {
            throw new IllegalArgumentException("Invalid notification type");
        }
    }
}
