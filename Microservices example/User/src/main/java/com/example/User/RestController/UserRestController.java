package com.example.User.RestController;


import com.example.User.Model.Notification;
import com.example.User.Model.Post;
import com.example.User.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class UserRestController {
    // creating restapis
    private RestTemplate restTemplate;

    @Autowired
    public UserRestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/users/{userid}")
    public User getUsers(@PathVariable("userid") int uid){
        Post post = restTemplate.getForObject("http://POST/posts/1", Post.class);
        Notification notification = restTemplate.getForObject("http://NOTIFICATION/notifications/1", Notification.class); // notification.class is the type of the response
        User user1 = new User(uid, "Tejas", post, notification); // will get converted to json object
        return user1;
    }
}
