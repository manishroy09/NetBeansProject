<%@page contentType="text/html" pageEncoding="UTF-8"%>
<header>
    <div class="container">
        <h1>Movie Ticket Booking</h1>
        <nav>
            <ul>
                <li><a href="index.jsp">Home</a></li>
                <li><a href="movies.jsp">Movies</a></li>
                <% if (session.getAttribute("user") != null) { %>
                    <li><a href="logout.jsp">Logout</a></li>
                <% } else { %>
                    <li><a href="login.jsp">Login</a></li>
                    <li><a href="register.jsp">Register</a></li>
                <% } %>
            </ul>
        </nav>
    </div>
</header>