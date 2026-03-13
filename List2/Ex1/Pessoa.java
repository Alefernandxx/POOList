package List2.Ex1;

public class Pessoa {

    private String nome;
    private int idade;

    public void setNome(String nome) { // (String nome) = parâmetro
        this.nome = nome; // pega o valor do String nome e guarda no atributo private String nome;

    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;  // pega o valor do int idade e guarda no atributo private int idade;

    }

    public int getIdade(){
        return idade;
    }
}
