package com.mycompany.app;

import javax.ejb.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Singleton
@Path("/")
public class HelloWorld {
    @GET
    public String getMessage() {
        return "Hello World!";
    }
}