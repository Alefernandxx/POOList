package Ex1;
public class CofreDigital {


    private int valor = 0;


    public void depositar(int v){
        if (v > 0) {
            valor = valor + v;
        }
    }

    public boolean sacar (int v){
        if (v > valor) {
            return false;
            
        }

        valor = valor - v;
        return true;


    }

    public int saldo (){
        return valor;
    }

  

}
