package D.Correct;

public class FacebookService implements MessageService {
    @Override
    public void sendMessage() {
        System.out.println("Sending Facebook text");
    }
}
