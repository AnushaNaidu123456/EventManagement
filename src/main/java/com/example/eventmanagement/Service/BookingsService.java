package com.example.eventmanagement.Service;

import com.example.eventmanagement.Entity.Bookings;
import com.example.eventmanagement.Repository.BookingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingsService {
    @Autowired
    BookingsRepository bookingsRepository;
    public List<Bookings> insertall(List<Bookings> bookings) {
        return bookingsRepository.saveAll(bookings);
    }

    public List<Bookings> fetchall() {
        return bookingsRepository.findAll();
    }

    public Bookings fetchby(Integer id) {
        return bookingsRepository.findById(id).orElse(null);
    }

    public Bookings update(Bookings bookings, Integer id) {
        Bookings bookings1 = bookingsRepository.findById(id).orElse(null);
        if(bookings1 != null){
            bookings1.setQuantity(bookings.getQuantity());
            bookings1.setTotal_amount(bookings.getTotal_amount());
            bookings1.setBooking_status(bookings.getBooking_status());
            bookings1.setBooking_date(bookings.getBooking_date());

            return bookingsRepository.save(bookings1);
        }
        return null;
    }

    public Bookings delete(Integer id) {
        if(bookingsRepository.existsById(id)){
            bookingsRepository.deleteById(id);
        }
        return null;
    }
}

