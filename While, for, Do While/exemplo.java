import java.util.*;
    public class exemplo {
        public static void main(String[] args) {
            Scanner dados = new Scanner (System.in);
            System.out.println("inicio: ");
            int inicio = dados.nextInt();
            System.out.println("fim: ");
            int fim = dados.nextInt();
                if (inicio < fim){
                    for(int i=inicio; i< fim; i++){
                        if (i % 2 == 0) {System.out.println("Par: " + i);}
                    }}
                else if (inicio > fim) {
                    for(int i=fim; i< inicio; i--){
                        if(i % 2 != 0) {System.out.println("Impar: " + i);}
                        else if (i ==0){break;}
                    }}
                else {System.out.println("Valores Iguais");}}}


//Prova daqui a 2 semanas (20/04)