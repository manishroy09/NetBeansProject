<%-- 
    Document   : p2
    Created on : 11 Mar, 2025, 8:15:44 PM
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
      //Step1: Fetch data from the request
      String name = request.getParameter("name");
      //Step2: print result 
      out.println("Welcome  : " +name);
      
    
            %>
    </body>
</html>
