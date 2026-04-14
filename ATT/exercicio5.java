import java.util.*;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o numero secreto entre 0-10: ");
        int ns = leia.nextInt();
            while (ns!=10){if(ns>10){System.out.println("Numero invalido!");}
            System.out.println("Tente de novo babygirl");
            ns = leia.nextInt();
            
            }
            System.out.println("Parabens acertou!!");


    }
}
