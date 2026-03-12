package Questions.NotificationSystem;

public class WhatsappNotification implements NotificationChannel {
    @Override
    public void sendMessage(Notification notification) {
        System.out.println("Sending Whatsapp notification to " + notification.getRecipient());
        System.out.println("Message: " + notification.getMessage());
    }
}
