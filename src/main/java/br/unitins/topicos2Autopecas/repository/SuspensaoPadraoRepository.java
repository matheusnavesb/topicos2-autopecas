package br.unitins.topicos2Autopecas.repository;

import br.unitins.topicos2Autopecas.model.SuspensaoPadrao;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SuspensaoPadraoRepository implements PanacheRepository<SuspensaoPadrao> {

    public PanacheQuery<SuspensaoPadrao> findByNome(String nome) {
        if (nome == null)
            return null;
        return find("UPPER(nome) LIKE ?1 ", "%" + nome.toUpperCase() + "%");
    }
}
