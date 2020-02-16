package com.ibrahni;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> findAll() {
        return Collections.emptyList();
    }
}
