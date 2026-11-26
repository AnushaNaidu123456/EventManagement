package com.example.eventmanagement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Bookings {
    @Id
    private Integer booking_id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Events events;
    //@ManyToOne
    //@JoinColumn(name ="coupon_id")
   //private Coupon coupon;

    private Integer quantity;
    private Double total_amount;
    private String booking_status;
    private LocalDate booking_date;


}
