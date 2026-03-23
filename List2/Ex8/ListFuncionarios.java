package List2.Ex8;

import java.util.ArrayList;
import java.util.List;

public class ListFuncionarios {

    private List<Funcionario> funcionarios;

    public List<Funcionario> getFunc() {
        return this.funcionarios;

    }

    public ListFuncionarios() {
        this.funcionarios = new ArrayList<>();
    }

    public void addFuncionario(Funcionario f) {
        this.funcionarios.add(f);

    }

    public int contagemFuncionarios() {
        return this.funcionarios.size();

    }
}
