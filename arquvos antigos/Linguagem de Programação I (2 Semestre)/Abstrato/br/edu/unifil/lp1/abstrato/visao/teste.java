package br.edu.unifil.lp1.abstrato.visao;
import java.util.Scanner;
import br.edu.unifil.lp1.abstrato.modelo.Empregado;
import br.edu.unifil.lp1.abstrato.modelo.Pessoa;
import br.edu.unifil.lp1.abstrato.modelo.Mensalista;
import br.edu.unifil.lp1.abstrato.modelo.Producao;
import br.edu.unifil.lp1.abstrato.modelo.Horista;
import br.edu.unifil.lp1.abstrato.modelo.Comissionado;

public class teste
{  
    public static void main(String args[])
    {
     Scanner tec = new Scanner(System.in);
     int opcao = 0;
     
     
     while (opcao != 5){
        System.out.println("1 - funcionário Mensalista");   
        System.out.println("2 - funcionário Horista");
        System.out.println("3 - funcionário Producao");
        System.out.println("4 - funcionário Comissionado");
        System.out.println("5 - ENCERRAR");  
        opcao = tec.nextInt();
        tec.nextLine();
     switch(opcao){
        case 1 : System.out.println("Digite o Nome");
                 String nome = tec.nextLine();
                 System.out.println("Digite o Salario");
                 double sal = tec.nextDouble();
                 Mensalista funcionario = new Mensalista(nome,sal);
                 break;
         
        case 2 : System.out.println("Digite o Nome");
                 nome = tec.nextLine();
                 System.out.println("Digite o Salario");
                 sal = tec.nextDouble();
                 Horista novo = new Horista(nome, sal); 
                 break;
                 
        case 3 : System.out.println("Digite o Nome");
                  nome = tec.nextLine();
                 System.out.println("Digite o Salario");
                 sal = tec.nextDouble();
                 System.out.println("Digite a quantidade de producao");
                 int quant = tec.nextInt();
                 Producao nova = new Producao(nome, sal, quant);        
                 break;
        
        case 4 : System.out.println("Digite o Nome");
                  nome = tec.nextLine();
                 System.out.println("Digite o Salario");
                 sal = tec.nextDouble();
                 System.out.println("Digite a comissao sobre a venda");
                 double comissao = tec.nextDouble();
                 System.out.println("Digite o total de vendas");
                 int a = tec.nextInt();
                 Comissionado neew = new Comissionado(nome, sal, comissao,a); 
                 break;
        case 5 : System.out.println("Encerrado");
                 break;
        default : System.out.println("Opcao inválida");
        
        
        }   
    }
}
}
