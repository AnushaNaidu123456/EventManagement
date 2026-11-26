package com.example.eventmanagement.Repository;

import com.example.eventmanagement.Entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository <Notification,Integer> {
}
