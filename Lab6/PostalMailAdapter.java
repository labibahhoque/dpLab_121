public class PostalMailAdapter implements Notification {
    private PostalMailAPI postalMailAPI;
    private String postalCode;
    public PostalMailAdapter(PostalMailAPI postalMailAPI,String postalCode){
        this.postalMailAPI=postalMailAPI;
        this.postalCode=postalCode;
    }
    public void send( String message) {
        postalMailAPI.sendPostalMail( postalCode, message);
    }
}
