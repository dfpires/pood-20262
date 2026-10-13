package fatecfranca.Loja.controller;

import fatecfranca.Loja.model.Produto;
import fatecfranca.Loja.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController // responde requisição REST
@RequestMapping("/produtos") // endpoint
public class ProdutoController {
    // cria objeto da classe ProdutoService
    ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService){
        this.produtoService = produtoService;
    }
    @GetMapping
    public ResponseEntity<List<Produto>> consulta(){
        // retorna statusCode 200 - ok
        return ResponseEntity.ok(produtoService.consulta());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> consultaPorId(@PathVariable Long id){
        Produto prod = produtoService.consultaPorId(id);
        if (prod != null) {
            return ResponseEntity.ok(prod); // statusCode 200
        }
        else return ResponseEntity.notFound().build(); // statusCode 404
    }

    @PostMapping
    public ResponseEntity<Produto> insere(@RequestBody Produto produto){
        Produto novo = produtoService.insere(produto); // chama service
        // URI - Uniform Resource Identifier
        URI uri = URI.create("/produtos/"+novo.getId()); // criando uma rota única
        return ResponseEntity.created(uri).body(novo); // retorna produto criado
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id){
        boolean resp = produtoService.remove(id);
        if (resp) {
            return ResponseEntity.noContent().build(); // removeu - statusCode 204
        }
        return ResponseEntity.notFound().build(); // não removeu - statusCode 404
    }
    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizar(@PathVariable Long id,
                                             @RequestBody Produto produto){
        Produto atualizado = produtoService.atualiza(id, produto);
        if (atualizado != null){
            return ResponseEntity.ok(atualizado); // 200
        }
        return ResponseEntity.notFound().build(); // 404
    }
}
