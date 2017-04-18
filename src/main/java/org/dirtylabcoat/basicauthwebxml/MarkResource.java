package org.dirtylabcoat.basicauthwebxml;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("mark")
public class MarkResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String mark() {
        return "Let's mark out!";
    }
}
