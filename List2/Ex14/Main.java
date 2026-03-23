package List2.Ex14;

public class Main {

    public static void main(String[] args) {

        Sistema sist = new Sistema();

        Usuario u1 = new Usuario("Alessandro", "Alessandro@email.com");
        sist.addUsuario(u1);
        System.out.println("Antes: " + u1);
        sist.alterarEmailUsuario(u1, "ale_novo@gmail.com");
        

        Usuario u2 = new Usuario("Marina", "Marina@email.com");
        sist.addUsuario(u2);
        System.out.println("Antes: " +u2);
        sist.alterarEmailUsuario(u2, "Marina_Novo@email.com");
        

        System.out.println("Contagem usuários: " + sist.contagemUsuarios());
        System.out.println("Novos emails:");
        for (Usuario u : sist.getMetodo()) {
            System.out.println(u);

        }

    }

}
