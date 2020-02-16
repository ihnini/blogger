package com.ibrahni.web;

import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.ibrahni.PostService;
import com.sun.jersey.api.core.InjectParam;

@Path("/posts")
@Produces("application/json")
@Consumes("application/json")
@Component
public class PostsApi {

    private static final Logger LOGGER = Logger.getLogger(PostsApi.class.getName());

    @InjectParam
    private PostService postService;

    @InjectParam
    private PostFactory postFactory;

    @GET
    @Path("/")
    public Response posts() {
        return Response.ok(postFactory.create(postService.findAll())).build();
    }

    @GET
    @Path("/{postId}")
    public Response post(@QueryParam("postId") String id) {
        return Response.ok().build();
    }

    @PUT
    public Response create() {
        return Response.ok().build();
    }

    @PATCH
    @Path("/{postId}")
    public Response update(@PathParam("postId") String id) {
        return Response.ok().build();
    }

    @DELETE
    @Path("/{postId}")
    public Response delete() {
        return Response.ok().build();
    }
}
