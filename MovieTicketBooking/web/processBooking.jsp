<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.manish.beans.BookingBean, com.maj
        dao.BookingDAO, java.util.Date" %>
<%
    // Check if user is logged in
    if (session.getAttribute("user") == null) {
        session.setAttribute("redirect", "booking.jsp?movieId=" + request.getParameter("movieId"));
        response.sendRedirect("login.jsp");
        return;
    }
    
    // Process booking
    BookingBean booking = new BookingBean();
    booking.setUserId((Integer) session.getAttribute("userId"));
    booking.setMovieId(Integer.parseInt(request.getParameter("movieId")));
    booking.setShowDate(new java.text.SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("showDate")));
    booking.setShowTime(request.getParameter("showTime"));
    booking.setSeats(request.getParameter("seats"));
    booking.setTotalPrice(Double.parseDouble(request.getParameter("totalPrice")));
    
    BookingDAO bookingDao = new BookingDAO();
    boolean success = bookingDao.createBooking(booking);
    
    if (success) {
        session.setAttribute("booking", booking);
        response.sendRedirect("payment.jsp");
    } else {
        response.sendRedirect("booking.jsp?movieId=" + request.getParameter("movieId") + "&error=1");
    }
%>