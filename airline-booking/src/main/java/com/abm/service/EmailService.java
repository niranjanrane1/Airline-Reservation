//Writer Pritam Rajendra Chaphekar.


package com.abm.service;

import java.util.Properties;


import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	
public boolean sendEmail(String subject, String message, String to) {
	
	boolean f=false;
	
	String from = "flightreservation187@gmail.com";
	String host= "smtp.gmail.com";
	
	//get the system properties
	Properties properties = System.getProperties();
	System.out.println("PROPERTIES " + host);
	
	
	//host s
	properties.put("mail.smtp.host", host);
	properties.put("mail.smtp.port", "465");
	properties.put("mail.smtp.ssl.enable", true);
	properties.put("mail.smtp.auth", true);
	
	Session session=Session.getInstance(properties, new Authenticator() {
		@Override
		protected PasswordAuthentication getPasswordAuthentication() {
			  return new PasswordAuthentication("flightreservation187@gmail.com", "tfmynpptihrydniy");
		}
	});
	
	session.setDebug(true);
	
	// step 2
	
	MimeMessage m = new MimeMessage(session);
	
	try {
		//from email
		m.setFrom();
		
		m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
		
		
		//adding subject to messsege
		m.setSubject(subject);
		
		
		//m.setText(message);
		m.setContent(message,"text/html");
		
		
		Transport.send(m);
		
		System.out.println("Sent success.................");
		f = true;
		
	}catch (Exception e) {
		e.printStackTrace();
	
	}
	return f;
	}
}

