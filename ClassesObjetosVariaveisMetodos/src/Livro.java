public class Livro {
    // variáveis de instância
    private String titulo;
    private String autor;
    private boolean disponivel;
    // variável de classe
    public static int totalLivros = 0;

    // métodos construtores - sobrecarga
    public Livro(){
        this("sem título", "sem autor");
    }
    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
        Livro.totalLivros++;
    }
    // método de classe
    public static int getTotalLivros(){
        return Livro.totalLivros;
    }
    // métodos de instância
    public void emprestar(){
        if (this.disponivel){
            this.disponivel = false;
            System.out.printf("Livro emprestado com sucesso");
        }
        else {
            System.out.println("Livro já emprestado");
        }
    }
    public void devolver(){
        this.disponivel = true;
        System.out.println("Livro devolvido com sucesso");
    }
    public void exibirFicha(){
        System.out.println("\nTítulo: " + this.titulo +
                " Autor: " + this.autor +
                " Status: " + (this.disponivel ? "Disponível": "Emprestado"));
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}