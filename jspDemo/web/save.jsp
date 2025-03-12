<%-- 
    Document   : save
    Created on : 12 Mar, 2025, 7:46:50 PM
    Author     : manis
--%>

<%@page import="com.manish.dao.StudentDAO"%>
<%@page import="com.manish.bean.StudentBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int sid = Integer.parseInt(request.getParameter("sid"));
            String name = request.getParameter("name");
            String enroll = request.getParameter("enroll");
            int p = Integer.parseInt(request.getParameter("p"));
            int c = Integer.parseInt(request.getParameter("c"));
            int m = Integer.parseInt(request.getParameter("m"));
            int e = Integer.parseInt(request.getParameter("e"));
            int h = Integer.parseInt(request.getParameter("h"));
            

         //Step2: create object of bean 
         StudentBean sb = new StudentBean();
         sb.getSid();
         sb.getName();
         sb.getEnroll();
         sb.getP();
         sb.getC();
         sb.getE();
         sb.getM();
         sb.getH();
         
    //Step3: Crate object of StudenDAO
         StudentDAO sd = new StudentDAO();
         int r = sd.addStudent(sb);
         if(r>0){
             System.out.println("Data Added");
         }
            %>
            
<!--            <h1> Sid: <%=sid%></h1>
            <h1> name: <%=name%></h1>
            <h1> enroll : <%=enroll%></h1>
            <h1> p: <%=p%></h1>
            <h1> c: <%=c%></h1>
            <h1> m: <%=m%></h1>
            <h1> e: <%=e%></h1>
            <h1> h: <%=h%></h1>-->
            
          
    </body>
</html>
