import java.util.Scanner;
/**
 * @author (João Paulo) 
 * @version (1.0)
 */
public class TesteAviao
{
    public static void main(String args[])
    {
       Scanner teclado = new Scanner(System.in);
       System.out.println("Digite o identificador:");
       String iden = teclado.nextLine();
       System.out.println("Digite a Quantidade máxima:");
       int quantM = teclado.nextInt();

       Aviao aviao = new Aviao (iden,quantM);
       int opcao = 0;
       int numero = 0;
       String titular;
       Aviao cta;
       while (opcao != 9)
       {
            System.out.println("1 - Decolar");
            System.out.println("2 - Pousar");
            System.out.println("3 - Atualizar identificador");
            System.out.println("4 - Atualizar Quantidade máxima");
            System.out.println("5 - “ Embarcar");           
            System.out.println("6 - “ Desembarcar");
            System.out.println("7 - “ Consultar");
            System.out.println("9 - Fim ");
            
            opcao = teclado.nextInt();
            teclado.nextLine();
            switch(opcao)
            {
                case 1: aviao.decolar();
                        System.out.println("Prepare-se, avião vai decolar");
                        break;
                
                case 2: aviao.pousar();
                         System.out.println("Apertem os sintos, o avião vai pousar");
                         break; 
                         
                case 3:  System.out.println("Digite o Identificador:");
                         iden = teclado.nextLine();   
                         aviao.setIdentificador(iden);
                         break;
                
                case 4: System.out.println("Digite o Identificador:");
                        quantM = teclado.nextInt();
                        aviao.setQuantidadeMaxima(quantM);
                        break;
                 
                case 5: aviao.embarcar();
                        System.out.println("Embarcar");
                        break;
                   
                case 6: aviao.desembarcar();
                        System.out.println("Desembarcar");
                
                case 7: System.out.println("Identificador" + aviao.getIdentificador());
                        System.out.println("Estado" + aviao.getEstado());
                        System.out.println("Quantidade Maxima:" + aviao.getQuantidadeMaxima());
                        System.out.println("Quantidade de Passageiros:" + aviao.getQuantidadePassageiros());
                        break;
                        
                case 9: System.out.println("Fim");
                        break;
                        
                default: System.out.println("Opção invalida");

            }
       
       } 
    
    }
}

