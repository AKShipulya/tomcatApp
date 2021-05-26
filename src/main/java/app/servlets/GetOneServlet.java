package app.servlets;

import app.entities.User;
import app.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GetOneServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        Model model = Model.getInstance();
        model.getByName(name);
        request.getAttribute("userName");

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/get.jsp");
        requestDispatcher.forward(request, response);
    }

}
