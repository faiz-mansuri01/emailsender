package com.mailsender.mailsender1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class EmailSenderService {
	@Autowired
	private JavaMailSender mailsender;
	
	public void sendEmail( String toEmail,
			               String subject ,
			               String body ) {
		SimpleMailMessage message =new SimpleMailMessage();
		message.setFrom ("your mail");
		message.setTo(toEmail);
		message.setText(body);
		message.setSubject(subject);
		
		mailsender.send (message);
		
		System.out.println("mail send successfully....");
	}
	
	                     
}
