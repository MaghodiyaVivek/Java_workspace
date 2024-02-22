import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/go")
public class SaveServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		
		String name1 = req.getParameter("name");
		String surname1 = req.getParameter("surname");
		String email1 = req.getParameter("email");
		
		
		//set-get
		
		Model m = new Model();
		m.setName(name1);
		m.setSurname(surname1);
		m.setEmail(email1);
		
	 int  status = Dao.savedata(m);
				
		if(status>0)
		{
			resp.sendRedirect("ViewServlet");
		}
		else
		{
			out.print("fail");
		}
	}
}
