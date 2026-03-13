package Ex2;

public class Termometro {

    private double temp = 0;

    public void aumentar(double delta) {
        if (delta > 0) {
            temp = temp + delta;

        }

    }

    public void diminuir(double delta) {
        if (delta > 0) {

            temp = temp - delta;

        }

    }

    public double emCelsius() {
        return temp;
    }

    public double emFahrenheit() {
        return (temp * 1.8) + 32;
    }

}
