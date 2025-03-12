<%-- 
    Document   : addStudent
    Created on : 12 Mar, 2025, 7:44:34 PM
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
        <form action="save.jsp" method="post">
            <table  width="60%">
                <tr>
                    <td>SID: </td>
                    <td><input type="text" name="sid"></td>
                </tr>
                 <tr>
                    <td>NAME: </td>
                    <td><input type="text" name="name"></td>
                </tr>
                 <tr>
                    <td>ENROLLMENT: </td>
                    <td><input type="text" name="enroll"></td>
                </tr>
                 <tr>
                    <td>Physics: </td>
                    <td><input type="text" name="p"></td>
                </tr>
                 <tr>
                    <td>Chemistry: </td>
                    <td><input type="text" name="c"></td> 
                </tr>
                 <tr>
                    <td>English: </td>
                    <td><input type="text" name="e"></td>
                </tr>
                 <tr>
                    <td>Maths: </td>
                    <td><input type="text" name="m"></td>
                </tr>
                 <tr>
                    <td>Hindi: </td>
                    <td><input type="text" name="h"></td>
                </tr>
                 <tr>
                     <td></td>
                     <td><input type="submit" value="Add Student"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
