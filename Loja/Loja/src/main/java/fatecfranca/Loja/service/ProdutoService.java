package fatecfranca.Loja.service;

import fatecfranca.Loja.model.Produto;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service // classe responsável pelas regras de negócio
public class ProdutoService {
    // cria o vetor
    List<Produto> produtos = new ArrayList<Produto>();
    private Long auxId = 1L;

    // busca os produto no vetor
    public List<Produto> consulta(){
        return this.produtos;
    }
    // busca o produtod com id
    public Produto consultaPorId(Long id){
        for(Produto prod: produtos){
            if (prod.getId().equals(id)){
                return prod;
            }
        }
        return null;
    }
    // insere produto no vetor
    public Produto insere(Produto produto){
        produto.setId(auxId); // define id pois usuário não informa
        produtos.add(produto); // adiciona no vetor
        auxId++; // incrementa para próxima inserção
        return produto; // retorna produto com o id
    }
    // remove produto no vetor
    public boolean remove(Long id){
        // percorre o vetor procurando por p que contém id igual ao informado no parâmetro
        return produtos.removeIf( p -> p.getId().equals(id));
    }
    // atualiza produto no vetor
    public Produto atualiza(Long id, Produto novo){
        // percorre o vetor procurando
        for(int i=0;i<produtos.size();i++){
            if (produtos.get(i).getId().equals(id)){ // verifica se achou
                novo.setId(id); // atualiza id
                produtos.set(i, novo); // atualiza novo no vetor na posição i
                return novo; // retorno produto atualizado
            }
        }
        return null; // não encontrou
    }
}
