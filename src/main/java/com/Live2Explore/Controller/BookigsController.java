package com.Live2Explore.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Live2Explore.Entity.Bookigs;
import com.Live2Explore.Service.BookigsService;

@RestController
@RequestMapping("/bookings")
@CrossOrigin(origins = "http://localhost:3000")
public class BookigsController {
	@Autowired

    private BookigsService service;

    public BookigsController(BookigsService service) {
        this.service = service;
    }

    // ✅ CREATE BOOKING
    @PostMapping("/create")
    public Bookigs createBooking(@RequestBody Bookigs booking) {
        
        return service.saveBooking(booking);
    }
    
 // ✅ GET BOOKING BY ID
    @GetMapping("/get/{id}")
    public Bookigs getBookingById(@PathVariable Long id) {
        return service.getBookingById(id);
    }

    // ✅ GET ALL BOOKINGS
    @GetMapping("/get/all")
    public List<Bookigs> getAllBookings() {
        return service.getAllBookings();
    }
  

    // ✅ UPDATE
    @PutMapping("/update/{id}")
    public Bookigs updateBooking(@PathVariable Long id,
                                 @RequestBody Bookigs booking) {
        return service.updateBooking(id, booking);
    }

    // ✅ DELETE
    @DeleteMapping("/delete/{id}")
    public String deleteBooking(@PathVariable Long id) {
        service.deleteBooking(id);
        return"Successfully Deleted";
	
    }
}