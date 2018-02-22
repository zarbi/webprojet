package fr.zarbi.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculatrice
 */
/*@WebServlet("/Calculatrice")*/
public class ConverterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConverterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("converter.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {

		String celcius = request.getParameter("celcius");
		float floatCelcius = Float.parseFloat(celcius);
		float result = (floatCelcius * 9/5) + 32;
		System.out.println("result :" + result);
		
		
	
		request.setAttribute("result", result);
		request.getRequestDispatcher("converter.jsp").forward(request, response);
		}
		catch (Exception e) {
			request.setAttribute("result", "La saisie doit être numérique !");
			request.getRequestDispatcher("converter.jsp").forward(request, response);
			
		}

	}

}
