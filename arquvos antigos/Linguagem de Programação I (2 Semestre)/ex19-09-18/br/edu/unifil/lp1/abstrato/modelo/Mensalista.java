package br.edu.unifil.lp1.abstrato.modelo;
public abstract class Mensalista extends Funcionario
{
    public Mensalista(double salario, String nome)
    {
        super(salario,nome);
    }
    
    public double getGanhoMensal()
    {
        return super.getSalario();
    }
}
