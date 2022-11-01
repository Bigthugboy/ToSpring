package com.example.tospring.service;

import com.example.tospring.data.model.Post;
import com.example.tospring.data.repository.PostRepository;
import com.example.tospring.dto.request.DeleteRequest;
import com.example.tospring.dto.request.PostRequest;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import lombok.AllArgsConstructor;
import org.hibernate.type.LocalDateTimeType;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class PostServices implements PostServicesIn{
    private final PostRepository postRepository;

    @Override
    public List<Post> submitPost(Post request) {
        Date date = new Date();
        long time = date.getTime();
        Timestamp dateTime = new Timestamp(time);
        request.setPostId(UUID.randomUUID());
       request.setLikes(0);
       request.setDateTime(dateTime);
        postRepository.save(request);
       List<Post> result = retrievePost();
       return result;
    }

    @Override
    public List<Post> retrievePost() {
        List<Post> result =  postRepository.findAll();
        return result;
    }

    @Override
    public List<Post> deletePost(Post postId) {
        postRepository.delete(postId);
        List<Post> result = retrievePost();
        return result;
    }
}
