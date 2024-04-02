package jdbc_servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/login")
public class LoginController extends GenericServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	    PersonCrud crud = new PersonCrud();
	    String email = req.getParameter("email");
	    String password = req.getParameter("password");
	    
	    try {
	        String storedPassword = crud.loginPerson(email); // Assuming loginPerson returns password or null
	        
	        if (storedPassword != null && storedPassword.equals(password)) {
	            res.getWriter().print("success!!!!");
	            System.out.println("success");
	        } else {
	            res.getWriter().print("err");
	            System.out.println("errr");
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

		
		
		
	}
	


