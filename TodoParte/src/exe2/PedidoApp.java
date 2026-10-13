package exe2;

import java.time.LocalDateTime;

public class PedidoApp {
    public static void main(String[] args){
        Pedido ped1 = new Pedido(1, LocalDateTime.now(), "Maria Julia");

        ped1.adicionaItemPedido("Bola de basquete", 400, 1);
        ped1.adicionaItemPedido("Raquete BT", 1200, 2);
        ped1.adicionaItemPedido("Luva de Boxe", 1500, 1);

        System.out.println("Valor total do pedido " + ped1.getValor());
        ped1.exibeItens();
    }
}
