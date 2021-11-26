import java.util.*;
public class TesteIntArray
{
   public static void main(String args[])
   {
       Scanner tec = new Scanner(System.in);
       int num[] = new int[5];
       IntArray x = new IntArray();
       try{
           x.carregarIntArray(num);
       }catch (InputMismatchException e){
           System.out.println("Erro na entrada de dados");
           System.out.println(e.getMessage());
           e.printStackTrace();
       }
    }
}
