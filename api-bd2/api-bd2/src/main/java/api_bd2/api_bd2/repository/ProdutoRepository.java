package api_bd2.api_bd2.repository;

import api_bd2.api_bd2.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// interface herda de outra interface, chamada JpaRepository
// ProdutoRepository vai possuir os métodos de CRUD da entidade Produto
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // teremos aqui insere, remove, consulta, atualiza da classe Produto
}
