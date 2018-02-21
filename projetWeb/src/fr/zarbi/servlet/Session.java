package fr.zarbi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Session
 */
/*@WebServlet("/Session")*/
public class Session extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Session() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession	session=request.getSession();
		// ajouter un attribut dans la session
		session.setAttribute("Essai","Test");
		//getServletContext().getRequestDispatcher("/Session.jsp").forward(request, response);

String	chaine=(String)session.getAttribute("Essai");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITLE>Réponse doGet Session</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println("<H1>Informations Session</H1>");
		// obtenir la valeur des différents paramètres
		out.println("<TABLE border=1>");
		out.println("<TR>");
		out.println("<TD>Session</TD>");
		out.println("<TD>" + request.getSession() + "</TD>");
		out.println("</TR>");	
		
		out.println("<TR>");
		out.println("<TD>Essai</TD>");
		out.println("<TD>" + chaine + "</TD>");
		out.println("</TR>");
		
		out.println("</TABLE>");
		out.println("</BODY>");
		out.println("</HTML>");

		out.flush();
		out.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
