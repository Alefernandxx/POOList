package List2.Ex3;

public class Main {
    public static void main(String[] args) {
        Livro l = new Livro("Senhor dos Anéis", "Tolkien", 500);

        System.out.println("Titulo do Livro: " + l.getTitulo());
        System.out.println("Autor: " + l.getAutor());
        System.out.println("Número de páginas: " + l.getNumeroPaginas());
    }
}
