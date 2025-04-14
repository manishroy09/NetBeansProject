<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.manish.dao.MovieDAO, com.manish.beans.MovieBean, java.util.List" %>
<%
    MovieDAO movieDao = new MovieDAO();
    List<MovieBean> movies = movieDao.getAllMovies();
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Movies - Movie Ticket Booking</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <jsp:include page="header.jsp"/>
    
    <main class="container">
        <h2>Now Showing</h2>
        
        <div class="movie-grid">
            <% for (MovieBean movie : movies) { %>
            <div class="movie-card">
                <img src="images/<%= movie.getImageUrl() %>" alt="<%= movie.getTitle() %>">
                <div class="movie-info">
                    <h3><%= movie.getTitle() %></h3>
                    <p><span class="genre"><%= movie.getGenre() %></span> | 
                       <span class="duration"><%= movie.getDuration() %> mins</span> | 
                       <span class="rating"><%= movie.getRating() %></span></p>
                    <p class="price">$<%= String.format("%.2f", movie.getPrice()) %></p>
                    <a href="booking.jsp?movieId=<%= movie.getMovieId() %>" class="btn">Book Now</a>
                </div>
            </div>
            <% } %>
        </div>
    </main>
    
    <jsp:include page="footer.jsp"/>
</body>
</html>