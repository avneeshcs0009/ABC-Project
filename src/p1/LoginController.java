package p1;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class LoginController extends HttpServlet 
{
	public void service(HttpServletRequest x, HttpServletResponse y)
	{
		try
		{
			String cusid= x.getParameter("cusid");
			int id= Integer.parseInt(cusid);
			String password= x.getParameter("password");
			Model m= new Model();
			m.setId(id);
			m.setPassword(password);
			boolean b= m.verify();
			if(b==true)
			{
				HttpSession hs= x.getSession(true);
				hs.setAttribute("accno", m.getAccno());
				hs.setAttribute("name", m.getName());
				y.sendRedirect("/BankApp/LoginSuccess.jsp");
			}
			else
			{
				y.sendRedirect("/BankApp/LoginFailure.jsp");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
