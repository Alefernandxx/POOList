package List2.Ex7;

public class Main {

    public static void main(String[] args) {

        Professor p = new Professor("Alessandro", "Matemática");

        Turma t = new Turma(12, p);

        

        System.out.println("O professor " + t.getProfessor().getNomeProfessor() + " da aula de " + t.getProfessor().getEspecialidade() + " na turma " + t.getNumeroTurma());


    }
}
