import java.util.Scanner;
public class Exemplo
{ 
    public static void main (String args[])
    {
        int num1, num2, resultado;
        Scanner tec = new Scanner(System.in);
       for(int i = 0; i <= 5 ;i++)
       {
         System.out.println("informe o numero");
         num1 = tec.nextInt();
         System.out.println("informe o numero");
         num2 = tec.nextInt();
         try
         {
            resultado = num1 / num2;
            System.out.println("Resultado:" + resultado);
         }catch (ArithmeticException e)
         {
            System.out.println("Divisão por zero");
         }
       }
    }
}
