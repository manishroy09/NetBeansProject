package com.manish.dao;

import com.manish.beans.MovieBean;
import com.manish.utility.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieDAO {
   public List<MovieBean> getAllMovies() {
    List<MovieBean> movies = new ArrayList<>();
    String sql = "SELECT * FROM movies";
    
    try (Connection conn = DBConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {
        
        while (rs.next()) {
            MovieBean movie = new MovieBean();
            movie.setMovieId(rs.getInt("movie_id"));
            movie.setTitle(rs.getString("title"));
            movie.setGenre(rs.getString("genre"));
            movie.setDuration(rs.getInt("duration"));
            movie.setRating(rs.getString("rating"));
            movie.setImageUrl(rs.getString("image_url"));
            movie.setPrice(rs.getDouble("price"));
            movies.add(movie);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return movies;
}
    
    public MovieBean getMovieById(int movieId) {
        MovieBean movie = null;
        String sql = "SELECT * FROM movies WHERE movie_id = ?";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, movieId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    movie = new MovieBean();
                    movie.setMovieId(rs.getInt("movie_id"));
                    movie.setTitle(rs.getString("title"));
                    movie.setGenre(rs.getString("genre"));
                    movie.setDuration(rs.getInt("duration"));
                    movie.setRating(rs.getString("rating"));
                    movie.setImageUrl(rs.getString("image_url"));
                    movie.setPrice(rs.getDouble("price"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return movie;
    }
}