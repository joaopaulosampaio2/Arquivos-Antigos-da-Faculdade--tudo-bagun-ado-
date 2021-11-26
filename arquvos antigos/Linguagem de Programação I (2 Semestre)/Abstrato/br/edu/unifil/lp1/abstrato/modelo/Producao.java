package br.edu.unifil.lp1.abstrato.modelo;


public class Producao extends Empregado
{
   
    private int quantProduzida; 
    
    public Producao(String nome, double salario, int quantProduz)
    {
       super(nome,salario);
       this.quantProduzida = quantProduz;
    }
   
    public double getGanhoMensal(){
       return super.getSalario() * quantProduzida;
    }
}
