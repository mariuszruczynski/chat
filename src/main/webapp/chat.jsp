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

<meta http-equiv="refresh" content="10">

<p><% java.util.Date date = new java.util.Date();%><br></p>
Time is: <%=new Date().getHours()+":" + new Date().getMinutes()%>
<br>
<b1><%
    for (Cookie c : request.getCookies()) {
        if (c.getName().equals("name")) {
            out.println("User: " + c.getValue());
        }
    }
%></b1>
<form action="servlet" method="post">
    <p>
        <textarea name="chat" rows="20" cols="68">
<%
    List<Message> messageList;
    messageList = MessageStore.messages;

    for (Message m : messageList) {
        out.println(m.getUser() + " : " + m.getMessage());
    }
%>
</textarea>
        <br/>
        I say: <input type="text" name="iSay" size="60"/>
        <br/>
        <input type="submit" name="do_it" value="Talk/Refresh"/>
    </p>
</form>

<br>
<br>

<a href="talk.jsp">sprawdz rozmowe</a>
</body>
</html>
