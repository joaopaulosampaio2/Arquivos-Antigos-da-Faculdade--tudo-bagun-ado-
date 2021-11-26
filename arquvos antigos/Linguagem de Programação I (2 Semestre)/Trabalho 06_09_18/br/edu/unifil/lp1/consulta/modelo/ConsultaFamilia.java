package br.edu.unifil.lp1.consulta.modelo;
public class ConsultaFamilia extends Consulta
{
    private int Plano;
    private double Desconto50;
    public ConsultaFamilia(String Nome,int Matricula,int Dependentes,int ano,double Valor, int Plano)
    {
        super(Nome,Matricula,Dependentes,ano,Valor);
        this.Plano = Plano;
    }
    
    public double getValor()
    {
        double saida;
        if(super.getDependentes() > 2)
        {
            saida = super.getValor() - (super.getValor() * 50) /100;
        }else 
        {
            saida = super.getValor();
        }
        return saida;
    }
}
