<%-- 
    Document   : LoginController
    Created on : 14 Mar, 2025, 11:22:43 AM
    Author     : manis
--%>

<%@page import="com.manish.dao.UsersDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String un = request.getParameter("un");
        String ps = request.getParameter("ps");
        
      UsersDAO ud = new UsersDAO();
      int r = ud.logintCheck(un, ps);
      if(r>0){
          response.sendRedirect("viewstudent.jsp");
      }else{
          out.println("Login fail please try Again....");
          RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
          rd.include(request, response);
      }
        %>
    </body>
</html>
