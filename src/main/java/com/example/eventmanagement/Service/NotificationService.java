package com.example.eventmanagement.Service;

import com.example.eventmanagement.Entity.Notification;
import com.example.eventmanagement.Repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {
    @Autowired
    NotificationRepository notificationRepository;
    public List<Notification> insertall(List<Notification> notifications) {
        return notificationRepository.saveAll(notifications);
    }

    public List<Notification> fetchall() {
        return notificationRepository.findAll();
    }

    public Notification fetchby(Integer id) {
        return notificationRepository.findById(id).orElse(null);
    }


    public Notification update(Notification notification, Integer id) {
        Notification notification1=notificationRepository.findById(id).orElse(null);
        if(notification1 != null){
            notification1.setNotification_type(notification.getNotification_type());
            return notificationRepository.save(notification1);
    }
        return null;
}

    public Notification delete(Integer id) {
        if(notificationRepository.existsById(id)){
             notificationRepository.deleteById(id);
        }
        return null;
    }
}
