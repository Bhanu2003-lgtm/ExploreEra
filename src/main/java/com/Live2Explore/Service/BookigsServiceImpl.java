package com.Live2Explore.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Live2Explore.Entity.Bookigs;
import com.Live2Explore.Repository.BookigsRepository;

@Service
public class BookigsServiceImpl implements BookigsService {

    private final BookigsRepository repository;

    // Constructor Injection (Best Practice)
    public BookigsServiceImpl(BookigsRepository repository) {
        this.repository = repository;
    }

    // ✅ SAVE
    @Override
    public Bookigs saveBooking(Bookigs booking) {
        return repository.save(booking);
    }

    // ✅ GET ALL
    @Override
    public List<Bookigs> getAllBookings() {
        return repository.findAll();
    }

    // ✅ GET BY ID
    @Override
    public Bookigs getBookingById(Long id) {
        return repository.findById(id).orElse(null);
    }

    // ✅ UPDATE
    @Override
    public Bookigs updateBooking(Long id, Bookigs booking) {

        Bookigs existing = repository.findById(id).orElse(null);

        if (existing != null) {
            existing.setFullName(booking.getFullName());
            existing.setMobileNo(booking.getMobileNo());
            existing.setSelectDestination(booking.getSelectDestination());
            existing.setNumberOfPersons(booking.getNumberOfPersons());
            existing.setTravelType(booking.getTravelType());
            existing.setTravelDate(booking.getTravelDate());
            existing.setCustomerAddress(booking.getCustomerAddress());

            return repository.save(existing);
        }

        return null;
    }

    // ✅ DELETE
    @Override
    public void deleteBooking(Long id) {
        repository.deleteById(id);
    }
}