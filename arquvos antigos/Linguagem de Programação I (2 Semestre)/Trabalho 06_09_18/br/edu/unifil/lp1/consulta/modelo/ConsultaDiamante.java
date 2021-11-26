package br.edu.unifil.lp1.consulta.modelo;
public class ConsultaDiamante extends Consulta
{
    private int Plano;
    private double desconto40;
    public ConsultaDiamante(String Nome,int Matricula,int Dependentes,int ano,double Valor, int Plano)
    {
        super(Nome,Matricula,Dependentes,ano,Valor);
        this.Plano = Plano;
    }
    
    public double getDesconto40()
    {
        return super.getValor() - (super.getValor() * 40) / 100;
    }
}
