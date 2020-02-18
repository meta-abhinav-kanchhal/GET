package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.mail.MockMailSender;
import com.example.demo.mail.SmtpMailSender;

@Configuration
public class AppConfig {
	@Bean("mock")
	public MockMailSender mockmailsender() {
		return new MockMailSender();
	}
	@Bean("smtp")
	public SmtpMailSender smtpmailsender() {
		return new SmtpMailSender();
	}

}
