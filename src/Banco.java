import java.util.ArrayList;
import java.util.List;

public class Banco {
    public static void main(String[] args){
        Cliente c = new Cliente();
        c.nome = "Graziela";
        Cliente cl2 = new Cliente();
        cl2.nome = "Amanda";


        ContaCorrente c1 = new ContaCorrente();
        c1.deposita(100);
        c1.c = c;

        ContaCorrente c2 = new ContaCorrente();
        c2.deposita(200);
        c2.c = c;

        List contas = new ArrayList();

        contas.add(c1);
        contas.add(c2);

        System.out.println("O tamanho da lista é" + contas.size());

        for (int i=0; i < contas.size(); i++){
            ContaCorrente contaTeste = (ContaCorrente)contas.get(i);
            System.out.println("O valor do saldo da conta " + contaTeste.c.nome + " é de " + contaTeste.getSaldo());


        }

    }
}
