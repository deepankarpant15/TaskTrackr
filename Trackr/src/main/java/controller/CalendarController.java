package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import dao.TodoDaoImpl;
import model.Todo;

@WebServlet("/fetch-tasks")
public class CalendarController extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TodoDaoImpl todoDao;

    @Override
    public void init() throws ServletException {
        todoDao = new TodoDaoImpl(); // Ensure your DAO is implemented correctly
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Check if user is logged in
        String username = (String) req.getSession().getAttribute("username");

        if (username == null) {
            resp.sendRedirect("login/login.jsp");
            return;
        }

        // Fetch todos from the database
        List<Todo> todos = todoDao.getTodosByUsername(username);

        // Convert List<Todo> to JSON
        Gson gson = new Gson();
        String jsonResponse = gson.toJson(todos);

        // Set response type to JSON and send data
        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter();
        out.write(jsonResponse);
        out.flush();
    }
}
