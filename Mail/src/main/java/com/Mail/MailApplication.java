package com.Mail;

import com.Mail.email.GMailer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class MailApplication {

	public static void main(String[] args) {
		GMailer mail = new GMailer();
		String to="kacchutam@gmail.com";
		String from= "acchutamkulthe.java@gmail.com";
		String subject = "testing java mailer ";
		String text ="Implementation of java mailer is successful";
		File file = new File("E:\\TRAINING\\Mailer\\Mail\\Mail.file");
		boolean success = mail.sendMessageWithAttachment(to,from,subject,text,file);
		SpringApplication.run(MailApplication.class, args);
		if(success)
		{
			System.out.println("Mail successful");
		}
		else
			System.out.println("Mail unsuccessful");
	}

}
