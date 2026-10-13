public class Retangulo extends Forma {
    private double base, altura;

    public Retangulo(String cor, double base, double altura){
        super(cor);
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea() {
        return (this.base * this.altura) / 2;
    }
}
