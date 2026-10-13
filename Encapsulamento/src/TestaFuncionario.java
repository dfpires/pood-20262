public class TestaFuncionario {
    public static void main(String[] args){
        // usa construtor padrão
        Funcionario f1 = new Funcionario();
        f1.setNome("Carlos de Almeida");
        f1.setSalario(3500);
        f1.setCargaHorariaSemanal(30);

        System.out.println("Nome: " + f1.getNome());
        f1.exibeDados();

        Funcionario f2 = new Funcionario("Marcos", -400, 50);
        f2.exibeDados();

    }
}
