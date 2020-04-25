package D.Correct;

public class FacebookUserController {
    MessageService messageService;
    public FacebookUserController(MessageService messageService){
        this.messageService = messageService;
    }

    public void send(){
        messageService.sendMessage();
    }
}
