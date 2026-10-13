public class FuncionarioApp {
    public static void aux(Funcionario f){
        f.exibeDados(); // polimórfico
    }
    public static void main(String[] args){

        Funcionario fu = new Funcionario("Breno", 3000);
        System.out.println("Dados do funcionário Breno");
        aux(fu);

        Gerente ge = new Gerente("Ana", 5000, 1000);
        System.out.println("Dados da gerente Ana");
        aux(ge); // f = ge

        Vendedor ve = new Vendedor("João", 4000, 5000);
        System.out.println("Dados do vendedor João");
        aux(ve); // f = ve


    }
}
