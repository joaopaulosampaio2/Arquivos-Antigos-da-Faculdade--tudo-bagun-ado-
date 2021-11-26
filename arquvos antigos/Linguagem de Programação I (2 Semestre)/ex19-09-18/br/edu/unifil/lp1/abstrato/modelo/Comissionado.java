package br.edu.unifil.lp1.abstrato.modelo;
public abstract class Comissionado extends Funcionario
{
   private double comissao;
   private int quantVendida;
   
   public Comissionado (double salario, String nome, double comissao, int quantVendida)
   {
       super(salario,nome);
       this.comissao = comissao;
       this.quantVendida = quantVendida;
   }
   
   public double getComissao()
   {
       return this.comissao;
   }
   
   public void setComissao(double novaComissao)
   {
       this.comissao = novaComissao;
   }
   
   public int getQuantVendida()
   {
       return this.quantVendida;
   }
   
   public void setQuantVendida(int novaQuantVend)
   {
       this.quantVendida = novaQuantVend;
   }
   
   public double getGanhoMensal()
    {
        return super.getSalario() + comissao * quantVendida;
    }
}
