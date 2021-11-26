package br.edu.unifil.lp1.abstrato.modelo;


//classes abstratas devem ter um método 
//abstrato pelo menos, e métodos concretos(normais) podem ser colocados ou não
public abstract class Pessoa
{
   private String nome;
   private double salarioFixo;
   private double SalarioComPorcentagemVendas;
   private double salarioPorHoras;
   private double salarioPorItens;
   
   public Pessoa(String nome){
       this.nome = nome;
    }
    
   public String getNome(){
        return this.nome;
    }
    
   public abstract String getDescricao(); //métodos abastratos não tem corpo/colchetes
    
      }

