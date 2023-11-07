package Q2;
public class Pedido {
    ListBlock listBlock = new ListBlock();
    Fila fila = new Fila();
    public void addPedido(String nomeDoGarcom){
        fila.add(nomeDoGarcom);
    }

    public void mostrarPedidos(){
        fila.imprime();
    }

}
