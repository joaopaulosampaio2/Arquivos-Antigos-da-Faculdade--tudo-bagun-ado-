package br.edu.unifil.lp1.abstrato.visao;
import java.util.Scanner;
import br.edu.unifil.lp1.abstrato.modelo.*;
import br.edu.unifil.lp1.abstrato.visao.*;
import br.edu.unifil.lp1.abstrato.controle.*;

public class Principal
{
    public static void main (String args[]){
        Scanner tec = new Scanner(System.in);    
        Controle lista = new Controle();
        int opcao = 0;
        String titul;
        
        while (opcao !=10){
            System.out.println("1 - Funcionário Mensalista");   
            System.out.println("2 - Funcionário Horista");
            System.out.println("3 - Funcionário Producao");
            System.out.println("4 - Funcionário Comissionado");
            System.out.println("5 - Informações sobre salário");  
            System.out.println("6 - Cadastrar Professor");
            System.out.println("7 - Cadastrar Disciplina"); 
            System.out.println("8 - Busca por professores e titulações");
            System.out.println("9 - Busca por Disciplinas e professores que ministram"); 
            System.out.println("10 - FIM");
            opcao = tec.nextInt();
            tec.nextLine();
            switch(opcao){
                case 1 : System.out.println("Digite o nome"); 
                         String name = tec.nextLine();
                         System.out.println("Digite o salário");
                         double sal = tec.nextDouble();
                         lista.CadastraEmpregadoMensalista(name,sal);
                         break;
                         
                case 2 : System.out.println("Digite o nome"); 
                         name = tec.nextLine();
                         System.out.println("Digite o salário");
                         sal = tec.nextDouble();
                         System.out.println("Digite as horas trabalhadas");
                         double horas = tec.nextDouble();
                         lista.CadastraEmpregadoHorista(name,sal,horas);  
                         break;
                         
                case 3 : System.out.println("Digite o nome"); 
                         name = tec.nextLine();
                         System.out.println("Digite o salário");
                         sal = tec.nextDouble();
                         System.out.println("Digite a quantidade produzida");
                         int quantoproduz = tec.nextInt();
                         lista.CadastraEmpregadoProducao(name,sal,quantoproduz);  
                         break;
                         
                case 4 : System.out.println("Digite o nome"); 
                         name = tec.nextLine();
                         System.out.println("Digite o salário");
                         sal = tec.nextDouble();
                         System.out.println("Digite a comissao por venda");
                         double comissaoVenda = tec.nextDouble();
                         System.out.println("Digite a quantidade vendida");
                         int quantvendida = tec.nextInt();
                         lista.CadastraEmpregadoComissionado(name,sal,comissaoVenda,quantvendida);     
                         break;
                         
                case 5 : System.out.println("Digite o nome"); 
                         name = tec.nextLine();   
                         System.out.println(lista.Info(name));
                         break;
                       
                case 6 : System.out.println("Digite a titulação"); 
                         titul = tec.nextLine();
                         System.out.println("Digite o nome do Profº");
                         name = tec.nextLine();
                         System.out.println("Digite o salario");
                         sal = tec.nextDouble();                
                         lista.CadastroProf(name,sal,titul);
                         break;
                         
                case 7 : System.out.println("Digite o nome da Disciplina"); 
                         String dis = tec.nextLine();
                         System.out.println("Digite o nome do Profº que ministra a disciplina");
                         name = tec.nextLine();
                         lista.CadastroDisciplina(dis,name);
                         break;
                         
                case 8 : System.out.println("Digite o nome do Prof para Busca");
                         name = tec.nextLine();
                         System.out.println(lista.buscaprof(name));
                         break;
                         
                case 9 : System.out.println("Digite o nome da Disciplina para busca de titulações");        
                         name = tec.nextLine();
                         System.out.println(lista.buscaDisciplina(name));
                         break;    
                case 10 : System.out.println("Encerrado");         
                         break;
                default : System.out.println("Inválido");   
                          break;  
            
            }
        }
    }
}
