<%-- 
    Document   : p4
    Created on : 11 Mar, 2025, 8:21:35 PM
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
      String fname = request.getParameter("fname");
      String mname = request.getParameter("mname");
      String lname = request.getParameter("lname");
      String name = fname+ " "+ mname+" " + lname;
    
      //Step2: Show  result 
            %>
             
            <h1>Welcome : <%=name%></h1>
    </body>
</html>
