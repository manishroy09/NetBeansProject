<%-- 
    Document   : delete
    Created on : 13 Mar, 2025, 7:54:08 PM
    Author     : manis
--%>

<%@page import="com.manish.dao.StudentDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete </title>
    </head>
    <body>
        <% 
        int sid = Integer.parseInt(request.getParameter("sid"));
        StudentDAO sd = new StudentDAO();
        int r= sd.deletStudent(sid);
        if(r>0){
            response.sendRedirect("viewstudent.jsp");
        }
        %>
        <h1>Sid : <%= sid%></h1>
    </body>
</html>
