import java.util.*;
/**
 * @author (João Paulo) 
 * @version (1.0)
 */
public class EX_3
{
   public static void main(String args[]){
  int a[] = new int[20];
  Scanner tec = new Scanner(System.in);
  int aux = 0;
    for(int i = 0; i < a.length; i++){
    System.out.println("Digite sua opiniao de 1 a 5");
    a[i] = tec.nextInt();
  }
  for(int i = 0; i < a.length; i++){   
    if(a[i] == 1){
    aux = aux + 1; 
    } 
  }
   System.out.println("Quantidade de avaliaçoes '1': " + aux);
  aux = 0;
  for(int i = 0; i < a.length; i++){   
    if(a[i] == 2){
    aux = aux + 1; 
    } 
  }
   System.out.println("Quantidade de avaliaçoes '2': " + aux);
  aux = 0;
  for(int i = 0; i < a.length; i++){   
    if(a[i] == 3){
    aux = aux + 1; 
    } 
  }
   System.out.println("Quantidade de avaliaçoes '3': " + aux);
  aux = 0;
  for(int i = 0; i < a.length; i++){   
    if(a[i] == 4){
    aux = aux + 1; 
    } 
  }
   System.out.println("Quantidade de avaliaçoes '4': " + aux);
   aux = 0;
   for(int i = 0; i < a.length; i++){   
    if(a[i] == 5){
    aux = aux + 1; 
    } 
  }
   System.out.println("Quantidade de avaliaçoes '5': " + aux);
  
 }
}


