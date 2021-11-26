package br.edu.unifil.lp1.consulta.modelo;


/**
 * Escreva a descrição da classe ConsultaDiamante aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ConsultaDiamante extends Consulta
{
    public double getValorConsulta(){
        double valorDiamente = 0;
        valorDiamente = super.getValorConsulta() * 0.6;
        return valorDiamente;
    }
}
