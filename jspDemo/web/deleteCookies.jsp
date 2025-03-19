<%-- 
    Document   : deleteCookies
    Created on : 19 Mar, 2025, 11:31:26 AM
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
            Cookie cookie = null;
            Cookie[] cookies = null;
            cookies = request.getCookies();
            if (cookies != null) {
                for (int i = 0; i < cookies.length; i++) {
                    cookie = cookies[i];
                    if ((cookie.getName()).compareTo("username-cookie") == 0) {
                        cookie.setMaxAge(0);
                        response.addCookie(cookie);
                        out.print("Deleted cookie: " + cookie.getName() + "<br/>");
                    }

                    out.print("Name : " + cookie.getName() + ",  ");
                    out.print("Value: " + cookie.getValue() + " <br/>");
                }
            }
        %>
    </body>
</html>
