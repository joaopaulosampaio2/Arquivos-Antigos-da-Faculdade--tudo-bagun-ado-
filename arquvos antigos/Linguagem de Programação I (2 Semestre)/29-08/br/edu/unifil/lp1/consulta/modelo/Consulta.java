package br.edu.unifil.lp1.consulta.modelo;


/**
 * Escreva a descrição da classe Consulta aqui.
 * 
 * @author (Lucas Moyses) 
 * @version (número de versão ou data)
 */
public class Consulta
{
    private String nome;
    private int matricula;
    private int nDependentes;
    private int ano;
    private double valorConsulta;
    
    
    public Consulta (String nome, int matricula, int nDependentes, int ano, double valorConsulta)
    {   
        this.nome = nome;
        this.matricula = matricula;
        this.nDependentes = nDependentes;
        this.ano = ano;
        this.valorConsulta = valorConsulta;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    
    public int getMatricula(){
        return matricula;
    }
    
    public void setMatricula(int novaM){
        this.matricula = novaM;
    }
    
      public int getnDependentes(){
        return nDependentes;
    }
    
    public void setnDependentes (int novaM){
        this.matricula = novaM;
    }
    
    public int getAno (){
        return ano;
    }
    
    public void setAno (int ano){
        this.ano = ano;
    }
    
    public double getValorConsulta(){
        return valorConsulta;
    }
    
    public void setValorConsulta (double NValor){
        this.valorConsulta = NValor;
    }
    
}
