package com.example.tospring.data.repository;

import com.example.tospring.data.model.Post;
import com.example.tospring.dto.request.DeleteRequest;
import com.example.tospring.dto.request.PostRequest;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PostRepository extends JpaRepository<Post,Long> {
   





}
