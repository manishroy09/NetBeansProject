<%-- 
    Document   : Action_cookie
    Created on : 18 Mar, 2025, 4:22:17 PM
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
        <h1>Setting Cookies</h1>
        <form action="cprocess.jsp" method="GET">
            First Name: <input type="text" name="first_name"> <br /><br/> 
            Last Name: <input type="text" name="last_name" /><br/><br/> 
            <input type="submit" value="Submit" />
        </form>
    </body>
</html>
