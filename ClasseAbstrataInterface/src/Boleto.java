public class Boleto implements Pagavel{

    @Override
    public void pagar(double valor) {
        System.out.println("Boleto pago no valor de R$ " + valor);
    }

}
