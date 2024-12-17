package controller;

import dao.TodoDao;
import dao.TodoDaoImpl;
import model.Todo;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import com.google.gson.Gson;

@WebServlet("/todoManagement/getTodos")
public class GetTodosServlet extends HttpServlet {

    private TodoDao todoDao;

    @Override
    public void init() throws ServletException {
        // Initialize the TodoDao to interact with the database
        todoDao = new TodoDaoImpl();  // Assuming you have a TodoDaoImpl that handles database operations
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Todo> todos = todoDao.getAllTodos();  // Get all todos from your database

        // Set the response type to JSON
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        // Convert the list of todos into JSON format and write it to the response
        String json = convertToJson(todos);
        resp.getWriter().write(json);
    }

    // Convert the List of Todo objects to JSON format
    private String convertToJson(List<Todo> todos) {
        StringBuilder json = new StringBuilder("[");
        for (Todo todo : todos) {
            json.append("{")
                .append("\"title\":\"").append(todo.getTitle()).append("\",")
                .append("\"start\":\"").append(todo.getTargetDate()).append("\",")
                .append("\"description\":\"").append(todo.getDescription()).append("\"")
                .append("},");
        }
        if (json.length() > 1) {
            json.deleteCharAt(json.length() - 1);  // Remove the last comma
        }
        json.append("]");
        return json.toString();
    }
}
