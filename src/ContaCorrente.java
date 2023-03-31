public class ContaCorrente {
     int saldo;
     Cliente c;
    public void deposita(int valorDeposito){
        saldo = saldo + valorDeposito;

    }


    public int getSaldo(){
        return saldo;
    }


}


