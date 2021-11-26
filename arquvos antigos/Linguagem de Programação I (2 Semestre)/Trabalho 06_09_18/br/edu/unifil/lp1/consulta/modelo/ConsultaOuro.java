package br.edu.unifil.lp1.consulta.modelo;
public class ConsultaOuro extends Consulta
{
    private int Plano;
    public ConsultaOuro(String Nome,int Matricula,int Dependentes,int ano,double Valor, int Plano)
    {
        super(Nome,Matricula,Dependentes,ano,Valor);
        this.Plano = Plano;
    }
    
    public double getValor()
    {
        double saida;
        if(super.getano() <= 2000)
        {
            saida = 0;
        }else
        {
            saida = super.getValor()-((super.getValor() * 30) / 100);
        }
        return saida;
    }
}
