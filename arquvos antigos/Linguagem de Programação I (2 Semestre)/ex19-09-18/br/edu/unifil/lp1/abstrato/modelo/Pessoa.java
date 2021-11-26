package br.edu.unifil.lp1.abstrato.modelo;
/**
 * @author (João Paulo) 
 * @version (1.0)
 */
public abstract class Pessoa
{
    private String nome;
    public Pessoa(String nome)
    {
        this.nome = nome;
    }
    
    public String getNome ()
    {
        return this.nome;
    }
    
    public abstract String getDescricao();
}
