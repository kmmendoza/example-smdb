package com.examplesmdb.websockets.controllers;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.examplesmdb.websockets.dtos.InMessage;
import com.examplesmdb.websockets.dtos.OutMessage;

@Controller
public class ChatController {
	
	/**
	 * 
	 * @param message
	 * @return
	 * @throws Exception
	 */
	@MessageMapping("/sendMessage/{room}")
    @SendTo("/uichat")
	public OutMessage sendChatMessage(@DestinationVariable String room, InMessage message) throws Exception{
		
		OutMessage outMessage = null;		
		
		try {
			outMessage = new OutMessage();
			outMessage.setMessage("Hello form back" + message.getMessage());
			outMessage.setIpmo(room);
		} catch (Exception e) {
			// TODO: handle exception
		}			
		return outMessage;		
	}
	
}
