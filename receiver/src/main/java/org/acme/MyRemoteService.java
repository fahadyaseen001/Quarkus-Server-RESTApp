package org.acme;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.List;
import java.util.Set;

@Path("/hi")
@RegisterRestClient
public interface MyRemoteService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public senderDTO hello();
}
