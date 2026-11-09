package api_bd2.api_bd2.service;

import api_bd2.api_bd2.model.Produto;
import api_bd2.api_bd2.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    // vamos criar o objeto da Injeção de dependência
    private ProdutoRepository produtoRepository;
    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }
    // consulta os produtos no BD
    public List<Produto> listar(){
        return produtoRepository.findAll(); // select * from produtos
    }
    // consulta um produto com id no BD
    public Optional<Produto> buscar(Long id){
        return produtoRepository.findById(id);

    }
}
