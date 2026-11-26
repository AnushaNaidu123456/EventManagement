package com.example.eventmanagement.Controller;

import com.example.eventmanagement.Entity.Notification;
import com.example.eventmanagement.Service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Notfication")
public class NotificationController {
    @Autowired
    NotificationService notificationService;
    @PostMapping("/insertall")
    public List<Notification> insertall(@RequestBody List<Notification> notifications){
        return notificationService.insertall(notifications);
    }
    @GetMapping("/fetchall")
    public List<Notification> fetchall(){
        return notificationService.fetchall();
    }
    @GetMapping("/fetchby/{id}")
    public Notification fetchby(@PathVariable Integer id){
        return notificationService.fetchby(id);
    }
    @PutMapping("/update/{id}")
    public Notification update(@RequestBody Notification notification,@PathVariable Integer id){
        return notificationService.update(notification,id);
    }
    @DeleteMapping("/delete/{id}")
    public Notification delete(@PathVariable Integer id){
        return notificationService.delete(id);
    }
}
