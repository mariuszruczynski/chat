import store.User;
import store.UserStore;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Login", value = "/login")
public class Login extends HttpServlet {


    List<User> users = new ArrayList<>();
    private String user;


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        user = request.getParameter("Name");

        Cookie userCook = new Cookie("name", user);
        response.addCookie(userCook);

        response.sendRedirect("chat.jsp");

    }


}
