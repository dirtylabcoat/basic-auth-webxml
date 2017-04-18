package org.dirtylabcoat.basicauthwebxml;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("worker")
public class WorkerResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String work() {
        return "Let's work!";
    }
}
