public class Produto {

    // variável de classe (static) - compartilhada por todos os produtos
    public static int totalProdutos = 0;

    // variáveis de instância
    public String nome;
    public double preco;
    public int quantidadeEstoque;

    // construtor padrão
    public Produto() {
        this("Produto sem nome", 0.0, 0);
    }

    // construtor com parâmetros
    public Produto(String nome, double preco, int quantidadeInicial) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeInicial;
        totalProdutos++;
    }

    // métodos de instância
    public void vender(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidadeEstoque) {
            this.quantidadeEstoque -= quantidade;
        } else {
            System.out.println("Estoque insuficiente");
        }
    }

    public void repor(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEstoque += quantidade;
        }
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: R$ " + preco);
        System.out.println("Estoque: " + quantidadeEstoque);
    }

    // método de classe (static)
    public static int getTotalProdutos() {
        return totalProdutos;
    }
}
