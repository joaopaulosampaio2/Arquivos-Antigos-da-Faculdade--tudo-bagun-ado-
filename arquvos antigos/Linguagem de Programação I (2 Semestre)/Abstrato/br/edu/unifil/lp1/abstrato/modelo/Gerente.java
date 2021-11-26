package br.edu.unifil.lp1.abstrato.modelo;



public  class Gerente extends Empregado
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    protected double bonus;

    public Gerente(String nome, double salario, double bonus)
    {
       super(nome,salario);
       this.bonus = bonus;
    }
    
     public double getGanhoMensal(){
        return super.getSalario();
    }
    
    public String getDescricao(){
    return "Gerente com salario de " + super.getSalario() + "e bonus de " + bonus;
    }

   
}
