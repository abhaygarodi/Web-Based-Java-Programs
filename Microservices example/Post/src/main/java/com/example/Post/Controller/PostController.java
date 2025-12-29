package com.example.Post.Controller;

import com.example.Post.Model.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PostController {
    @GetMapping("/posts/{pid}")
    public Post getPost(@PathVariable("pid") int pid){
        Post post1 = new Post(pid, "This is from post "+pid);
        return post1;
    }
}
