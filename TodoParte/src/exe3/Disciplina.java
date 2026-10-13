package exe3;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private String sigla;
    private ArrayList<Matricula> matriculas;

    public Disciplina() {
        this("sem nome", "sem sigla");
    }

    public Disciplina(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
        this.matriculas = new ArrayList<>();
    }

    // adiciona matrícula na disciplina
    public void adicionarMatricula(Matricula matricula){
        this.matriculas.add(matricula);
    }

    public void listaAlunos(){
        System.out.println("Lista de alunos: ");
        for(Matricula matricula: this.matriculas){
            System.out.println(matricula.getAluno().getNome());
        }
    }
    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", sigla='" + sigla + '\'' +
                '}';
    }
}
