public class Funcionario {
    // protected => deixa a variável pública para as filhas
    protected String nome;
    protected double salario;

    public Funcionario() {
        this("sem nome", 0);
    }
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // calcula bônus para qualquer tipo de funcionário
    public double calcularBonus(){
        return this.salario * 0.15; // 15% de bônus
    }
    public void exibeDados(){
        System.out.println("Nome: " + this.nome +
                " Salário: " + this.salario +
                " Bônus: " + this.calcularBonus() +
                " Total a receber " + (this.calcularBonus() + this.salario));
    }
}