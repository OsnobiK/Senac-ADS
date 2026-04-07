import java.util.*;
public class Atividade5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Quantidade Alunos");
        int n1 = leia.nextInt();
        double soma = 0;
        int aprovados = 0;
        int reprovados = 0;

        for(int i=0; i>=n1; i++){

            System.out.println("Nome: ");
            String name = leia.nextLine();
            System.out.println("Nota 1: ");
            double nota1 = leia.nextDouble();
            System.out.println("Nota 2: ");
            double nota2 = leia.nextDouble();

            double media = nota1 + nota2 /2;
            soma = media * i;

            if (media<6){System.out.println("Aluno foi Reprovado");
                
            }
            

            else if(media>=6){System.out.println("Aluno Aprovado");
                
            }

            System.out.println("Media geral da turma: " + soma);
            System.out.println("Alunos Aprovados" + aprovados);
            System.out.println("Alunos Reprovados" + reprovados);



        }

    }
}
