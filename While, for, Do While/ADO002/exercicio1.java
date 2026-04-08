import java.util.*;


public class exercicio1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double soma=0;
        for(int i = 1; i<= 10; i++) 
            {System.out.println("Digite o " + i + "º Numero: ");
                double valor = leia.nextDouble();
                if(valor >10){System.out.println("Numero Invalido, tente novamente!");
                    break;
                }
                    soma+=valor;}
                        double media = soma / 10;
                            System.out.println("A media dos numeros é: " + media);
}}
