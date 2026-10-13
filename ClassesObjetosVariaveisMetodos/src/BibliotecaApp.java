public class BibliotecaApp {

    public static void main(String[] args){
        // objetos da classe ou instâncias da classe
        Livro li1 = new Livro("A", "José");
        Livro li2 = new Livro("B", "Pedro");
        Livro li3 = new Livro();

        li1.emprestar();
        li1.exibirFicha();
        li1.devolver();
        li1.exibirFicha();

        li2.emprestar();
        li2.exibirFicha();
        li2.devolver();
        li2.exibirFicha();

        li3.emprestar();
        li3.exibirFicha();
        li3.devolver();
        li3.exibirFicha();

        System.out.println("Total de livros: " + Livro.getTotalLivros());
    }
}
