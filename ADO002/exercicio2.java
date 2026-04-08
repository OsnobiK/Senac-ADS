import java.util.*;
public class exercicio2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        for(int i = 1; i <=10; i++)
            { System.out.println("Digite a " + i + "ª palavra: ");
                String nn = leia.nextLine();
                if(nn.equals("PARE"))
                    {System.out.println("Programa Encerrado!");
                        break;
                    }
                                }
            
    }
    
}
