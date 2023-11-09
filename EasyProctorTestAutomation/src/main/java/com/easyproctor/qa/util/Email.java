package com.easyproctor.qa.util;


import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class Email  {

	public static void main(String[] args) throws EmailException {
	/*
        System.out.println("test started========================");
		SimpleEmail email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("kharvi95@gmail.com", "sandokantom2829"));
		email.setSSLOnConnect(true);
		email.setFrom("kharvi95@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("akash.kharvi@excelindia.com");
		email.send();
		System.out.println("test end========================");
		
		*/
		
		
	MultiPartEmail email = new MultiPartEmail();
		email.setHostName("smtp.gmail.com");
		email.setAuthentication("kharvi95@gmail.com", "sandokantom2829");
		email.setDebug(true);
		email.setSmtpPort(465);
		email.setSSLOnConnect(true);
		    
		email.attach(new File("C:\\Users\\akash.kharvi\\workspace\\EasyProctorTestAutomation\\reports\\2022-03-25,020033extentreport.html"));

		email.addTo("akash.kharvi@excelindia.com");

		email.setFrom("kharvi95@gmail.com", "akash kharvi");
		email.setSubject("Test message with attachment");
		email.setMsg("Hey there, here is my file");
		email.send();
		
		
/*		
	       // Recipient's email ID needs to be mentioned.
        String to = "kharvi95@gmail.com";

        // Sender's email ID needs to be mentioned
        String from = "akash.nk06@gmail.com";

        // Assuming you are sending email from through gmails smtp
        String host = "smtp.gmail.com";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        // Get the Session object.// and pass 
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication("akash.nk06@gmail.com", "SANDOKANTOMth14@");

            }

        });
        //session.setDebug(true);
        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("This is the Subject Line!");

            Multipart multipart = new MimeMultipart();

            MimeBodyPart attachmentPart = new MimeBodyPart();

            MimeBodyPart textPart = new MimeBodyPart();

            try {

                File f =new File("C:\\Users\\akash.kharvi\\workspace\\EasyProctorTestAutomation\\reports\\2022-03-25,020033extentreport.html");

                attachmentPart.attachFile(f);
                textPart.setText("This is text");
                multipart.addBodyPart(textPart);
                multipart.addBodyPart(attachmentPart);

            } catch (IOException e) {
            	
                e.printStackTrace();

            }

            message.setContent(multipart);

            System.out.println("sending...");
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }

    }


*/		
	}
		
		
		
		}
		
	

