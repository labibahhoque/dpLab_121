public class Email implements Notification{
    public void send(String message){
        System.out.println("Email sent : " + message);
    }
}