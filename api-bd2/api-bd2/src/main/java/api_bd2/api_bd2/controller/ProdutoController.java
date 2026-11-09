package api_bd2.api_bd2.controller;

import api_bd2.api_bd2.model.Produto;
import api_bd2.api_bd2.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    // objeto da injeção da dependência
    private ProdutoService produtoService;
    public ProdutoController(ProdutoService produtoService){
        this.produtoService = produtoService;
    }
    @GetMapping
    public ResponseEntity<List<Produto>> listar(){
        return ResponseEntity.ok(produtoService.listar()); // 200
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Produto>> buscar(@PathVariable Long id){
        Optional<Produto> prod = produtoService.buscar(id);
        if (prod.isPresent()){
            return ResponseEntity.ok(prod); // 200
        }
        else {
            return ResponseEntity.notFound().build(); // erro 404
        }
    }

    // insere produto no BD
    @PostMapping
    public ResponseEntity<Produto> criar(@RequestBody Produto produto){
        // efetivamente criou o produto no BD
        Produto novo = produtoService.criar(produto);
        URI uri = URI.create("/produto/"+ novo.getId());
        return ResponseEntity.created(uri).body(novo); // 201
    }
    // remover um produto
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remove(@PathVariable Long id){
        if (produtoService.remover(id)){
            // removeu com sucesso, retorna 200
            return ResponseEntity.noContent().build();
        }
        // não removeu
        return ResponseEntity.notFound().build(); // 404
    }
}
