package com.qa.producer.service;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

	private JmsTemplate jms;

	public MessageService(JmsTemplate jms) {
		super();
		this.jms = jms;
	}
	
	public void sendMessage(String message) {
		this.jms.convertAndSend("hello-q",message);
	}
}
