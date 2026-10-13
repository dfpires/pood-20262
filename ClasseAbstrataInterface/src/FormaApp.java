import java.util.ArrayList;

public class FormaApp {
    public static void main(String[] args){
        ArrayList<Forma> formas = new ArrayList<>();

        formas.add(new Circulo("branco", 2.45));
        formas.add(new Circulo("amarelo", 1.30));
        formas.add(new Retangulo("azul",  2.3, 4.2));
        formas.add(new Retangulo("preto",  9.8, 7.4));

        for(Forma f : formas){
            System.out.printf("Valor da área: %.2f \n", f.calcularArea()); // polimorfismo
        }
    }

}
