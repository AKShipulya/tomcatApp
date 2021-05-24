//package app.servlets;
//
//import app.entities.User;
//import app.model.Model;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//
//public class GetOneServlet extends HttpServlet {
//
//    private User user;
//
//    public GetOneServlet(User user) {
//        this.user = user;
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Model model = Model.getInstance();
//        String name = model.getByName(user.getName());
//        request.setAttribute("userNames", name);
//
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/list.jsp");
//        requestDispatcher.forward(request, response);
//    }
//
//}
