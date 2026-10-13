package exe3;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String cpf;
    private ArrayList<Matricula> matriculas;

    public Aluno() {
        this("sem nome", "sem cpf");
    }

    public Aluno(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.matriculas = new ArrayList<>();
    }

    // adiciona matrícula no aluno
    public void adicionaMatricular(Matricula matricula){
        this.matriculas.add(matricula);
    }

    public void listaDisciplinas(){
        System.out.println("Disciplinas matriculadas pelo aluno");
        for(Matricula matricula: this.matriculas){ // for-each
            System.out.println(matricula.getDisciplina().getNome());
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
