package com.ibrahni.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ibrahni.PostService;
import com.ibrahni.web.PostFactory;
import com.ibrahni.web.PostsApi;

@Configuration
@EnableJpaRepositories(basePackages = {
    "com.ibrahni"
})
public class ApplicationConfig {

    @Bean
    PostFactory postFactory() {
        return new PostFactory();
    }

    @Bean
    PostService postService() {
        System.out.println("createing postService");
        return new PostService();
    }

    @Bean
    PostsApi postsApi() {
        return new PostsApi(postService(), postFactory());
    }
}
