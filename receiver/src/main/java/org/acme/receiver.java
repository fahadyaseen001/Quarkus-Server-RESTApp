package org.acme;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/hello")
public class receiver {

   @Inject
   @RestClient
   MyRemoteService rms; 

   @GET
   @Produces(MediaType.APPLICATION_JSON)
   public senderDTO hello()
   {
    return rms.hello();
   }
}