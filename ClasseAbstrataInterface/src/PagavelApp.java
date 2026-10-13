import java.util.ArrayList;

public class PagavelApp {
    public static void main(String[] args){
        ArrayList<Pagavel> pagamentos = new ArrayList<>();

        pagamentos.add(new Boleto());
        pagamentos.add(new CartaoCredito());
        pagamentos.add(new CartaoCredito());
        pagamentos.add(new Boleto());

        for(Pagavel obj: pagamentos){
            obj.pagar(140.45); // polimorfismo
        }
    }
}
