package api_bd2.api_bd2.controller;

import api_bd2.api_bd2.model.Produto;
import api_bd2.api_bd2.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return ResponseEntity.ok(produtoService.listar());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Produto>> buscar(@PathVariable Long id){
        Optional<Produto> prod = produtoService.buscar(id);
        if (prod.isPresent()){
            return ResponseEntity.ok(prod);
        }
        else {
            return ResponseEntity.notFound().build(); // erro 404
        }
    }
}
