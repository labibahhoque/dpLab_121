public class NotificationService {
    private Notification notification;

    public NotificationService(Notification notification) {
        this.notification = notification;
    }

    public void notifyUser( String message) {
        notification.send( message);
    }
}
