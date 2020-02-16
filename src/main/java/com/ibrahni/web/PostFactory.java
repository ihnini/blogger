package com.ibrahni.web;

import java.util.List;
import java.util.stream.Collectors;

import com.ibrahni.Post;

public class PostFactory {
    public List<PostData> create(List<Post> posts) {
        return posts.stream().map(this::create).collect(Collectors.toList());
    }

    public PostData create(Post post) {
        return new PostData(post.getId(), post.getTitle(), post.getContent(), post.getWriter() != null ? post.getWriter().getId() : null);
    }
}
