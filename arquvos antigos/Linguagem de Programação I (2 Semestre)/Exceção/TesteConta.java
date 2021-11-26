
public class TesteConta
{
   public static void main(String args[])
   {
       Conta conta = new Conta(200340);
       try
       {
           conta.saca(100);
       }catch(IllegalArgumentException e)
       {
           System.out.println("Error 404 not found");
       }        
   }
}
