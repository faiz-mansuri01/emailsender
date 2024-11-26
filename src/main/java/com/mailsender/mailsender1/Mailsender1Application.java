package com.mailsender.mailsender1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class Mailsender1Application {
	
	@Autowired
	private EmailSenderService senderService;

	public static void main(String[] args) {
		SpringApplication.run(Mailsender1Application.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	 public void sendmail() {
		
		senderService.sendEmail("faizmansurias11@gmail.com", 
				                "this is subject ", 
				                "this is body");	
	}

}
