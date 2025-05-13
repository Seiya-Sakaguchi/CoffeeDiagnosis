package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/CoffeeDiagnosisServlet")
public class CoffeeDiagnosisServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        String step = request.getParameter("step");

        
        if ("1".equals(step)) {
            // Q1へ遷移
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/JSP/question1.jsp");
            rd.forward(request, response);

        } else if ("2".equals(step)) {
            // Q1の回答（scene）を保存し、Q2へ
            String scene = request.getParameter("scene");
            session.setAttribute("scene", scene);

            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/JSP/question2.jsp");
            rd.forward(request, response);

        } else if ("3".equals(step)) {
            // Q2の回答（flavor）を保存し、Q3へ
            String flavor = request.getParameter("flavor");
            session.setAttribute("flavor", flavor);

            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/JSP/question3.jsp");
            rd.forward(request, response);
            
        } else {
            // 想定外のstep → エラー画面やトップへリダイレクト
            response.sendRedirect("TOP_JSP/index.jsp");
        }
	}

}
