package D.Incorrect;

public class Main {
    public static void main(String[] args){
        EmailUserController emailUserController = new EmailUserController();
        emailUserController.send();

        FacebookUserController facebookUserController = new FacebookUserController();
        facebookUserController.send();
    }
}
