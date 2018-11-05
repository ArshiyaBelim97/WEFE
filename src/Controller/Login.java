package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import VO.*;
import DAO.dao;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		
		String user=request.getParameter("user");
		String pass=request.getParameter("password");
		
		register_vo v1=new register_vo();
		v1.setPassword(pass);
		v1.setUser_name(user);
		  //System.out.println(pass);
		dao d1=new dao();
		
		List ls=dao.search(v1);
		
		
		//session.setAttribute("list",ls);
		  //System.out.println(ls.size());
		  if(ls.size()==1){
			  response.sendRedirect("3/Logedin.html");  
		  }
		  else
		  {	
			  response.sendRedirect("3/Incorrect.html");
		  }
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
