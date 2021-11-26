package br.edu.unifil.lp1.abstrato.modelo;


public class Comissionado extends Empregado
{
    private double comissaoVenda;
    private int quantVendida;
    public Comissionado(String nome, double salario, double comissaoVenda, int QuantVendida)
    {
       super(nome, salario);
       this.quantVendida = QuantVendida;
       this.comissaoVenda = comissaoVenda;
    }
    
    public double getGanhoMensal(){
       return super.getSalario() + comissaoVenda * quantVendida;
    }

    
}
