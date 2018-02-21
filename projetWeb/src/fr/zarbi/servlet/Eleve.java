package fr.zarbi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Eleve
 */
/*@WebServlet("/Eleve")*/
public class Eleve extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Eleve() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		Cookie gateau = new Cookie("Eleve", "appelformulaire");
		response.addCookie(gateau);
		getServletContext().getRequestDispatcher("/Eleve.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at post Eleve:
		// ").append(request.getContextPath());

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITLE>Réponse doPost Eleve</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println("<H1>Informations Eleve</H1>");
		// obtenir la valeur des différents paramètres
		out.println("<TABLE border=1>");
		out.println("<TR>");
		out.println("<TD>Nom</TD>");
		out.println("<TD>" + request.getParameter("tnom") + "</TD>");
		out.println("</TR>");
		out.println("<TR>");
		out.println("<TD>Prenom</TD>");
		out.println("<TD>" + request.getParameter("tprenom") + "</TD>");
		out.println("</TR>");		
		out.println("<TR>");
		out.println("<TD>Adresse</TD>");
		out.println("<TD>" + request.getParameter("tadresse") + "</TD>");
		out.println("</TR>");
		out.println("<TR>");
		out.println("<TD>Né le</TD>");
		out.println("<TD>" + request.getParameter("tnele") + "</TD>");
		out.println("</TR>");
		
		out.println("</TABLE>");
		out.println("</BODY>");
		out.println("</HTML>");

		out.flush();
		out.close();


		
	}

}
