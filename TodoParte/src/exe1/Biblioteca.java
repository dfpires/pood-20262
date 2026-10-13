package exe1;

import java.util.ArrayList;

public class Biblioteca {
    private String nome, endereco;
    // vetor de livros - associação
    private ArrayList<Livro> livros;

    public Biblioteca(){
        this("sem nome", "sem endereço");
    }
    public Biblioteca(String nome, String endereco){
        this.setNome(nome); this.setEndereco(endereco);
        // aloca espaço na memória para o vetor
        livros = new ArrayList<Livro>();
    }
    // adiciona livro - agregação (livro já vem criado
    public void adicionaLivro(Livro livro){
        this.livros.add(livro);
    }
    // consulta acervo
    public void consultaAcervo(){
        // percorre o vetor de livros
        for(Livro livro : this.livros){ // para cada livro do vetor livros
            System.out.println("Título: " + livro.getTitulo() + " Autor: " + livro.getAutor());
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void emprestar(String titulo){

        for(Livro livro: this.livros){
            if (livro.getTitulo().equals(titulo)){
                livro.emprestar(); // emprestou o livro
            }
        }
    }

}