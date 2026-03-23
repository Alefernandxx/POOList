package List2.Ex7;

public class Turma {

    private int numeroTurma;
    private Professor professor;

    public Turma(int numeroTurma, Professor p) {
        this.numeroTurma = numeroTurma;
        this.professor = p;

    }

    public int getNumeroTurma() {
        return numeroTurma;
    }

    public Professor getProfessor() {
        return professor;
    }

}
