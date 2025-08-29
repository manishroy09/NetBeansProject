<%-- 
    Document   : login
    Created on : 29 Aug, 2025, 9:40:21 PM
    Author     : manis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login Page</title>
    </head>
    <body>
      <form action="LoginController.jsp">
            <table  width="60%">
               
                 <tr>
                    <td>USERNAME: </td>
                    <td><input type="text" name="un"></td>
                </tr>
                 <tr>
                    <td>Password: </td>
                    <td><input type="password" name="ps"></td>
                </tr>
               
                 <tr>
                     <td>&nbsp;</td>
                     <td><input type="submit" value="Login Here "></td>
                </tr>
            </table>
        </form>
    </body>
</html>
