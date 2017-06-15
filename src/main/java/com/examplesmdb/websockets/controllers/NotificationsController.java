package com.examplesmdb.websockets.controllers;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.examplesmdb.websockets.dtos.Notification;


@Controller
public class NotificationsController {
	
	@MessageMapping("/sendNotification/{room}")
    @SendTo("/notifications")
	public Notification sendNotification(@DestinationVariable String room,Notification inNotification){
	
		Notification outNotification = null;
		try {
			outNotification = new Notification();
			outNotification.setTitle(inNotification.getTitle());
			outNotification.setContent(inNotification.getContent());
			outNotification.setDate(inNotification.getDate());
			outNotification.setUser(inNotification.getUser());
			outNotification.setRoom(room);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return outNotification;
	}

}
