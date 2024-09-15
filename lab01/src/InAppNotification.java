public class InAppNotification implements INotificationService{
    public void sendNotification(String message){
        System.out.println("In-App: " + message);
    }
}
