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
                font-size: 20px;
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
            .container1{
                padding: 20px;
            }
            .con1 img{
                border-radius: 15px;
            }
            .cona{
                display: flex;
                align-items: center;
                justify-content: space-around;
                padding: 20px;
            }
            .box{
                display: flex;
                align-items: center;
                gap:100px;
                padding-left: 10px;
                padding-right: 10px;
            }
            .box button{
                padding: 8px;
                border-radius: 10px;
                background-color: #FFB433;
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
            <h1 align="center">Movies Now in The Cinema Hall</h1>
            <div class="cona">
                <div class="con1">
                    <img src="images/jaat.avif" height="500px">
                    <div class="box">
                        <div class="title">
                            <h2>  Jaat </h2>
                            <p>Action/Drama</p>
                        </div>
                        <button>Book Tickets</button>
                    </div>
                </div>
                 <div class="con1">
                    <img src="images/Sikandar.avif" height="500px">
                    <div class="box">
                        <div class="title">
                            <h2>  Sikandar </h2>
                            <p>Action/Drama</p>
                        </div>
                        <button>Book Tickets</button>
                    </div>
                </div>
                <div class="con1">
                    <img src="images/chhava.avif" height="500px">
                    <div class="box">
                        <div class="title">
                            <h2>  Chhava </h2>
                            <p>Action/Historical</p>
                        </div>
                        <button>Book Tickets</button>
                    </div>
                </div>
                <div class="con1">
                    <img src="images/diplomat.avif" height="500px">
                    <div class="box">
                        <div class="title">
                            <h2>Diplomat</h2>
                            <p>Action/Thriller</p>
                        </div>
                        <button>Book Tickets</button>
                    </div>
                </div>
            </div>
        </div>


    </body>
</html>
