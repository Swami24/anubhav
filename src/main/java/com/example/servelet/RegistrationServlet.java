package com.example.servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
	RequestDispatcher rd;
	
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
		System.out.println(username);
		if(username !="" && password!="")
		{
			User registration = new User(username, password); // object 
			int  str = objuserdaoimpl.save(registration);
			System.out.println("str" + str);
			if(str!=0)
			{
				request.setAttribute("username",username);
				rd = request.getRequestDispatcher("index.jsp");
				rd.forward(request, response);
				
			}else
			{
				rd = request.getRequestDispatcher("Registration.jsp");
				rd.forward(request, response);
				
			}
			
			
			/* User login = new User(); /// object
			login.setUsername(username);
			login.setPassword(password);
			*/
			
			System.out.println("");
			
		}
		
		
		
	}

}
