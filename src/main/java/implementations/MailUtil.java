package implementations;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import registration.Registration_TestSuite;



public class MailUtil {
public static void sendMail(String console, String TestID,String TestName ) {
		
		Session session = getMaiSession();
		
		try {
		  Message msg = new MimeMessage(session);
		  msg.setFrom(new InternetAddress("gajelli.p@awax.co.uk", "Registration_TestSuite"));
		  msg.addRecipient(Message.RecipientType.TO, new InternetAddress("gajelli.pallavi@gmail.com"));
		  String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		  msg.setSubject("!!!Alert!!! Critical : "+TestID+ "-->"+TestName+ " --Failed--\t TimeStamp:" +timeStamp);
		  msg.setText("A Critical Test Case Failed\n\n" +TestID+ " : " +TestName+ "\n\n Error Details: \n" +console);
		  
		  Transport.send(msg);
		} catch (AddressException e) {
			System.err.println("Address Exception: " + e);
		} catch (MessagingException e) {
			System.err.println("Message Exception : " + e);
		} catch (UnsupportedEncodingException e) {
			System.err.println("Exception : " + e);

		}
	}
	
public static void sendConsolidatedReport() {
		
		Session session = getMaiSession();
		
		try {
			Message msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress("gajelli.p@awax.co.uk", "Registration_TestSuite"));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress("gajelli.pallavi@gmail.com"));
			String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
			msg.setSubject("Alert:'Critical:Login Failed'\t" + timeStamp);
			String content = null;
			try {
				content = new String(Files.readAllBytes(Paths.get("./test-output/emailable-report.html")));
			} catch (IOException e) {
				e.printStackTrace();
			}

			Multipart mp = new MimeMultipart();
			MimeBodyPart htmlPart = new MimeBodyPart();
			htmlPart.setContent(content, "text/html");
			mp.addBodyPart(htmlPart);
			msg.setContent(mp);

			Transport.send(msg);
		} catch (AddressException e) {
			System.err.println("Address Exception: " + e);
		} catch (MessagingException e) {
			System.err.println("Message Exception : " + e);
		} catch (UnsupportedEncodingException e) {
			System.err.println("Exception : " + e);

		}
	}
	
	public static void sendMailWithAttachement(int count) {
		
		Session session = getMaiSession();
		String htmlcontent = null;
		try {
			htmlcontent = new String(Files.readAllBytes(Paths.get("./test-output/customized-emailable-report.html")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Multipart mp = new MimeMultipart();

		/*String extentReport=MyAccount_Suite.extentReport;*/
		try {
			MimeBodyPart htmlPart = new MimeBodyPart();
			htmlPart.setContent(htmlcontent, "text/html");
			mp.addBodyPart(htmlPart);

			MimeBodyPart attachment = new MimeBodyPart();
			attachment.attachFile(new File(Registration_TestSuite.extentReport));
			
			/*InputStream attachmentDataStream = new ByteArrayInputStream(attachmentData);
			attachment.setFileName("testmail.pdf");
			attachment.setContent(attachmentDataStream, "application/pdf");*/
			mp.addBodyPart(attachment);

			 String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
			
			Message msg = new MimeMessage(session);
			
			if(count>0)
			{
				msg.setFrom(new InternetAddress("gajelli.p@awax.co.uk", "Registration_TestSuite"));
				msg.addRecipient(Message.RecipientType.TO, new InternetAddress("gajelli.pallavi@gmail.com"));
				msg.setSubject("!!!Alert!!! "+count+" Critical Test Case Failed \t TimeStamp: " +timeStamp);
				msg.setContent(mp);
			
				Transport.send(msg);
			}
			else
			{
				msg.setFrom(new InternetAddress("gajelli.p@awax.co.uk", "Registration_TestSuite"));
				msg.addRecipient(Message.RecipientType.TO, new InternetAddress("gajelli.pallavi@gmail.com"));
				msg.setSubject("No Critical Test Failures\t TimeStamp" +timeStamp);
				msg.setContent(mp);
				
				Transport.send(msg);
			}
		} catch (Exception e) {
			System.err.println("Exception : " + e);
		}
		
		
	}
	
	private static Session    getMaiSession() {
		
		Properties properties = new Properties();
	    properties.put("mail.smtp.host", "smtp.gmail.com");
	    properties.put("mail.smtp.port", "587");
	    properties.put("mail.smtp.auth", "true");
	    properties.put("mail.smtp.starttls.enable", "true");
	    //properties.put("mail.smtp.ssl.trust","mail.man.com");		
	    
	    Authenticator passAuth = new Authenticator(){
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("gajelli.p@awax.co.uk", "London@19");
			}
	    };
	    Session session = Session.getInstance(properties, passAuth);
	    return session;
	}
	
	
	
}

