package assignment1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();

		Cookie[] cookies = request.getCookies();
		boolean flag = false;
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {

				if (cookies[i].getName().equals("testCookie")) {
					out.println("Welcome back");
					flag = true;
					break;
				}
			}
			if (!flag) {
				Cookie testCookie = new Cookie("testCookie", "cookieValue");
				response.addCookie(testCookie);
				out.println("Welcome you are visiting for first time");
			}
		} else {
			Cookie testCookie = new Cookie("testCookie", "cookieValue");
			response.addCookie(testCookie);
			out.println("Welcome you are visiting for first time");
		}

		out.close();
	}

}
