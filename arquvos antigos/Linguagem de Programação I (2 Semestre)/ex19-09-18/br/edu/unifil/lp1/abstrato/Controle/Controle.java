package br.edu.unifil.lp1.abstrato.Controle;
import java.util.*;
public class Controle  
{
    private ArrayList<Funcionario> listaEmp;
    public Controle()
    {
        listaEmp = new ArrayList<Funcionario>();
    }
    
    public void addFuncionario (double salario, String nome,double comissao,int quantVendida, int horasTrabalhadas, double quantProduzida,)
    {
       if(funçao.equals("Mensalista"))
       {
           Mensalista mes = new Mensalista(nome,salario);
           listaEmp.add(mes);
       }
    }
}
