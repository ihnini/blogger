package com.ibrahni;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/posts")
@Produces("application/json")
@Consumes("application/json")
public class PostsApi {

    @GET
    @Path("/")
    public Response posts() {
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
