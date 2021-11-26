package br.edu.unifil.lp1.abstrato.modelo;



public class Estudante extends Pessoa
{
    protected String curso;
    
    public Estudante(String nome, String curso){
        super(nome);
        this.curso = curso;
    }
    
    public String getDescricao(){
        return "Esse aluno é do curso de " + this.curso;
    } 
    
    
    
    
}
