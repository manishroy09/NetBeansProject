<%-- 
    Document   : Register
    Created on : 14 Mar, 2025, 10:50:33 AM
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
        <form action="saveuser.jsp">
            <table width="60%">
                <tr> 
                    <td>Uid : </td>
                    <td> <input type="text" name="uid"></td>
                </tr>
                 <tr>
                    <td>Name : </td>
                    <td><input type="text" name="name"></td>
                </tr>
                 <tr>
                    <td>UserName : </td>
                    <td><input type="text" name="un"></td>
                </tr>
                 <tr>
                    <td>Password : </td>
                    <td><input type="password" name="ps"></td>
                </tr>
                 <tr>
                    <td>Email: </td>
                    <td><input type="text" name="email"></td>
                </tr>
                 <tr>
                    <td>Mobile : </td>
                    <td><input type="text" name="mobile"></td>
                </tr>
                 
                 <tr>
                     <td>&nbsp;</td>
                     <td><input type="submit" value="Register "></td>
                </tr>
            </table>
        </form>
    </body>
</html>
