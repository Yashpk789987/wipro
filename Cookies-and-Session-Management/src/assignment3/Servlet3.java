package assignment3;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet3
 */
@WebServlet("/Servlet3")
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet3() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession();

		if (session.isNew())
			session.setAttribute("visitCount", 1);
		else {
			int count = (int) session.getAttribute("visitCount");
			session.setAttribute("visitCount", count + 1);
		}

		out.println("<h1>Session information</h1>");
		out.println("<table border='1'>");

		out.println("<tr>");
		out.println("<td>" + "Session ID" + "</td>");
		out.println("<td>" + session.getId() + "</td>");
		out.println("</tr>");

		out.println("<tr>");
		String creationTime = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(session.getCreationTime());
		out.println("<td>" + "Creation Time" + "</td>");
		out.println("<td>" + creationTime + "</td>");
		out.println("</tr>");

		out.println("<tr>");
		String lastAccessTime = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(session.getLastAccessedTime());
		out.println("<td>" + "Time of Last Access" + "</td>");
		out.println("<td>" + lastAccessTime + "</td>");
		out.println("</tr>");

		out.println("<tr>");
		out.println("<td>" + "Visit Count" + "</td>");
		out.println("<td>" + session.getAttribute("visitCount") + "</td>");
		out.println("</tr>");

		out.println("</table>");

		out.close();
	}

}
