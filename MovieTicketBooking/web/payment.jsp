<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.manish.beans.BookingBean, com.manish.beans.MovieBean, com.manish.dao.MovieDAO" %>
<%
    BookingBean booking = (BookingBean) session.getAttribute("booking");
    if (booking == null) {
        response.sendRedirect("movies.jsp");
        return;
    }
    
    MovieDAO movieDao = new MovieDAO();
    MovieBean movie = movieDao.getMovieById(booking.getMovieId());
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Payment - Movie Ticket Booking</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <jsp:include page="header.jsp"/>
    
    <main class="container">
        <h2>Payment Details</h2>
        
        <div class="booking-summary">
            <h3>Booking Summary</h3>
            <p><strong>Movie:</strong> <%= movie.getTitle() %></p>
            <p><strong>Date:</strong> <%= new java.text.SimpleDateFormat("EEE, MMM d, yyyy").format(booking.getShowDate()) %></p>
            <p><strong>Time:</strong> <%= booking.getShowTime() %></p>
            <p><strong>Seats:</strong> <%= booking.getSeats() %></p>
            <p><strong>Total:</strong> $<%= String.format("%.2f", booking.getTotalPrice()) %></p>
        </div>
        
        <form action="processPayment.jsp" method="POST" class="payment-form">
            <div class="form-group">
                <label for="cardNumber">Card Number:</label>
                <input type="text" id="cardNumber" name="cardNumber" placeholder="1234 5678 9012 3456" required>
            </div>
            
            <div class="form-row">
                <div class="form-group">
                    <label for="expiry">Expiry Date:</label>
                    <input type="text" id="expiry" name="expiry" placeholder="MM/YY" required>
                </div>
                
                <div class="form-group">
                    <label for="cvv">CVV:</label>
                    <input type="text" id="cvv" name="cvv" placeholder="123" required>
                </div>
            </div>
            
            <div class="form-group">
                <label for="name">Cardholder Name:</label>
                <input type="text" id="name" name="name" placeholder="John Doe" required>
            </div>
            
            <button type="submit" class="btn">Confirm Payment</button>
        </form>
    </main>
    
    <jsp:include page="footer.jsp"/>
</body>
</html>