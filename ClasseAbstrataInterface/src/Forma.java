// classe abstrata
public abstract class Forma {
    protected String cor;
    public Forma(String cor){
        this.cor = cor;
    }
    // método abstrato
    public abstract double calcularArea();
}