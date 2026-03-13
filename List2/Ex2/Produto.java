package List2.Ex2;

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;

    }

    public void exibirDados() {
        System.out.println("Nome do Produto: " + getNome());
        System.out.println("Preço: " + getPreco());
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return this.nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }

}
