<%-- 
    Document   : front
    Created on : 6 Apr, 2025, 6:38:39 PM
    Author     : manis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Four Star</title>
        
        <style>
            
            *{
                margin: 0;
                padding: 0;
                
            }
            .navbar{
                display: flex;
                align-content: center;
                justify-content: space-around;
                background-color: #80CBC4;
                padding: 20px;
                
             }
                 ul{
                    display: flex;
                    gap:10px;
                    list-style: none;
            }
            .navbar ul li a{
                text-decoration: none;
                color: black;
            }
            .navbar ul li a:hover{
                border: 2px solid black;
                background-color: #FFB433;
                padding:5px;
                border-radius: 10px;
                z-index: 10;
            }
            .navbar button{
                padding: 5px;
                border-radius: 10px;
                background-color: #FFB433;
            }
            .navbar button:hover{
                padding: 8px;
                 z-index: 10;
            }
        </style>
    </head>
    <body>
         <nav class="navbar">
            <h1>4Star</h1>
            <ul>
                <li><a href="">Home</a></li>
                <li><a href="">Login</a></li>
                <li><a href="">Profile</a></li>
            </ul>
            <button>Admin Login</button>
        </nav>
        <div class="container1">
            <div class="con1">
                
            </div>
        </div>
           
        
    </body>
</html>
