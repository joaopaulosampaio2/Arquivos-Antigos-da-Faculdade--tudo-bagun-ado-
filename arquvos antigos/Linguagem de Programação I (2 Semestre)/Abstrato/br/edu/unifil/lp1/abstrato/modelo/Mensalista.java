package br.edu.unifil.lp1.abstrato.modelo;


public class Mensalista extends Empregado 
{

    public Mensalista(String nome, double salario)
    {
        super(nome, salario);
    }
    
    public double getGanhoMensal(){
        return super.getSalario();
    }

}
