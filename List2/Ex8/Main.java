package List2.Ex8;

public class Main {
    public static void main(String[] args) {

        ListFuncionarios lf = new ListFuncionarios();

        Departamento dp = new Departamento("Ti");
        Departamento dp2 = new Departamento("Financeiro");

        Funcionario f1 = new Funcionario(dp, "Alessandro");
        lf.addFuncionario(f1);
        Funcionario f2 = new Funcionario(dp2, "Marina");
        lf.addFuncionario(f2);

        System.out.println("Número de funcionários: " + lf.contagemFuncionarios());
        for (Funcionario f : lf.getFunc()) {
            System.out.println(f);

        }
    }

}
