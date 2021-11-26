package br.edu.unifil.lp1.consulta.modelo;


/**
 * Escreva a descrição da classe ConsultaPrata aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ConsultaPrata extends Consulta
{   double valorPrata = 0;
    
    public double getValorConsulta(){
        
        valorPrata = super.getValorConsulta() * 0.8;
        return valorPrata;
    }
}
