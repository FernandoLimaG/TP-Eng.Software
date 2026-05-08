package br.pucminas.ec.gestor_estoque_pereciveis.repository;

import br.pucminas.ec.gestor_estoque_pereciveis.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}