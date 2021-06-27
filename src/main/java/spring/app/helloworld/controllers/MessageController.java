package spring.app.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MessageController {

    @RequestMapping("/")
    @ResponseBody
    String displayMessage() {
        return "Hello World!";
    }
    


}