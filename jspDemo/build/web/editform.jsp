<%-- 
    Document   : editform
    Created on : 13 Mar, 2025, 8:01:58 PM
    Author     : manis
--%>

<%@page import="com.manish.bean.StudentBean"%>
<%@page import="com.manish.dao.StudentDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Form </title>
    </head>
    <body>
    <%
    //Step1: Fetch Id from the Request 
    int sid = Integer.parseInt(request.getParameter("sid"));
    // Step2: create object of StudentDAO
    StudentDAO sd = new StudentDAO();
    //call findById() method
    StudentBean sb = sd.findById(sid);
    
    %>
    
    <%
 
 //step1: Fetch data from the session
 String un=(String)session.getAttribute("user");
 %>
 <hr color="green">
 <h1> <font color="blue"> Welcome : <%=un %></font></h1>
 <hr color="red">
 
    <form action="update.jsp" method="post">
            <table  width="60%">
                <tr>
                    <td>SID: </td>
                    <td><input type="text" name="sid" value=<%=sb.getSid()%>></td>
                </tr>
                 <tr>
                    <td>NAME: </td>
                    <td><input type="text" name="name" value=<%=sb.getName()%>></td>
                </tr>
                 <tr>
                    <td>ENROLLMENT: </td>
                    <td><input type="text" name="enroll" value=<%=sb.getEnroll()%>></td>
                </tr>
                 <tr>
                    <td>Physics: </td>
                    <td><input type="text" name="p" value=<%=sb.getP()%>></td>
                </tr>
                 <tr>
                    <td>Chemistry: </td>
                    <td><input type="text" name="c" value=<%=sb.getC()%>></td> 
                </tr>
                 <tr>
                    <td>English: </td>
                    <td><input type="text" name="e" value=<%=sb.getE()%>></td>
                </tr>
                 <tr>
                    <td>Maths: </td>
                    <td><input type="text" name="m" value=<%=sb.getM()%>></td>
                </tr>
                 <tr>
                    <td>Hindi: </td>
                    <td><input type="text" name="h" value=<%=sb.getH()%>></td>
                </tr>
                 <tr>
                     <td></td>
                     <td><input type="submit" value="Update Student"></td>
                </tr>
            </table>
        </form>
    
    </body>
</html>
