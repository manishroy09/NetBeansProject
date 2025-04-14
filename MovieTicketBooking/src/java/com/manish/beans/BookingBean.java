/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.beans;
import java.util.Date;
/**
 *
 * @author manis
 */
public class BookingBean {
      private int bookingId;
    private int userId;
    private int movieId;
    private Date showDate;
    private String showTime;
    private String seats;
    private double totalPrice;
    private Date bookingDate;
    private String paymentStatus;

    public BookingBean() {
    }

    public BookingBean(int bookingId, int userId, int movieId, Date showDate, String showTime, String seats, double totalPrice, Date bookingDate, String paymentStatus) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.movieId = movieId;
        this.showDate = showDate;
        this.showTime = showTime;
        this.seats = seats;
        this.totalPrice = totalPrice;
        this.bookingDate = bookingDate;
        this.paymentStatus = paymentStatus;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public Date getShowDate() {
        return showDate;
    }

    public void setShowDate(Date showDate) {
        this.showDate = showDate;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    
    
}
