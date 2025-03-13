<%-- 
    Document   : update
    Created on : 13 Mar, 2025, 8:14:54 PM
    Author     : manis
--%>

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
        <%
            //step1: Fetch data from the request
            int sid = Integer.parseInt(request.getParameter("sid"));
            String name = request.getParameter("name");
            String enroll = request.getParameter("enroll");
            int p = Integer.parseInt(request.getParameter("p"));
            int c = Integer.parseInt(request.getParameter("c"));
            int m = Integer.parseInt(request.getParameter("m"));
            int h = Integer.parseInt(request.getParameter("h"));
            int e = Integer.parseInt(request.getParameter("e"));

 //step2:  Create Object of StudentBean and set all data
            StudentBean sb = new StudentBean();
            sb.setC(c);
            sb.setE(e);
            sb.setEnroll(enroll);
            sb.setH(h);
            sb.setM(m);
            sb.setName(name);
            sb.setP(p);
            sb.setSid(sid);
 //step3: Create Object of StudentDAO and call updateStudent()
            StudentDAO sd = new StudentDAO();
            int r = sd.updateStudent(sb);
            if (r > 0) {
                response.sendRedirect("viewstudent.jsp");
            }
        %>
    </body>
</html>
