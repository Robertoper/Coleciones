import java.util.HashSet;
import java.util.Random;

public class hashet {
    public static void main(String[] args) {
        HashSet<Integer> numeros=new HashSet<>();
        Random aleatorio=new Random();
        int numeroAleatorio;
        for (int i=0;i<=10;i++){
            System.out.println(numeroAleatorio=aleatorio.nextInt(100)+1);
            numeros.add(numeroAleatorio);
        }
        System.out.println("---------");
        System.out.print(numeros);

    }
}
