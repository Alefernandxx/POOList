package ExsDeAula.Biblioteca;

public class Main {

    public static void main(String[] args) {
        Biblioteca bib = new Biblioteca();

        Livro poo = new Livro("POO", "MARCIO");
        bib.addLivro(poo);
        Livro web = new Livro("WEBII", "VINICIUS");
        bib.addLivro(web);
        bib.addLivro(new Livro("BANCO", "IGOR"));


        Pessoa vini = new Pessoa("vini");
        bib.emprestar(poo, vini);
        bib.emprestar(web, vini);

        System.out.println("ACERVO: " + bib.contagemLivros());
        for (Livro livro : bib.getAcervo()) {
            System.out.println(livro);
            
        }
    }

}
