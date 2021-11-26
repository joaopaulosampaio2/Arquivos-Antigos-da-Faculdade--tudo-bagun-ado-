import java.util.Scanner;
/**
 * @author (João Paulo) 
 * @version (1.0)
 */
public class EX_02
{
    public static void main (String agrs[])
    {
       Scanner tec = new Scanner (System.in);
        
       double arrayA[] = new double [20];
       double arrayB[] = new double [20];
       double arrayC[] = new double [20];
       
       for (int i = 0; i < arrayA.length; i++)
       {
          System.out.println("Informe o número :");
          arrayA[i] = tec.nextInt();
       }
       
       for (int i = 0; i < arrayB.length; i++)
       {
          System.out.println("Informe o número :");
          arrayB[i] = tec.nextInt();
       }
       
       for (int i = 0; i < arrayA.length; i++)
       {
          arrayC[i] = arrayA[i] - arrayB[i];
          System.out.println("A - B: " + arrayC[i]);
       }
    }
}
