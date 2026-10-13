public class Gerente extends Funcionario {
    private double bonusGerente;

    public Gerente(){
        this("sem nome", 0, 0);
    }
    public Gerente(String nome, double salario, double bonusGerente) {
        super(nome, salario); // chama construtor da superclasse
        this.bonusGerente = bonusGerente;
    }
    public double getBonusGerente() {
        return bonusGerente;
    }
    public void setBonusGerente(double bonusGerente) {
        this.bonusGerente = bonusGerente;
    }
    @Override // anulação de métodos
    public double calcularBonus(){
        return super.calcularBonus() + this.bonusGerente;
    }
    @Override
    public void exibeDados(){
        System.out.println("Bônus gerencial: " + this.bonusGerente);
        super.exibeDados();

    }
}
