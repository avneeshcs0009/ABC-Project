package p1;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class PasswordChangeController extends HttpServlet 
{
	HttpSession hs;
	public void service(HttpServletRequest x, HttpServletResponse y)
	{
		try
		{
			String oldpassword= x.getParameter("oldpassword");
			String newpassword= x.getParameter("newpassword");
			String confirmnewpassword= x.getParameter("confirmnewpassword");
			if(newpassword.equals(confirmnewpassword))
			{
				hs= x.getSession();
				int accno= (int)hs.getAttribute("accno");
				Model m= new Model();
				m.setNewpassword(newpassword);
				m.setAccno(accno);
				boolean b= m.changePassword();
				if(b==true)
				{
					y.sendRedirect("/BankApp/PasswordSuccess.jsp");
				}
				else
				{
					y.sendRedirect("/BankApp/PasswordFailure.jsp");
				}
			}
			else
			{
				y.sendRedirect("/BankApp/PasswordError.jsp");
			}
		}
		catch(Exception e)
		{
			
		}
	}
}
