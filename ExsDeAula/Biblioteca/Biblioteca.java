package ExsDeAula.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> acervo;

    public Biblioteca() {
        this.acervo = new ArrayList<Livro>();

    }

    public void addLivro(Livro livro) {
        acervo.add(livro);
    }

    public int contagemLivros() {
        return this.acervo.size();
    }

    public List<Livro> getAcervo() {
        return this.acervo;
    }

    public void emprestar(Livro livro, Pessoa pessoa) {
        livro.indicarEmprestimo(pessoa);
    }
}
