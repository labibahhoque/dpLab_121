public class NotificationManager {
    private INotificationService notificationService;
    public NotificationManager(INotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public void send(String message) {
        notificationService.sendNotification(message);
    }
}
