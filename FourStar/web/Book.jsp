<%-- 
    Document   : Book
    Created on : 8 Apr, 2025, 11:28:59 AM
    Author     : manis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .container1{
                display: flex;
                align-items: center;
                justify-content: center;
                background-color: #B4EBE6;
                padding: 20px;
            }

            .seat{
                border: 2px solid black;
                padding: 10px;
                height: 12px;
                width: 15px;
                margin: 3px;
            }
            .row{
                display: flex;
                gap:10px;
            }
        </style>
    </head>
    <body>
        <div class="container1">
            <div class="details">
                <label>Movie : </label>
                <input type="text" name="movie"><br><br>
                <label>Date : </label>
                <input type="date" name="date"><br><br>
                <label>Time : </label>
                <select name="time" id="" required>
                    <option value="">Select Time</option>
                    <option value="">9:00AM</option>
                    <option value="">12:00PM</option>
                    <option value="">3:00PM</option>
                    <option value="">6:00PM</option>
                    <option value="">9:00PM</option>
                </select>
            </div>
        </div>
        <div class="container2">
            <p>RS 200 PREMIUM</p>
            <hr
                <div class="row">
                <p>A</p>
                <div class="seat">1</div> 
                <div class="seat">2</div> 
                <div class="seat">3</div> 
                <div class="seat">4</div> 
                <div class="seat">5</div> 
                <div class="seat">6</div> 
                <div class="seat">7</div> 
                <div class="seat">8</div> 
            </div>
        </div>
    </body>
</html>
