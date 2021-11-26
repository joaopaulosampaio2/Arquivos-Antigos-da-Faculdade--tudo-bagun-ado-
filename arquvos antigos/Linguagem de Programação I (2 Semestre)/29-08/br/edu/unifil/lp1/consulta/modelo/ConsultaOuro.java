package br.edu.unifil.lp1.consulta.modelo;

/**
 * Escreva a descrição da classe ConsultaOuro aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ConsultaOuro extends Consulta
{
    public double getValorConsulta(){
        double valorOuro = 0;

        if(super.getAno()<=2000){
            
            valorOuro = super.getValorConsulta() - super.getValorConsulta();
            return valorOuro;
        
        }else {
            valorOuro = super.getValorConsulta () * 0.7;
        }
        return valorOuro;
    }
}
