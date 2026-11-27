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
public class Notification {
    @Id
    private Integer notification_id;
    private String notification_type;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
