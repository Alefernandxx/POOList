package List2.Ex15;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> acervo;

    public List<Livro> getAcervo() {
        return acervo;
    }

    public Biblioteca() {
        this.acervo = new ArrayList<>();
    }

    public void addLivro(Livro livro) {
        acervo.add(livro);

    }

    public int contagemLivros() {
        return this.acervo.size();

    }

    

}
