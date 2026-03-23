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

/*

Imagine que o Pedido é um Carrinho de Compras.

A List<ItemPedido> itens é o espaço vazio dentro do carrinho.

O método adicionarItem é o seu braço pegando um produto da prateleira.

O item (parâmetro) é o pacote de Café que você está segurando.

O this.itens.add(item) é o ato de soltar o café dentro do carrinho.

*/
