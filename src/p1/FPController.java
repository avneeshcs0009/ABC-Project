package p1;
import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class FPController extends HttpServlet 
{
	HttpSession hs;
	public void service(HttpServletRequest x, HttpServletResponse y)
	{
		try
		{
			final String fromEmail= "avneesh005@gmail.com";
			final String password= "avneesh@ishan";
			String toEmail= x.getParameter("toEmail");
			hs= x.getSession();
			hs.setAttribute("toEmail", toEmail);
			
			Properties prop= new Properties();
			prop.put("mail.smtp.host", "smtp.gmail.com");	//for ip address		
			prop.put("mail.smtp.port", 587);				//for port number
			prop.put("mail.smtp.auth", "true");				//for authentication
			prop.put("mail.smtp.starttls.enable", "true");	//for encryption
		
			Session session= Session.getDefaultInstance(prop,new javax.mail.Authenticator()
			{
				protected PasswordAuthentication getPasswordAuthentication()
				{
					return new PasswordAuthentication(fromEmail, password);
				}
			});
			
			MimeMessage msg= new MimeMessage(session);
			msg.setFrom(new InternetAddress(fromEmail));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
			msg.setSubject("DO NOT REPLY TO THIS EMAIL");
			msg.setText("http://localhost:9090/BankApp/NewPassword.jsp");
			Transport.send(msg);
			y.sendRedirect("/BankApp/SuccessLink.jsp");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
