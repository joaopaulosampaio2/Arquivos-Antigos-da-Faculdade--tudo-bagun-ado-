import java.util.*;
/**
 * @author (João Paulo) 
 * @version (0.1)
 */
public class EX_2
{
    public static void main (String[] args)
    {
       Scanner tec = new Scanner (System.in);
       int A[] = new int [20];
       int B[] = new int [20];
       int aux = 0;
       for(int i = 0; i < A.length; i++)
       {
          System.out.println("insira o número");
          A[i] = tec.nextInt();
          aux = A[i];
       }
       System.out.println("Valor Invertido");
       for(int i = 0; i < B.length; i++)
       {
          System.out.println(aux);
          aux--;
    
       }
    }
}
