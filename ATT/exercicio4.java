
import java.util.*;

public class exercicio4 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o Numero para a soma: ");
        int n1 = leia.nextInt();
        int soma = 0;
        while (n1 != 0) {
            System.out.println("Digite outra vez: ");
            n1 = leia.nextInt();
            soma += n1;

        }

        System.out.println("Resultado da soma: " + soma);
    }

}
