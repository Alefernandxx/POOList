package List2.Ex14;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

    private List<Usuario> metodo;

    public List<Usuario> getMetodo() {
        return metodo;
    }

    public Sistema() {
        this.metodo = new ArrayList<>();
    }

    public void addUsuario(Usuario u) {
        this.metodo.add(u);

    }

    public int contagemUsuarios() {
        return this.metodo.size();
    }

    public void alterarEmailUsuario(Usuario u, String novoEmail) {
        u.setEmail(novoEmail); // O sistema "manda" o usuário trocar o e-mail
        System.out.println("E-mail alterado com sucesso para: " + u.getNome());
    }

}
