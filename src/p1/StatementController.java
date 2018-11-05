package p1;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class StatementController extends HttpServlet 
{
	HttpSession hs;
	public void service(HttpServletRequest x, HttpServletResponse y)
	{
		try
		{
			hs= x.getSession();
			int accno= (int)hs.getAttribute("accno");
			Model m= new Model();
			m.setAccno(accno);
			ArrayList al= m.statement();
			hs.setAttribute("al", al);
			if(al!=null)
			{
				y.sendRedirect("/BankApp/StatementSuccess.jsp");
			}
			else
			{
				y.sendRedirect("/BankApp/StatementFailure.jsp");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
