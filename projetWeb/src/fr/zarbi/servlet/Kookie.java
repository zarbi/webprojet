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
 * Servlet implementation class cookie
 */
/*@WebServlet("/cookie")*/
public class Kookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Kookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		Cookie gateau = new Cookie("Essai", "test1");
		gateau.setMaxAge(999);
		response.addCookie(gateau);
		Cookie gateau1 = new Cookie("ProjetWeb", "Accueil");		
		response.addCookie(gateau1);
		
		
		Cookie[] tabCookies = request.getCookies();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		if (tabCookies != null) {
			int i = 0;
			while (i < tabCookies.length) {
				out.println("<br>Nom du cookie:" + tabCookies[i].getName());
				out.println("<br>Valeur du cookie:" + tabCookies[i].getValue());
				i++;
			}
			out.flush();
			out.close();
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
