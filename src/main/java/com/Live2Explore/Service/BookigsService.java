package com.Live2Explore.Service;

import java.util.List;

import com.Live2Explore.Entity.Bookigs;

public interface BookigsService {

    // Create Booking
    Bookigs saveBooking(Bookigs booking);

    // Get All Bookings
    List<Bookigs> getAllBookings();

    // Get Booking By ID
    Bookigs getBookingById(Long id);

    // Update Booking
    Bookigs updateBooking(Long id, Bookigs booking);

    // Delete Booking
    void deleteBooking(Long id);

}