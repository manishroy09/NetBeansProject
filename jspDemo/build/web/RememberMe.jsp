<%-- 
    Document   : RememberMe
    Created on : 19 Mar, 2025, 11:38:14 AM
    Author     : manis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Cookie[] cookies = request.getCookies();
            String username = "";
            String password = "";
            if (cookies != null) {
                for (int i = 0; i < cookies.length; i++) {
                    Cookie cookie = cookies[i];
                    if (cookie.getName().equals("username-cookie")) {
                        username = cookie.getValue();
                    } else if (cookie.getName().equals("password-cookie")) {
                        password = cookie.getValue();
                    }
                }
            }
        %>
        <form name="logonform" action="HomePage.jsp" method="POST">
            Username: <input type="text" name="username" value="<%=username%>" />
            <br /> <br/>Password:<input type="password" name="password"
                                        value="<%=password%>" /> <br /> <br/>Remember Me<input type="checkbox"
                                        name="rememberMe" value="true" /> <br/><br/><input type="submit" value="Submit" />
        </form>
    </body>
</html>
