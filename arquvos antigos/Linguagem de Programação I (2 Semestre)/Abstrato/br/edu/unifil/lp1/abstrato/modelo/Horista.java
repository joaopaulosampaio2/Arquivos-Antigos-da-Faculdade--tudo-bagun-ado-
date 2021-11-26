package br.edu.unifil.lp1.abstrato.modelo;

public class Horista extends Empregado
{
   
    private double horasTrabalhadas;
    private double salarioporHora;
    public Horista(String nome, double salario, double horas)
    {
        super(nome,salario);
        this.horasTrabalhadas = horas;
        this.salarioporHora = salario;
    }
    
    public void setHorasTrabalhadas(int hora){
        this.horasTrabalhadas = hora;    
    }
    
    public double getGanhoMensal(){
        return super.getSalario() * horasTrabalhadas;
    }
}
