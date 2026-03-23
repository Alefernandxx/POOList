package List2.Ex15;

public class Main {

    public static void main(String[] args) {
        Biblioteca bib = new Biblioteca();

        Autor a1 = new Autor("J.R.R. Tolkien");
        Autor a2 = new Autor("Machado de Assis");
        Autor a3 = new Autor("George Orwell");
        Autor a4 = new Autor("Stephen King");

        Livro l1 = new Livro("Senhor dos anéis", a1);
        bib.addLivro(l1);
        Livro l2 = new Livro("Dom Casmurro", a2);
        bib.addLivro(l2);
        Livro l3 = new Livro("1984", a3);
        bib.addLivro(l3);
        Livro l4 = new Livro("It: A Coisa", a4);
        bib.addLivro(l4);

        System.out.println("Quantidade de livros: " + bib.contagemLivros());
        for (Livro livro : bib.getAcervo()) {
            System.out.println(livro);

        }

    }

}
