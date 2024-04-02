package jdbc_servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/details")
public class SignUpController extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
 Person person=new Person();
 PersonCrud crud=new PersonCrud();
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		long phone=Long.parseLong(req.getParameter("phone"));
		String address=req.getParameter("address");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		person.setId(id);
		person.setName(name);
		person.setPhone(phone);
		person.setAddress(address);
		person.setEmail(email);
		person.setPassword(password);
		try {
			int result=crud.signUp(person);
			if(result!=0)
			{
			System.out.println("success");	
			}
			else {
				System.err.println("err");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		res.getWriter().print("hhiiiiiiiiii");		
		
	}

}
