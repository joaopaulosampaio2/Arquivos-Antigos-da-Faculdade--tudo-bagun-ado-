import java.util.*;
/**
 * @author (João Paulo) 
 * @version (1.0)
 */
public class EX_3
{
   public static void main (String[] args)
   {
      Scanner tec = new Scanner (System.in);
      int A[] = new int [20];
      int B[] = new int [20];
      int soma;
      for(int i = 0; i < A.length; i++)
      {
          System.out.println("insira A:");
          A[i] = tec.nextInt();
          soma = 0;
          for(int j = A[i]; j >= 1; j--)
          {
              soma = soma + j;   
          }
          B[i] = soma;
      }
      for (int i = 0; i < B.length; i++)
      {
          System.out.println("A: " + A[i] + " B:" + B[i]);
      }
   }
}
