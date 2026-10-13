public class Funcionario {
    private String nome;
    private double salario;
    private int cargaHorariaSemanal;

    public Funcionario(){
        this("sem nome", 0.0, 1);
    }
    public Funcionario(String nome, double salario, int cargaHorariaSemanal){
        this.setNome(nome);
        this.setSalario(salario);
        this.setCargaHorariaSemanal(cargaHorariaSemanal);
    }
    public void setNome(String nome){
        if (nome.isEmpty() || nome.length() > 50){
            System.out.println("Nome é inválido");
        }
        else {
            this.nome = nome;
        }
    }
    public void setSalario(double salario){
        if (salario >= 0){
            this.salario = salario;
        }
        else {
            System.out.println("Salário inválido");
        }
    }
    public void setCargaHorariaSemanal(int cargaHorariaSemanal){
        if (cargaHorariaSemanal >= 1 && cargaHorariaSemanal <= 44){
            this.cargaHorariaSemanal = cargaHorariaSemanal;
        }
        else {
            this.cargaHorariaSemanal = 1;
            System.out.println("Carga horária semanal inválida");
        }
    }
    // getters
    public String getNome(){ return this.nome; }
    public double getSalario(){ return this.salario; }
    public int getCargaHorariaSemanal(){ return this.cargaHorariaSemanal; }

    public void exibeDados(){
        System.out.println("Nome: " + this.nome +
                " Salário: " + this.salario +
                " Carga horária semanal: " + this.cargaHorariaSemanal);
    }
}