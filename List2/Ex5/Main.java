package List2.Ex5;

public class Main {
    public static void main(String[] args) {
        
        Motor m = new Motor();
        m.tipo = "V8";
        m.cavalos = 450;

        Carro meuCarro = new Carro();
        meuCarro.modelo = "Mustang";

        meuCarro.motor = m;

        System.out.println("O carro " + meuCarro.modelo + " tem um motor " + meuCarro.motor.tipo + " com " + meuCarro.motor.cavalos + " cavalos ");
    }
}
