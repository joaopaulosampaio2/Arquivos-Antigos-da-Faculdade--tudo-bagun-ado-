package br.edu.unfil.lp1.modificador.modelo;
/**
 * @author (João Paulo) 
 * @version (1.0)
 */
public class ProjetoSoftware extends Projeto
{
   private double custoConsultoria;
   public ProjetoSoftware(String n, double c, int h, double cc)
   {
      super(n,c,h);
      custoConsultoria = cc;
   }
   
   public double getCustoAtual()
   {
      return custoHora * horasExecutadas + custoConsultoria; 
   }
}

