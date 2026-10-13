public class Circulo extends Forma {
    private double raio;

    public Circulo(String cor, double raio){
        super(cor);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
