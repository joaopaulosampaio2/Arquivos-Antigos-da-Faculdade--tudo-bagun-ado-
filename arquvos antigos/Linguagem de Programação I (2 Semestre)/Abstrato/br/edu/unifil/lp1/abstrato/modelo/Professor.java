package br.edu.unifil.lp1.abstrato.modelo;



public class Professor extends Empregado
{
   private String titulacao;
    
   public Professor(String nome, double salario,String titulacao){
       super(nome,salario);
      this.titulacao = titulacao;
    }
    
    
   public double getGanhoMensal(){
     return super.getSalario();
    }
    
   public void setTitulacao(String novo){
       this.titulacao = novo; 
    }
    
   public String getTitulacao(){
       return this.titulacao;
    } 
}
