package br.edu.unifil.lp1.abstrato.modelo;
public abstract class Horista extends Funcionario
{
   private int horasTrabalhadas;
    public Horista (double salario, String nome,int h)
   {
       super(salario,nome);
       this.horasTrabalhadas = h;
   }
   
   public int getHorasTrabalhadas()
   {
       return horasTrabalhadas;
   }
   
   public void setHorasTrabalhas(int novoHorasTrabalhadas)
   {
        this.horasTrabalhadas = novoHorasTrabalhadas;
   }
   
   public double getGanhoMensal()
    {
        return super.getSalario() * horasTrabalhadas;
    }
}
