import java.util.*;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);

        System.out.println("Digite um numero para a contagem regressiva");
        int n1 = util.nextInt();

        for(int i = n1; i >=0; i--)
            {System.out.println("Contagem regressiva " + i);}
    }
    
}
