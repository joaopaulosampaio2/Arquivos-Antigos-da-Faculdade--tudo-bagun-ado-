import java.util.Scanner;
/**
 * @author (João Paulo) 
 * @version (1.0)
 */
public class TesteFrota
{
     public static void main(String args[])
     {
         Scanner teclado = new Scanner(System.in);
         Frota frota = new Frota();
         int opcao = 0;
         String identificador;
         int quantidadeMaxima;
         Aviao aviao;
       
         while (opcao != 9)
         {
            System.out.println("1 â€“ Incluir aviÃ£o" );
            System.out.println("2 â€“ Excluir aviÃ£o" );
            System.out.println("3 â€“ Listar frota  ");
            System.out.println("4 - Embrarcar"     );
            System.out.println("5 - Desembarcar"   );
            System.out.println("9 -  --Fim --     ");
            opcao = teclado.nextInt();
            teclado.nextLine();
            switch(opcao)
            {
                case 1: 
                        System.out.println("Qual o Identificador:");
                        identificador = teclado.nextLine();
                        
                        System.out.println("Quantidade Maxima:");
                        quantidadeMaxima = teclado.nextInt();
                        
                        aviao = new Aviao(identificador,quantidadeMaxima); 
                        frota.addAviao(aviao); 
                        System.out.println("AviÃ£o Adcionado com Sucesso.");
                        break;
                
                 case 2: System.out.println("Qual o Identificador:");
                         identificador = teclado.nextLine();
                         frota.removeAviao(identificador);
                         
                         System.out.println("Excuido com Sucesso. ");
                         break; 
                         
                case 3:  System.out.println(frota.listarFrota());
                         break;
                
                case 4:  System.out.println("Numero de Identificador para embarque: ");
                         identificador = teclado.nextLine();
                         frota.embarcarAviao(identificador);
                         break;
                 
                case 5:  System.out.println("Numero de Identificador para desembarque: ");
                         identificador = teclado.nextLine();
                         frota.desembarcarAviao(identificador);
                         break;         
                 
                case 9: System.out.println("Fim");
                        break;
                        
                default: System.out.println("OpÃ§Ã£o invalida");

            }
       
         } 
    
     }
}
  


