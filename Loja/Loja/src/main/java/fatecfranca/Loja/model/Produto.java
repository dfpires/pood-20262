package fatecfranca.Loja.model;
public class Produto {
    private Long id;
    private String nome;
    private int qtde;
    private double preco;

    public Produto(){
    }
    public Produto(Long id, String nome, int qtde, double preco) {
        this.id = id;
        this.nome = nome;
        this.qtde = qtde;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
