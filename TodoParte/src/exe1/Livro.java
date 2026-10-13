package exe1;

public class Livro {
    private String titulo, autor, editora;
    private int ano;
    private boolean disponivel;

    public Livro(){
        this("sem título", "sem autor", "sem editora", 0);
    }
    public Livro(String titulo, String autor, String editora, int ano){
        this.setTitulo(titulo); this.setAutor(autor);
        this.setEditora(editora); this.setAno(ano);
        this.disponivel = true;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return this.autor;
    }
    public String getEditora(){
        return this.editora;
    }
    public int getAno(){
        return this.ano;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar(){
        this.disponivel = false;
    }
}