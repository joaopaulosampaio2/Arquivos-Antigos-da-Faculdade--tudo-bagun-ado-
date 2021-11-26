package br.edu.unfil.lp1.modificador.modelo;
/**
 * @author (João Paulo) 
 * @version (1.0)
 */
public class Projeto
{
    protected String nomeProjeto;
    protected double custoHora;
    protected int horasExecutadas;
    
    public Projeto(String n, double c, int h)
    {
        nomeProjeto = n;
        custoHora = c;
        horasExecutadas = h;
    }
}
