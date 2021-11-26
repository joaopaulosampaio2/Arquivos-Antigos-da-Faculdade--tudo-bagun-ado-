package br.edu.unifil.lp1.abstrato.modelo;

public abstract class Empregado extends Pessoa
{
    private double salario;
   
    
    public Empregado(String nome, double salario){
      super(nome);
      this.salario = salario;
    }
    
   
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setSalario(int novo){
        this.salario = novo;
    }
    
    public String getDescricao(){
      return "Empregado com salário de " + this.salario;
    } 
    
    public abstract double getGanhoMensal();
}
