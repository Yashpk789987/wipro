package assignment3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utils.Factorials;

/**
 * Servlet implementation class GenerateFactorial
 */
@WebServlet("/GenerateFactorial")
public class GenerateFactorial extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GenerateFactorial() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

//		ArrayList<HashMap<String, Integer>>

		PrintWriter out = response.getWriter();
		if (request.getParameter("num").equalsIgnoreCase("")) {
			out.println("<h1 style=color:red>Please Enter Number</h1>");
		} else {
			int num = Integer.parseInt(request.getParameter("num"));
			ArrayList<HashMap<String, Integer>> list = null;
			try {
				list = Factorials.generateListOfFactorials(num);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("fact_num_list", list);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("assignment3/list.jsp");
			requestDispatcher.forward(request, response);
		}

	}

}
