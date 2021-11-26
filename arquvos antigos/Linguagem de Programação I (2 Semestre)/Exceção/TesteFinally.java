import java.util.*;
public class TesteFinally
{
   public static void main (String args[])
   {
       Scanner tec = new Scanner(System.in);
       int num[] = new int[5]; 
       int auxI=0;
       for(int i=0; i<num.length;i++)
       {
           try
           {
              System.out.println("Numero");
              num[i] = tec.nextInt();
           }catch(InputMismatchException e)
           {
              tec.nextLine();
              System.out.println("Valor errado na entrada de dados");
              
              if(i<0)
              {
                  i--;
              }
           }finally
           {
             System.out.println("Elemento: " + i + "Valor: " + num[i]);   
           }
       }
   }
}

