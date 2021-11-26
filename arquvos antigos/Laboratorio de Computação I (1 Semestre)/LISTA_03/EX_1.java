import java.util.*;
/**
 * @author (João Paulo) 
 * @version (1.0)
 */
public class EX_1
{
   public static void main (String[] args)
   {
       Scanner tec = new Scanner (System.in);
       int A[] = new int [15]; 
       for(int i = 0; i < A.length; i++)
       {
           System.out.println("Informe o número:");
           A[i] = tec.nextInt();
           if(A[i] < 31 && A[i] > 29)
           {
               System.out.println ("Posição: "+ (i+1));
           }
       }
   }
}
