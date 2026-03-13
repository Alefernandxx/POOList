
package Ex5;

public class ItemPedido {

    private String nome;
    private double precoUnitario = 0;
    private int quantidade = 0;

    public ItemPedido(String nome, double precoUnitario, int quantidade) {
        this.nome = nome;

        setPrecoUnitario(precoUnitario);
        setQuantidade(quantidade);

    }

    public void setPrecoUnitario(double preco) {
        if (preco > 0) {
            this.precoUnitario = preco;

        }
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 1) {
            this.quantidade = quantidade;

        }
    }

    public double subtotal() {
        return this.precoUnitario * this.quantidade;
    }

}


/*

Se você fizesse this.precoUnitario = precoUnitario direto, você teria que repetir o código do if dentro do construtor E dentro do setter.

Chamando o set dentro do construtor, você segue o princípio DRY (Don't Repeat Yourself - Não se repita). 
Se amanhã você decidir que o preço mínimo de qualquer item deve ser R$ 0,50, você só precisa mudar em um lugar (no método setter), 
e o construtor automaticamente passará a seguir essa nova regra.

*/