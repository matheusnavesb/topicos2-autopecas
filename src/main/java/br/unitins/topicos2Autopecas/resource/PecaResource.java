package br.unitins.topicos2Autopecas.resource;

import br.unitins.topicos2Autopecas.dto.PecaDTO;
import br.unitins.topicos2Autopecas.service.PecaService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

@SuppressWarnings("rawtypes")
@Path("/pecas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public abstract class PecaResource<S extends PecaService, DTO extends PecaDTO> {

    @Inject
    S service;

    @SuppressWarnings("unchecked")
    @POST
    //@Path("/create/")
    public Response create(@Valid DTO dto) {
        return Response.status(Response.Status.CREATED).entity(service.create(dto)).build();
    }

    @SuppressWarnings("unchecked")
    @PUT
    @Transactional
    @Path("/{id}")
    public Response update(DTO dto, @PathParam("id") Long id) {
        return Response.status(Response.Status.ACCEPTED).entity(service.update(id, dto)).build();
    }


    @DELETE
    @Transactional
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id) {
        service.delete(id);
        return Response.status(Status.NO_CONTENT).build();
    }
    
    @GET
    @Path("/{id}")
    public Response findById(@PathParam("id") Long id) {
        return Response.ok().entity(service.findById(id)).build();
    }

    @GET
    public Response findAll() {
        return Response.ok(service.getAll()).build();
    }
}
