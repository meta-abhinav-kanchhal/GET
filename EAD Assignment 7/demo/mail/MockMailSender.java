package com.example.demo.mail;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("mockMail")
@Primary
public class MockMailSender implements MailSender {
	@Override
	public void mailSender()
	{
		System.out.println("using mock mail");
	}


}
