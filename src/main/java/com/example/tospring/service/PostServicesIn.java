package com.example.tospring.service;

import com.example.tospring.data.model.Post;
import com.example.tospring.dto.request.DeleteRequest;
import com.example.tospring.dto.request.PostRequest;

import java.util.List;
import java.util.UUID;

public interface PostServicesIn {
    List<Post> submitPost(Post request);
    List<Post> retrievePost();
    List<Post> deletePost(Post postId);
}
