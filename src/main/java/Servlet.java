import store.Message;
import store.MessageStore;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", value = "/servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Toolkit.getDefaultToolkit().beep();



        String user = "";
        String say = request.getParameter("iSay");

        response.setHeader("REFRESH", "0");

        for (Cookie c : request.getCookies()) {
            if (c.getName().equals("name")) {
                user = c.getValue();
            }
        }

        MessageStore.messages.add(new Message(say, user));
        out.println(" <br><h1>you say:" + say + "</h1>");
        response.sendRedirect("chat.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
