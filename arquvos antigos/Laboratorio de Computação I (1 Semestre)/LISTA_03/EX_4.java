import java.util.*;
/**
 * @author (João Paulo) 
 * @version (1.0)
 */
public class EX_4
{
  public static void main(String args[]){   
    int a[] = {23,14,28,7,32};
    int b[] = {4,22,13,16,27};
    int c[] = new int[10];
    int aux = 0;
 
    c[0] = a[0];
    c[1] = b[0];
    c[2] = a[1];
    c[3] = b[1];
    c[4] = a[2];
    c[5] = b[2];
    c[6] = a[3];
    c[7] = b[3];
    c[8] = a[4];
    c[9] = b[4];
     
     System.out.print("Array c: ");
   for(int i = 0; i < c.length; i++){
      System.out.print(c[i] + " ");
     }
     System.out.println("");
   for(int i = 0; i < c.length; i++){   
    if(c[i] % 2 == 0){
      aux = aux + c[i];   
       }
     }
     System.out.println("Soma dos numeros pares: " + aux);
     aux = 0;
   for(int i = 0; i < c.length; i++){   
    if(c[i] % 2 != 0){
      aux = aux + 1;
        }
     } 
     System.out.println("Quantidade de numeros impares: " + aux);
  }
}