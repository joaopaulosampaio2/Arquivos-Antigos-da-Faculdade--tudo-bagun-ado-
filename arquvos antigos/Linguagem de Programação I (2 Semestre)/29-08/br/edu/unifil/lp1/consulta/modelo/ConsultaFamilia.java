package br.edu.unifil.lp1.consulta.modelo;


/**
 * Escreva a descrição da classe ConsultaFamilia aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ConsultaFamilia extends Consulta
{
    double valorFamilia = 0;
    public ConsultaFamilia(String nome, int matricula, int nDependentes, int ano, double valorConsulta,double valorFamilia)
    {
        super(nome, matricula, nDependentes, ano, valorConsulta);
        this.valorFamilia = valorFamilia;
    }
    
    public double getValorConsulta (){
        
        if (super.getnDependentes() > 2)
        {
            valorFamilia = super.getValorConsulta() * 0.5;
        } else 
        {
            valorFamilia = super.getValorConsulta();
        }
        return valorFamilia;
    }
}
