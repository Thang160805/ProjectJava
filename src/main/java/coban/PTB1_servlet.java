package coban;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class PTB1_servlet
 */
@WebServlet("/PTB1_servlet")
public class PTB1_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public PTB1_servlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		
		if(user.equals("admin")&& pass.equals("123")) {
			RequestDispatcher rd = request.getRequestDispatcher("/htmls/welcome.html");
			rd.forward(request, response);
			
		}else {
			out.println("<h5 style=\"color: red;font-style: italic;\">Tên đăng nhập hoặc mật khẩu không đúng!</h5>");
			RequestDispatcher rd = request.getRequestDispatcher("/Login.html");
			rd.include(request, response);
		}
	}

}
