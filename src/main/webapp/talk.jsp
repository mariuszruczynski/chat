<%--
  Created by IntelliJ IDEA.
  User: Mateusz-pc
  Date: 2018-06-05
  Time: 12:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="store.MessageStore" %>
<%@ page import="store.UserStore" %>
<%@ page import="store.User" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.time.LocalDate" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="store.Message" %>
<%@ page import="java.util.List" %>
<%@ page import="store.UserStore" %>

<html>
<body>


<%

    List<Message> messageList;
    messageList = MessageStore.messages;

    for (Message m : messageList) {
        out.println(" : " + m.getMessage() + "<br>");
    }
%>

<br>
<br>
<a href="index.jsp">wróć</a>
</body>
</html>