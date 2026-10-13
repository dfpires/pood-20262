package exe1;

public class BibliotecaApp {
    public static void main(String[] args){
        // vamos criar 3 livros
        Livro li1 = new Livro("Java", "Deitel", "Campus", 2022);
        Livro li2 = new Livro("C++", "Gustavo", "Novatec", 2023);
        Livro li3 = new Livro("Python", "Carlos", "Bookman", 2021);

        // cria biblioteca
        Biblioteca bi1 = new Biblioteca("Bora pra cima", "Rua dos Programadores, 1001");
        // adiciona livros na biblioteca
        bi1.adicionaLivro(li1);
        bi1.adicionaLivro(li2);
        bi1.adicionaLivro(li3);
        // exibe acervo
        bi1.consultaAcervo();

        bi1.emprestar("Python");
    }
}
