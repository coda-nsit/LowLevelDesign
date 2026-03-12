package Questions.NotificationSystem;

public class SMSNotification implements NotificationChannel {
    @Override
    public void sendMessage(Notification notification) {
        System.out.println("Sending SMS notification to " + notification.getRecipient());
        System.out.println("Message: " + notification.getMessage());
    }
}
