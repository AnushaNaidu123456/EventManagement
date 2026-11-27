package com.example.eventmanagement.Controller;

import com.example.eventmanagement.Entity.Bookings;
import com.example.eventmanagement.Service.BookingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Booking")
public class BookingsController {
    @Autowired
    BookingsService bookingsService;
    @PostMapping("/insertall")
    public List<Bookings> insertall(@RequestBody List<Bookings> bookings){
        return bookingsService.insertall(bookings);
    }
    @GetMapping("/fetchall")
    public List<Bookings> fetchall(){
        return bookingsService.fetchall();
    }
    @GetMapping("/fetchby/{id}")
    public Bookings fetchby(@PathVariable Integer id){
        return bookingsService.fetchby(id);
    }
    @PutMapping("/update/{id}")
    public Bookings update(@RequestBody Bookings bookings, @PathVariable Integer id){
        return bookingsService.update(bookings,id);
    }
    @DeleteMapping("/delete/{id}")
    public Bookings delete(@PathVariable Integer id){
        return bookingsService.delete(id);
    }
}
