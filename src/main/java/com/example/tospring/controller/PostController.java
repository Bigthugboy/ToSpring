package com.example.tospring.controller;

import com.example.tospring.data.model.Post;
import com.example.tospring.dto.request.DeleteRequest;
import com.example.tospring.dto.request.PostRequest;
import com.example.tospring.service.PostServices;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/postService")
@AllArgsConstructor
public class PostController {

   private  PostServices postServices;

    @PostMapping("/save")
    public List<Post>submitPost(@RequestBody Post body){
        return postServices.submitPost(body);


    }
    @GetMapping("/getPost")
    public List<Post> retrieveAllPost(){
        return postServices.retrievePost();
    }
    @GetMapping("/delete/{postId}")
    public List<Post> deleteParticularPost(@PathVariable("postId") Post postId){
        return postServices.deletePost(postId);
    }

}
