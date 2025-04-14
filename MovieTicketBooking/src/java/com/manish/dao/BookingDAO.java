package com.manish.dao;

import com.manish.beans.BookingBean;
import com.manish.utility.DBConnection;
import java.sql.*;

public class BookingDAO {
    public boolean createBooking(BookingBean booking) {
        String sql = "INSERT INTO bookings (user_id, movie_id, show_date, show_time, seats, total_price) " +
                     "VALUES (?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, booking.getUserId());
            stmt.setInt(2, booking.getMovieId());
            stmt.setDate(3, new java.sql.Date(booking.getShowDate().getTime()));
            stmt.setString(4, booking.getShowTime());
            stmt.setString(5, booking.getSeats());
            stmt.setDouble(6, booking.getTotalPrice());
            
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}