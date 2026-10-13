public class CartaoCredito implements Pagavel {


    @Override
    public void pagar(double valor) {
        System.out.println("Fatura do cartão de crédito pago no valor de R$ " + valor);
    }
}
