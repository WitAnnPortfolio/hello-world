package spring.app.helloworld.implementations;

import spring.app.helloworld.interfaces.MessageService;

public class Message implements MessageService {
    @Override
    public String displayMessage() {
        return "Hello World!";
    }
}
