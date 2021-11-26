package br.edu.unifil.lp1.abstrato.modelo;


public class Disciplina 
{
   String nome,nomeProf;
   public Disciplina(String nome, String nomeProf){
       this.nome = nome;
       this.nomeProf = nomeProf;

    }
    
   public String getNome(){
        return this.nome;
    } 
    
   public String getNomeProf(){
        return this.nomeProf;
    } 
    
   public void setNome(String novo){
        this.nome = novo;
    } 
   
   public void setNomeProf(String novo){
        this.nomeProf = novo;
    } 
}

