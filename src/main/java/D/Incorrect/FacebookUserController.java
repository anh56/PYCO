package D.Incorrect;

public class FacebookUserController {
    FacebookService service;
    // here we see an violation of DI, since this Controller will depend on the FacebookService to first be created

    public FacebookUserController(){
        service = new FacebookService();
    }
    public void send(){
        service.sendMessage();
    }
}

