package List2.Ex4;

public class Funcionario {
    private String nome;
    private double salario;

    public void setNome(String nome) {
        this.nome = nome;

    }

    public boolean setSalario(double salario) {
        if (salario < 0) {
            return false;

        }

        this.salario = salario;
        return true;

    }

    public double getSalario() {
        return salario;
    }

}
