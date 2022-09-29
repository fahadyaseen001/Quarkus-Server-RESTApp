package org.acme;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hi")
public class sender {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public senderDTO hello(@BeanParam senderDTO dto) {
        senderDTO a = new senderDTO();
        a.setId("11");
        a.setName("AJ");
        a.setReg_no("sp20-bcs-127");
        
    
        return a;
    }
}