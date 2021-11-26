import java.util.*;
import java.util.ArrayList;
/** 
 * @author (João Paulo) 
 * @version (1.0)
 */
public class TesteJogador
{ 
    public static void main (String args[])
    {
        Scanner teclado = new Scanner(System.in);
        ArrayList equipe = new ArrayList(100);
        int opcao = 0; 
        while(opcao != 9) 
        {
            System.out.println("1-Incluir");
            System.out.println("2-Excluir");
            System.out.println("3-Listar");
            System.out.println("9-Fim");
            opcao = teclado.nextInt();teclado.nextLine();
            String nome, posicao;
            double altura, peso;
            int numeroCamisa;
            Jogador jog;
            switch(opcao)
            {
                case 1 :  System.out.println("Informe o nome do jogador:"); 
                          nome = teclado.nextLine();
                          System.out.println("Informe a posição do jogador:");
                          posicao = teclado.nextLine();
                          System.out.println("Informe a altura do jogador:");
                          altura = teclado.nextDouble();
                          System.out.println("Informe o peso do jogador:");
                          peso = teclado.nextDouble();
                          System.out.println("Informe o numero da camisa");
                          numeroCamisa = teclado.nextInt();
                          equipe.add(new Jogador (nome, posicao));
                          break;
                case 2 : System.out.println("Informe o nome para exclusão:");
                         nome = teclado.nextLine();
                         for(int i=0; i<equipe.size(); i++) 
                         {
                            jog = (Jogador)equipe.get(i);
                            if(jog.getNome().equals(nome))
                            {
                                equipe.remove(i);
                            }
                         }
                         break;
                case 3 : for(int i=0; i<equipe.size(); i++) 
                         {
                            jog = (Jogador)equipe.get(i);
                            System.out.println(jog.getNome() + " " +
                                                jog.getPosicao());
                           
                         }
                         break;
                         
            }
        }
           
    }
}
