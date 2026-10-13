public class ProdutoApp {
    public static void main(String[] args) {

        // criando objetos (instâncias) a partir da classe, usando os dois construtores
        Produto produto1 = new Produto("Notebook", 3500.0, 10);
        Produto produto2 = new Produto("Mouse", 45.90, 50);
        Produto produto3 = new Produto();   // construtor padrão

        // vendendo unidades
        produto1.vender(3);
        produto2.vender(60);   // maior que o estoque -> "Estoque insuficiente"

        // repondo estoque
        produto3.repor(20);

        // exibindo os dados de cada produto
        produto1.exibirDados();
        System.out.println("------");
        produto2.exibirDados();
        System.out.println("------");
        produto3.exibirDados();
        System.out.println("------");

        // total de produtos cadastrados, via método de classe (static)
        System.out.println("Total de produtos: " + Produto.getTotalProdutos());
    }
}
