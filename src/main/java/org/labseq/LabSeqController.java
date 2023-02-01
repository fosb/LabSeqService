package org.labseq;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.math.BigInteger;

@Path("/labseq/{inputNumber}")
public class LabSeqController {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String compute(@PathParam("inputNumber") String inputNumber) {
        return Labseq.cachedCompute(new BigInteger(inputNumber)).toString();
    }
}