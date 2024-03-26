package br.unitins.topicos2Autopecas.resource;

import br.unitins.topicos2Autopecas.dto.SuspensaoPadraoDTO;
import br.unitins.topicos2Autopecas.service.SuspensaoPadraoServiceImpl;
import jakarta.enterprise.context.ApplicationScoped;
//import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
//import jakarta.ws.rs.core.Response;

@ApplicationScoped
@Path("suspensaopadrao")
public class SuspensaoPadraoResource extends PecaResource<SuspensaoPadraoServiceImpl, SuspensaoPadraoDTO> {

    // @GET
    // public Response findAll() {
    //     return Response.ok(service.getAll()).build();
    // }
}
