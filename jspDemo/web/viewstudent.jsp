<%-- 
    Document   : viewstudent
    Created on : 13 Mar, 2025, 7:40:58 PM
    Author     : manis
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.manish.bean.StudentBean"%>
<%@page import="com.manish.dao.StudentDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>All Student Data</h1>
        <h1><a href="addStudent.jsp">Add New Student </a></h1>
            <table border="1" align="center">
                <tr>
                    <th>SID</th>
                    <th>NAME</th>
                    <th>ENROLL</th>
                    <th>P</th>
                    <th>C</th>
                    <th>M</th>
                    <th>H</th>
                    <th>E</th>
                    <th>Total</th>
                    <th>Percentage</th>
                    <th>EDIT</th>
                    <th>DELETE</th>

                </tr>
                <%
                //Step1: create an object of StudentDAO class
                StudentDAO sd = new StudentDAO();
                ArrayList<StudentBean> all = sd.findAll();
                for(StudentBean sb: all){
                %>
                <tr>
                    <td><%= sb.getSid() %></td>
                    <td><%= sb.getName() %></td>
                    <td><%= sb.getEnroll() %></td>
                    <td><%= sb.getP() %></td>
                    <td><%= sb.getC() %></td>
                    <td><%= sb.getM() %></td>
                    <td><%= sb.getH() %></td>
                    <td><%= sb.getE() %></td>
                    <td><%= sb.getTotal() %></td>
                    <td><%= sb.getPer() %></td>
                    <td><a href="editform.jsp?sid=<%=sb.getSid()%>">EDIT</a></td>
                    <th><a href="delete.jsp?sid=<%=sb.getSid()%>">DELETE</a></th>

                </tr>
                <%
               }
         %>
            </table>
    </body>
</html>
