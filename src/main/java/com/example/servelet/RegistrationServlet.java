package com.example.servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.daoimpl.Userdaoimpl;
import com.example.pojo.User;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Userdaoimpl objuserdaoimpl = new Userdaoimpl(); // class object create
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String username = request.getParameter("fname"); // input class name get
		String password=request.getParameter("pass"); // input class pass get
		
		if(username !="" && password!="")
		{
			User registration = new User(username, password); // object 
			objuserdaoimpl.save(registration);
			
			
			
			/* User login = new User(); /// object
			login.setUsername(username);
			login.setPassword(password);
			*/
			
			System.out.println("");
			
		}
		
		
		
	}

}
