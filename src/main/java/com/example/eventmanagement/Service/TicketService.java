package com.example.eventmanagement.Service;

import com.example.eventmanagement.Entity.Ticket;
import com.example.eventmanagement.Repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    TicketRepository ticketRepository;

    public List<Ticket> insertall(List<Ticket> tickets) {
        return ticketRepository.saveAll(tickets);
    }

    public List<Ticket> fetchall() {
        return ticketRepository.findAll();
    }

    public Ticket fetchby(Integer id) {
        return ticketRepository.findById(id).orElse(null);
    }

    public Ticket update(Ticket ticket, Integer id) {
        Ticket ticket1 = ticketRepository.findById(id).orElse(null);
                if(ticket1 != null){
                    ticket1.setQr_code(ticket.getQr_code());
                    ticket1.setTicket_status(ticket.getTicket_status());
                    return ticketRepository.save(ticket1);
                }
                return null;
    }

    public Ticket delete(Integer id) {
        if(ticketRepository.existsById(id)){
            ticketRepository.deleteById(id);
        }
        return null;
    }
}
