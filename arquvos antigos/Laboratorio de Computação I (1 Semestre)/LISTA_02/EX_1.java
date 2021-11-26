import java.util.*;
/**
 * @author (João Paulo) 
 * @version (0.1)
 */
public class EX_1
{
     public static void main(String[] args) 
     {
         int A[] = {23,4,14,22,28,13,7,16,32,27};
         int aux;
	 int j = 9;
         for (int i = 0; i < 5; i++) 
         {
		aux = A[i];
		A[i] = A[j];
		A[j] = aux;
		j--;
	}

		
	for (int i = 9; i >= 5; i--) 
	{
		aux = A[i];
		A[i] = A[9 - i];
		A[9 - i] = aux;
        }

	System.out.println("Vetor A invertido");
	for (int i = 0; i < A.length; i++) 
	{
		System.out.println("valor " + A[i]);
	}
     }
}
