package com.example.eventmanagement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ticket {
    @Id
    private Integer ticket_id;
    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Bookings bookings;
    @ManyToOne
    @JoinColumn(name = "seat_id")
    Event_Seats eventSeats;
    private String qr_code;
    private  String ticket_status;
}
