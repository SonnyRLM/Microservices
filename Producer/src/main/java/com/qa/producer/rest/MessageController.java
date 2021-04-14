package com.qa.producer.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.producer.service.MessageService;

@RestController
public class MessageController {

	private MessageService service;

	public MessageController(MessageService service) {
		super();
		this.service = service;
	}
	
	@PutMapping("addToQ/{message}")
	public void addToQ(@PathVariable String message) {
		this.service.sendMessage(message);
	}
}
