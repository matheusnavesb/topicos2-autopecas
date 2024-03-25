package br.unitins.topicos2Autopecas.resource;

import br.unitins.topicos2Autopecas.dto.SuspensaoPadraoDTO;
import br.unitins.topicos2Autopecas.service.SuspensaoPadraoServiceImpl;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Path;

@ApplicationScoped
@Path("suspensaopadrao")
public class SuspensaoPadraoResource extends PecaResource<SuspensaoPadraoServiceImpl, SuspensaoPadraoDTO> {

}
