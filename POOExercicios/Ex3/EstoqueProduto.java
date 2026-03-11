package Ex3;

public class EstoqueProduto {

    private String nome;
    private int quantidade;

    public EstoqueProduto(String nomeInicial, int qtdInicial) {
        nome = nomeInicial;
        quantidade = qtdInicial;
    }

    public void entrada(int qtd) {
        if (qtd > 0) {
            quantidade = quantidade + qtd;

        }
    }

    public boolean saida(int qtd) {
        if (qtd <= 0 || qtd > quantidade) {
            return false;

        }

        quantidade = quantidade - qtd;
        return true;

    }

    public int quantidadeAtual() {
        return quantidade;
    }

    public String nome() {
        return nome;
    }

}
