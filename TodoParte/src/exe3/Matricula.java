package exe3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Matricula {
    private int nro;
    private LocalDateTime data;
    private float nota;
    private Aluno aluno;
    private Disciplina disciplina;

    public Matricula() {
        this(0, LocalDateTime.now(), null, null);
    }

    public Matricula(int nro, LocalDateTime data, Aluno aluno, Disciplina disciplina) {
        this.nro = nro;
        this.data = data;
        this.nota = 0;
        this.aluno = aluno;
        this.disciplina = disciplina;
    }

    public static Matricula matricular(int nro, Aluno aluno, Disciplina disciplina){
        Matricula m = new Matricula(nro, LocalDateTime.now(), aluno, disciplina);
        aluno.adicionaMatricular(m);
        disciplina.adicionarMatricula(m);
        System.out.println("Matrícula realizada com sucesso");
        return m;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        System.out.println(data);
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return "Matricula{" +
                "nro=" + nro +
                ", data=" + data.format(formatador) +
                ", nota=" + nota +
                ", aluno=" + aluno +
                ", disciplina=" + disciplina +
                '}';
    }
}
