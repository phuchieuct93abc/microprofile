package com.example.demo;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 *
 */
@RequestScoped
@Path("/hello")
@Consumes(MediaType.APPLICATION_JSON)
public class HelloController {

    @Inject
    PostRepository repo;

    @GET
    @Transactional
    public String sayHello() {

        Post post = new Post();
        post.setAuthor("Author Hieu Lam");
        repo.create(post);

        return "Insert success";
    }
}
