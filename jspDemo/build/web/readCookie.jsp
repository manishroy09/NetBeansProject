<%-- 
    Document   : readCookie
    Created on : 18 Mar, 2025, 4:35:10 PM
    Author     : manis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Read Cookies</title>
    </head>
    <body>
        <h1>Read Cookies</h1>
        <%
            Cookie cookie = null;

            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (int i = 0; i < cookies.length; i++) {
                    cookie = cookies[i];
                    out.print("Name : " + cookie.getName() + ",  ");
                    out.print("Value: " + cookie.getValue() + " <br/>");
                }
            }else{
                out.println("<h2>No cookies founds</h2>");
            }
        %>
    </body>
</html>
