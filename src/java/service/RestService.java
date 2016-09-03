/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author FATEN
 */
@Path("service")
public class RestService {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RestService
     */
    public RestService() {
    }

    /**
     * Retrieves representation of an instance of service.RestService
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/html")
    public String getHtml() {
     return "<html><body>the solution is :</body></html> ";
    }

    @GET
    @Path("solution")
    @Produces("text/html")
    public String getSolution(@QueryParam("a") int a,@QueryParam("b") int b,@QueryParam("c") int c) {
        double s=Math.pow(b,2)-4*a*c;
        double x1=(-b-Math.sqrt(s))/(2*a);
         double x2=(-b+Math.sqrt(s))/(2*a);
        
     return "<html><body>the solutions are :"+x1+" and "+x2+"</body></html> ";
    }
    /**
     * PUT method for updating or creating an instance of RestService
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/html")
    public void putHtml(String content) {
    }
}
