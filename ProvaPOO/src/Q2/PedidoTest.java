package Q2;

public class PedidoTest {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.addPedido("Carla");
        pedido.addPedido("Victor");
        pedido.addPedido("Manoel");
        pedido.addPedido("Joselita");
        pedido.addPedido("Helder");
        pedido.addPedido("Ingridy");

        pedido.mostrarPedidos();

    }
}
