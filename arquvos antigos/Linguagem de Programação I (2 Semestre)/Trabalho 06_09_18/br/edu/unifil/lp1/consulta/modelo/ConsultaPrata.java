package br.edu.unifil.lp1.consulta.modelo;
public class ConsultaPrata extends Consulta
{
    private int Plano;
    private double Desconto20;
    public ConsultaPrata(String Nome,int Matricula,int Dependentes,int ano,double Valor,int Plano)
    {
        super(Nome,Matricula,Dependentes,ano,Valor);
        this.Plano = Plano;
    }
    
    public double getValor()
    {
        return super.getValor() - (super.getValor() * 20)/100;
    }
}
