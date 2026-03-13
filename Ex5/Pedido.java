package Ex5;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<ItemPedido> itens = new ArrayList<>();

    public void adicionarItem(ItemPedido item) {
        this.itens.add(item);
    }

    public int quantidadeDeItens() {
        return this.itens.size();
    }

    public double total() {
        double somaTotal = 0;

        for (ItemPedido item : itens) {
            somaTotal += item.subtotal();
        }

        return somaTotal;
    }

}
