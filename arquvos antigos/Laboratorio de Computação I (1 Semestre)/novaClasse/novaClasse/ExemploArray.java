import java.util.Scanner;
public class ExemploArray
{
   public static void main(String args[])
   {
       Scanner teclado = new Scanner(System.in);
       int numero[] = new int[5];
       
       int valor[] = {1,2,5};
      for(int i = 0; i<numero.length; i++)
      {
          System.out.println("Informe o numero:");
          numero[i] = teclado.nextInt(); 
      }
       //mostrar a soma todos os numeros do array
       //mostre o maior numero
       int soma = 0, maior = 0;
      for(int i = 0; i < numero.length; i++)
      {
          System.out.println("Indice " + i + "=> valor: " + numero [i]);
          soma += numero [i];
          if (i == 0)
          {
             maior = numero[i];  
          }
          else
          {
             if (numero[i] > maior)
             {
                 maior = numero[i];
             }
          }
      }
      System.out.println("soma:" + soma);
      System.out.println("maior numero: " + maior);
   }
}
