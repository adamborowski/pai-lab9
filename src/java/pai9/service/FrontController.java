/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pai9.service;

import javax.jws.WebService;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * REST Web Service
 *
 * @author adam
 */
@Path("/")
@WebService
public class FrontController {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of FrontController
     */
    public FrontController() {
        System.out.println("dzialasdsdsa");
    }

    @GET
    @Path("/route/{cmd}")
    @Consumes("text/html")
    public String process(@PathParam("cmd") String cmd) {
        return cmd + " : routed";
    }
}
