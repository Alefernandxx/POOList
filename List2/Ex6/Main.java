package List2.Ex6;

public class Main {
    public static void main(String[] args) {

        Cliente c = new Cliente("Alessandro", "11111111111");

        Pedido p = new Pedido(1, 50, c);

        p.cliente = c;

        System.out.println("O cliente " + p.cliente.nome + " com cpf " + p.cliente.cpf + " e numero de pedido "
                + p.numeroPedido + " fez um pedido no valor total de " + p.valorTotal + "R$ ");

    }
}
