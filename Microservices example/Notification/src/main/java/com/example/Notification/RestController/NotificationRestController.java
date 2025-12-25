package com.example.Notification.RestController;

import com.example.Notification.Model.Notification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class NotificationRestController {
    // this is one exposed API
    @GetMapping("/notifications/{nid}")
    public Notification getNotification(@PathVariable("nid") int nid){
        Notification notification1 = new Notification(nid, "Notification from "+nid);
        return notification1;
    }
}
