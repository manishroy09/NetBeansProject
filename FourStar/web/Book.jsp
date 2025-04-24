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
                padding: 5px;
                height: 12px;
                width: 15px;
                margin: 3px;
                border-radius: 5px;
            }
            .row{
                display: flex;
                align-items: center;
                justify-content: center;
                gap:10px;

            }
            .screen{
                background-color:#B4EBE6;
                height: 40px;
                width: 300px;
                margin: 20px auto;
                box-shadow: 0 3px 10px rgba(255, 255, 255, 0.7);
                transform:  rotateX(-45deg)
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
            <hr>
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
                <div class="seat">9</div> 
                <div class="seat">10</div> 
                <div class="seat">11</div> 
                <div class="seat">12</div> 
                <div class="seat">13</div> 
                <div class="seat">14</div> 
            </div>
            <div class="row">
                <p>B</p>
                <div class="seat">1</div> 
                <div class="seat">2</div> 
                <div class="seat">3</div> 
                <div class="seat">4</div> 
                <div class="seat">5</div> 
                <div class="seat">6</div> 
                <div class="seat">7</div> 
                <div class="seat">8</div> 
                <div class="seat">9</div> 
                <div class="seat">10</div> 
                <div class="seat">11</div> 
                <div class="seat">12</div> 
                <div class="seat">13</div> 
                <div class="seat">14</div>
            </div>
            <div class="row">
                <p>C</p>
                <div class="seat">1</div> 
                <div class="seat">2</div> 
                <div class="seat">3</div> 
                <div class="seat">4</div> 
                <div class="seat">5</div> 
                <div class="seat">6</div> 
                <div class="seat">7</div> 
                <div class="seat">8</div> 
                <div class="seat">9</div> 
                <div class="seat">10</div> 
                <div class="seat">11</div> 
                <div class="seat">12</div> 
                <div class="seat">13</div> 
                <div class="seat">14</div>
            </div>
            <div class="row">
                <p>D</p>
                <div class="seat">1</div> 
                <div class="seat">2</div> 
                <div class="seat">3</div> 
                <div class="seat">4</div> 
                <div class="seat">5</div> 
                <div class="seat">6</div> 
                <div class="seat">7</div> 
                <div class="seat">8</div> 
                <div class="seat">9</div> 
                <div class="seat">10</div> 
                <div class="seat">11</div> 
                <div class="seat">12</div> 
                <div class="seat">13</div> 
                <div class="seat">14</div>
            </div>
            <div class="row">
                <p>E</p>
                <div class="seat">1</div> 
                <div class="seat">2</div> 
                <div class="seat">3</div> 
                <div class="seat">4</div> 
                <div class="seat">5</div> 
                <div class="seat">6</div> 
                <div class="seat">7</div> 
                <div class="seat">8</div> 
                <div class="seat">9</div> 
                <div class="seat">10</div> 
                <div class="seat">11</div> 
                <div class="seat">12</div> 
                <div class="seat">13</div> 
                <div class="seat">14</div>
            </div>
            <div class="row">
                <p>F</p>
                <div class="seat">1</div> 
                <div class="seat">2</div> 
                <div class="seat">3</div> 
                <div class="seat">4</div> 
                <div class="seat">5</div> 
                <div class="seat">6</div> 
                <div class="seat">7</div> 
                <div class="seat">8</div> 
                <div class="seat">9</div> 
                <div class="seat">10</div> 
                <div class="seat">11</div> 
                <div class="seat">12</div> 
                <div class="seat">13</div> 
                <div class="seat">14</div>
            </div>
            <div class="row">
                <p>G</p>
                <div class="seat">1</div> 
                <div class="seat">2</div> 
                <div class="seat">3</div> 
                <div class="seat">4</div> 
                <div class="seat">5</div> 
                <div class="seat">6</div> 
                <div class="seat">7</div> 
                <div class="seat">8</div> 
                <div class="seat">9</div> 
                <div class="seat">10</div> 
                <div class="seat">11</div> 
                <div class="seat">12</div> 
                <div class="seat">13</div> 
                <div class="seat">14</div>
            </div>

        </div>
        <div  class="screen"></div>
        <p align="center">All eyes are here Please!</p>
        <div class="selectedSeat" align="center">
        <label>Set No :- </label>
        <input type="text" id="setNo"><br><br>
        <label>Total Amount  :- </label>
        <input type="text" id="amount">
        </div>
    </body>
</html>
