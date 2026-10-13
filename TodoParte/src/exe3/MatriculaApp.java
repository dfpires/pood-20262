package exe3;

public class MatriculaApp {
    public static void main(String[] args){
        Aluno carla = new Aluno("Carla", "123");
        Aluno bruno = new Aluno("bruno", "456");
        Disciplina poo = new Disciplina("Programação OO", "poo");
        Disciplina bd = new Disciplina("Banco de Dados", "BD");

        Matricula mat1 = Matricula.matricular(1001, carla, poo);
        Matricula mat2 = Matricula.matricular(1002, carla, bd);
        Matricula mat3 = Matricula.matricular(1003, bruno, bd);

        carla.listaDisciplinas();
        bd.listaAlunos();


    }
}
