import java.util.*;
public class IntArray
{
    Scanner tec;
    public IntArray()
    {
        tec = new Scanner(System.in);
    }
    
    public void carregarIntArray(int a[]) throws InputMismatchException
    {
        for(int i=0; i<a.length;i++)
        {
            System.out.println("Numero: ");
            a[i] = tec.nextInt();
        }
    }
}
