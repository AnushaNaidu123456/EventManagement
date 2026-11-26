package com.example.eventmanagement.Controller;

import com.example.eventmanagement.Entity.Ticket;
import com.example.eventmanagement.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Ticket")
public class TicketController {
    @Autowired
    TicketService ticketService;
    @PostMapping("/insertall")
    public List<Ticket> insertall(@RequestBody List<Ticket> tickets){
        return ticketService.insertall(tickets);
    }
    @GetMapping("/fetchall")
    public List<Ticket> fetchall(){
        return ticketService.fetchall();
    }
    @GetMapping("/fetchby/{id}")
    public Ticket fetchby(@PathVariable Integer id){
        return ticketService.fetchby(id);
    }
    @PutMapping("/update/{id}")
    public Ticket update(@RequestBody Ticket ticket,@PathVariable Integer id){
        return ticketService.update(ticket,id);
    }
    @DeleteMapping("/delete/{id}")
    public Ticket delete(@PathVariable Integer id){
        return ticketService.delete(id);
    }

}
