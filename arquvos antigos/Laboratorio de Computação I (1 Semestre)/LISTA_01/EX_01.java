import java.util.*;
/**
 * @author (João Paulo) 
 * @version (0.1)
 */
public class EX_01
{
    public static void main (String args[])
    {
       Scanner tec = new Scanner (System.in);
       int arrayX[] = new int [8];
       int arrayY[] = new int [8];
       
       for (int i = 0; i < arrayX.length; i++)
       {
           System.out.println("Informe o número :");
           arrayX[i] = tec.nextInt();
       }
       
       for (int i = 0; i < arrayY.length; i++)
       {
           arrayY[i] = arrayX[i]*3;
           System.out.println("Número *3 :" + arrayY[i]);
       }
    }
}


