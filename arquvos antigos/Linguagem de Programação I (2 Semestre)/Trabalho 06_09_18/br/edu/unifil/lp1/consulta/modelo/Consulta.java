package br.edu.unifil.lp1.consulta.modelo;
public class Consulta
{
    private int Matricula;
    private int Dependentes;
    private int ano;
    private double Valor;
    private String Nome;
    public Consulta(String Nome,int Matricula,int Dependentes,int ano,double Valor)
    {
        this.Nome = Nome;
        this.Matricula = Matricula;
        this.Dependentes = Dependentes;
        this.ano = ano;
        this.Valor = Valor;
    }
    
    public void setNome(String novoNome)
    {
        this.Nome = novoNome;
    }
    
    public String getNome()
    {
        return this.Nome;
    }
    
    public void setMatricula(int novaMatricula)
    {
        this.Matricula = novaMatricula;
    }
    
    public int getMatricula()
    {
        return this.Matricula;
    }
    
    public void setDependentes(int novoDependente)
    {
        this.Dependentes = novoDependente;
    }
    
    public int getDependentes()
    {
        return this.Dependentes;
    }
    
    public void setano(int novoAno)
    {
        this.ano = novoAno;
    }
    
    public int getano()
    {
        return this.ano;
    }
    
    public void setValor(double novoValor)
    {
        this.Valor = novoValor;
    }
    
    public double getValor()
    {
        return this.Valor;
    }   
}
