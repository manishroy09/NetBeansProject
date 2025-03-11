<%-- 
    Document   : p6
    Created on : 11 Mar, 2025, 8:34:19 PM
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
      int n1 = Integer.parseInt(request.getParameter("n1"));
       int n2 = Integer.parseInt(request.getParameter("n2"));
       
       int Add = n1+n2;
      //Step2: Show  result 
            %>
             
            <h1>Addition is : <%=Add%></h1>
    </body>
</html>
