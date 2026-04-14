
import java.util.*;

public class exemplo1 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Inicio: ");
        int inicio = leia.nextInt();
        System.out.println("Fim: ");
        int fim = leia.nextInt();
        //Laço
        int i = 0 , cont = 0;
        while (inicio < fim || inicio > fim) {
            if (inicio < fim && inicio % 2 == 0) {
                System.out.println("Par: " + inicio);
                inicio++;
            i++;}
            else if(inicio > fim && inicio % 2 !=0)
                {System.out.println("Impar: "+inicio);
            fim--; 
            i--;}
            else if(inicio == fim){System.out.println("Valores iguais");}
            cont++;
        }
        System.out.println("Quantidade de Pares " + i);
        System.out.println("Quantidade de Exec: " + cont);

    }
}
