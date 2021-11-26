import java.util.Scanner;
/**
 * @author (João Paulo Theodoro) 
 * @version (1.0)
 */
public class EX_03
{
    public static void main (String agrs[])
    {
       Scanner tec = new Scanner (System.in);
        
       int arrayA[] = new int [15];
       int arrayB[] = new int [15];
           
       for (int i = 0; i < arrayA.length; i++)
       {
          System.out.println("Informe o número :");
          arrayA[i] = tec.nextInt();
       }
       
       for (int i = 0; i < arrayA.length; i++) 
       {
          arrayB[i] = arrayA[i] * arrayA[i];
          System.out.println(" valor de A :" + arrayA[i]);
          System.out.println(" valor de A² :" + arrayB[i]);
       }
    }
}
