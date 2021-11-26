package br.edu.unifil.lp1.abstrato.controle;
import java.util.Scanner;
import java.util.ArrayList;
import br.edu.unifil.lp1.abstrato.modelo.*;
import br.edu.unifil.lp1.abstrato.visao.*;
public class Controle{

   
   private ArrayList<Empregado>listaEmp;
   private ArrayList<Disciplina>listaDis;
   private ArrayList<Professor>listaProf;
   
   public Controle(){
       listaEmp = new ArrayList();
       listaDis = new ArrayList();
       listaProf = new ArrayList();
    }
    
    
   public  void CadastraEmpregadoMensalista(String nome, double salario){   
       listaEmp.add(new Mensalista(nome,salario));
    }
    
   public void CadastraEmpregadoComissionado(String nome, double salario, double comissaoVenda, int QuantVendida){
       listaEmp.add(new Comissionado(nome,salario,comissaoVenda,QuantVendida));
    } 
    
   public void CadastraEmpregadoHorista(String nome, double salario, double horas){
       listaEmp.add(new Horista(nome,salario,horas));
    }
    
   public void CadastraEmpregadoProducao(String nome, double salario, int quantProduz){
       listaEmp.add(new Producao(nome, salario,quantProduz));
    }
    
   public String Info(String nome){
    String saida = "";
    Empregado apoio1;
       for (int i = 0; i < listaEmp.size(); i++)
    {
       apoio1 = listaEmp.get(i);
       if(apoio1.getNome().contains(nome)){
        saida += apoio1.getNome() + " Ganho Mensal : " + apoio1.getGanhoMensal();
       }
     } 
         return saida;
        }
       
        
   public void CadastroProf(String nome, double salario,String titulacao){
       listaProf.add(new Professor(nome,salario,titulacao));
     }  
    
   public void CadastroDisciplina(String nome, String nomeProf){
    listaDis.add(new Disciplina(nome, nomeProf));
      } 
    
   public String buscaDisciplina(String nome){
    String saida = "";
    Disciplina apoio1;
    for(int i = 0; i<listaDis.size();i++){
        apoio1 = listaDis.get(i);
        if(apoio1.getNome().contains(nome)){
            saida += "Nome do Prof que ministra a disciplina " + nome + "  :  " + apoio1.getNomeProf();
        }
      }
      return saida;
    }
    
   public String buscaprof(String nome){
      String saida = "";
      Professor apoio1;
        for (int i = 0;i<listaProf.size();i++){
        apoio1 = listaProf.get(i);
        if(apoio1.getNome().contains(nome)){
            saida += apoio1.getNome() + " possui essa titulacao: " + apoio1.getTitulacao() ; 
            
         }
      } 
      return saida;
    }

}


