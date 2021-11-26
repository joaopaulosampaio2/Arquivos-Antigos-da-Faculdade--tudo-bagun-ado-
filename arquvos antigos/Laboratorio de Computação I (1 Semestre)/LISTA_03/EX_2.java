import java.util.*;
/**
 * @author (João Paulo) 
 * @version (1.0)
 */
public class EX_2
{
   public static void main(String args[]){
    int logica[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    int linguagem[] = {14,16,3,17,5,19,11,21,22,2,24,25,26,27,28};
    
    for(int i = 0; i < logica.length; i++){
      for(int c = 1; c < linguagem.length; c++){
        if(logica[i] == linguagem[c]){
            System.out.println("Matricula simultanea: " + logica[i] );   
        }
      }
    }
  }
}

