package br.edu.unifil.lp1.abstrato.modelo;
public abstract class Produção extends Funcionario
{
    private double quantProduzida;
    public Produção(double quantProduzida, double salario ,String nome)
    {
        super(salario,nome);
        this.quantProduzida = quantProduzida;
    }
    
    public double getQuantProduzida ()
    {
       return quantProduzida; 
    }
    
    public void setQuantProduzida(double novaQuantProduzida )
    {
        this.quantProduzida = novaQuantProduzida;
    }
    
     public double getGanhoMensal()
    {
        return super.getSalario() * quantProduzida;
    }
}
