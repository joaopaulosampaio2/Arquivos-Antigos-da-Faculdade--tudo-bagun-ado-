import java.util.*;
/**
 * @author (João Paulo) 
 * @version (1.0)
 */
public class TesteAgencia
{
   public static void main (String args[])
   {
       Scanner teclado = new Scanner(System.in);
       Agencia agencia = new Agencia(100);
       int opcao=0, numero;
       String titular;
       Conta cta;
       while (opcao != 9)
       {
           System.out.println("1-incluir");
           System.out.println("2-Excluir");
           System.out.println("3-Listar");
           System.out.println("9-Fim");
           opcao = teclado.nextInt();
           teclado.nextLine();
           switch (opcao)
           {
               case 1: System.out.println("Numero:");
                       numero = teclado.nextInt();
                       teclado.nextLine();=
                       System.out.println("Titular:");
                       titular = teclado.nextine();
                       cta = new Conta(titular,numero);
                       agencia.incluiConta(cta);
                       break;
               case 2: System.out.println("Numero:");
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

