public class ContaBancaria{
    // variáveis de classe
    public static int totalContas = 0;
    public static final double TX_MANUT = 12;
    // variáveis de instância
    public String titular;
    public String numero;
    public double saldo;
    // métodos construtores
    // sobrecarga de métodos construtores
    public ContaBancaria(){
        // chama construtor de baixo
        this("Sem titular", "0000", 0);
    }
    public ContaBancaria(String titular, String numero, double saldo){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        totalContas++;
    }
    public void depositar(double x){
        if (x >= 0){
            this.saldo += x;
            System.out.println("Depósito de " + x + " efetuado com sucesso");
        }
    }
    public void saque(double x){
        if (x >= 0 && x <= this.saldo){
            this.saldo -= x;
            System.out.println("Saque efetuado com sucesso");
        }
    }
    public void mostra(){
        // this representa o objeto que chama o método
        System.out.println("Titular: " + this.titular +
                " Número: " + this.numero +
                " Saldo: " + this.saldo);
    }
}