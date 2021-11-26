package br.edu.unfil.lp1.modificador.modelo.Subpacote;
import br.edu.unifil.lp1.modificador.modelo.Projeto;
/**
 * @author (João Paulo) 
 * @version (1.0)
 */
public class ProjetoHardware extends Projeto
{
   public ProjetoHardware (String n, double c, int h)
   {
       super(n,c,h);
   }
   
   public double getCustoAtual()
   {
       return (custoHora * horasExecutadas) * 0.7; 
   }
}
