package ExsDeAula.Biblioteca;

public class Livro {

    private String titulo;
    private String autor;
    private Pessoa emprestado;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = null;

    }

    public void indicarEmprestimo(Pessoa p) {
        if (this.emprestado == null) {
            this.emprestado = p;

        }

    }

    public void indicarDevolucao() {
        this.emprestado = null;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return (this.emprestado == null ? "[DISPONIVEL]" : "[EMPRESTADO]") + this.titulo + " - " + this.autor;
    }

}
