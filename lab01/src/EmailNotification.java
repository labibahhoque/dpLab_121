public class EmailNotification implements INotificationService {
    public void sendNotification(String message){
        System.out.println("Email: " + message);
    }
}
