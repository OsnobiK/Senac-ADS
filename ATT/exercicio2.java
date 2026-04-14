
import java.util.*;

public class exercicio2 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i = 0, soma = 0;
        while (i <= 100) {
            soma += i;
            i++;
        }
        System.out.println("Soma dos numeros: " + soma);

    }
}
