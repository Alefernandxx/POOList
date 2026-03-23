package List2.Ex8;

public class Funcionario {
    private String nome;
    private Departamento dptm;

    public Funcionario(Departamento dptm, String nome) {
        this.dptm = dptm;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Departamento getDptm() {
        return dptm;
    }

    @Override
    public String toString() {
        return "Funcionario: " + this.nome + " | " + " Setor: " + this.dptm.getNomeSetor();

    }

}
