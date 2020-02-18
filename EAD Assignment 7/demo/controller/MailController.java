package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mail.MailSender;
@RestController
public class MailController {
    @Autowired
  //  @Qualifier("smtpMail")
	private MailSender mock;
//	@Autowired
//	public MailController(MailSender send)
//	{
//		this.send=send;
//	}
//	@Autowired
//	public void SetMailController(MailSender send)
//	{
//		this.send=send;
//	}
	
	@GetMapping("/send") 
	public String test() {
			mock.mailSender();
		return "sent";
	}
	
}
