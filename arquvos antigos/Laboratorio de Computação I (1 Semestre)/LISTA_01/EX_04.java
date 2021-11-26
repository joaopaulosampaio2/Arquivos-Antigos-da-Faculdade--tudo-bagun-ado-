import java.util.Scanner;
/**
 * @author (João Paulo Theodoro) 
 * @version (1.0)
 */
public class EX_04
{   public static void main (String agrs[])
    {
       Scanner tec = new Scanner (System.in);
        
       int a[] = new int [15];
       int b[] = new int [15];
       int fatorial;
       
       for(int i = 0; i < a.length; i++)
       {
          System.out.println("Informe o número :");
          a[i] = tec.nextInt();
          fatorial = 1; 
          for(int j = a[i]; j >= 1; j--)
          {
             fatorial = fatorial * j; 
          }
          b[i] = fatorial;
       }
       System.out.println("arrayA");
       for(int i = 0; i < b.length; i++)
       {
          System.out.println("indice:" + i+ " valor:" + a[i]); 
       }
       System.out.println("arrayB");
       for(int i = 0; i < b.length; i++)
       {
          System.out.println("indice:" + i+ " valor:" + a[i]);
       }
     }
}
