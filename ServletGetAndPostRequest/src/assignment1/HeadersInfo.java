package assignment1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HeadersInfo
 */
@WebServlet("/HeadersInfo")
public class HeadersInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public HeadersInfo() {
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

		out.println("<h1>HTTP headers sent by your client:</h1><br>");
        Enumeration enum1 = request.getHeaderNames();
		while (enum1.hasMoreElements()) {
			String headerName = (String) enum1.nextElement();
			String headerValue = request.getHeader(headerName);
			out.print("<b>" + headerName + "</b>: ");
			out.println(headerValue + "<br>");
		}
	}

}
