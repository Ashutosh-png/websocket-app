package com.workshop.Controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

	@MessageMapping("/sendMessage")
	@SendTo("/topic/messages")
	public String sendMessage(String message) {
	    System.out.println("Received message on the server: " + message);
	    return message;
	}

	
}
