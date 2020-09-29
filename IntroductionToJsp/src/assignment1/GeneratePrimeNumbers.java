package assignment1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utils.PrimeNumber;

/**
 * Servlet implementation class GeneratePrimeNumbers
 */
@WebServlet("/GeneratePrimeNumbers")
public class GeneratePrimeNumbers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GeneratePrimeNumbers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		if(request.getParameter("num").equalsIgnoreCase("")) {
			out.println("<h1 style=color:red>Please Enter Number</h1>");
		}else {
			int num = Integer.parseInt(request.getParameter("num"));
			ArrayList<Integer> list = PrimeNumber.generateListOfPrimeNumbers(num);
			request.setAttribute("prime_num_list", list);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("assignment1/list.jsp");
			requestDispatcher.forward(request, response);  
		}
		
	}

}
