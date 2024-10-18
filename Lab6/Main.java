public class Main {
    public static void main(String[] args) {
        Notification emailNotification = new Email();
        Notification smsNotification =  new SMS();
        
        PostalMailAPI postalMailAPI = new PostalMailAPI();
        Notification postalMailNotification = new PostalMailAdapter(postalMailAPI,"90210");

        NotificationService service = new NotificationService(emailNotification);
        service.notifyUser( "This is an email notification.");

        service = new NotificationService(smsNotification);
        service.notifyUser( "This is an SMS notification.");

        service = new NotificationService(postalMailNotification);
        service.notifyUser(" This is a postal mail notification.");
    }
}
