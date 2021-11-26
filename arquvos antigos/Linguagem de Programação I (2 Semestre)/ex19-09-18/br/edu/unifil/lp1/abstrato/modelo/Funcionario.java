package br.edu.unifil.lp1.abstrato.modelo;
public abstract class Funcionario extends Pessoa
{
   private double salario;
   public Funcionario(double salario, String nome)
   {
       super(nome);
       this.salario = salario;
   }
   
   public double getSalario()
   {
       return this.salario;
   }
   
   public void setSalario(double novoSalario)
   {
       this.salario = novoSalario;
   }
   
   public abstract double getGanhoMensal();
}
