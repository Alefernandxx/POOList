package List2.Ex6;

public class Pedido {

    public int numeroPedido;
    public double valorTotal;
    public Cliente cliente;

    public Pedido(int numeroPedido, double valorTotal, Cliente cliente) {
        this.numeroPedido = numeroPedido;
        this.valorTotal = valorTotal;
        this.cliente = cliente;

    }

}
