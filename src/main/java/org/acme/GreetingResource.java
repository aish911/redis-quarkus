package org.acme;

import io.quarkus.runtime.Application;
import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


import java.util.List;

@Path("/hello")
public class GreetingResource {

    @Inject
    ResdisService service;

    @GET
    @Path("/all")
    public Uni<List<String>> keys() {
        return service.keys();
    }
    @POST
    public Response create(@QueryParam("key") String key, @QueryParam("value") long value) {
        service.set(key, value);
        return Response.ok().build();
    }

    @GET
    public long get(@QueryParam("key") String key) {
        //return new KeyValue(key, service.get(key));
        return service.get(key);
    }
}
