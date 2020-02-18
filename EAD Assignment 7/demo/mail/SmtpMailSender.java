package com.example.demo.mail;

import org.springframework.stereotype.Component;

@Component("smtpMail")
public  class SmtpMailSender implements MailSender {
	@Override
	public void mailSender()
	{
		System.out.println("sending smtp mail");
	}

}
