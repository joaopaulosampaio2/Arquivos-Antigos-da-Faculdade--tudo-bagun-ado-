import java.util.*;
/**
 * @author (João Paulo) 
 * @version (1.0)
 */
public class TesteFrota
{
    public static void main (String args[])
    {
        Scanner teclado = new Scanner(System.in);
        Frota frota = new Frota();
        int opcao = 0, numero;
        String Aviao;
         while (opcao != 9)
       {
           System.out.println("1-incluir avião");
           System.out.println("2-Excluir avião");
           System.out.println("3-Listar frota");
           System.out.println("4-Embarcar ");
           System.out.println("5-Desembarcar ");
           System.out.println("9-Fim");
           opcao = teclado.nextInt();
           teclado.nextLine();
           switch (opcao)
           {
               case 1: System.out.println();
                       numero = teclado.nextInt();
                       teclado.nextLine();
                       System.out.println();
                       titular = teclado.nextine();
                       cta = new Conta(titular,numero);
                       agencia.incluiConta(cta);
                       break;
               case 2: System.out.println();
                       numero = teclado.nestInt();
                       agencia.excluiConta(numero);
                       break;
               case 3: System.out.println(agencia.listaConta());
                       break;
               case 9: System.out.println("Fim");
                       break;
               default : System.out.println("Opcao incorreta");        
               
               
           }
           
       }
   }
}
    

