package br.edu.unifil.lp1.consulta.visao;
import java.util.Scanner;
import br.edu.unifil.lp1.consulta.controle.*;
import br.edu.unifil.lp1.consulta.visao.*;
public class SistemaDaClinica
{
    public static void main (String[] Args)
    {
        Scanner teclado = new Scanner(System.in);
        CadastrodeConsultas CC = new CadastrodeConsultas();
        int opcao = 0;
        while(opcao!= 9)
        {
            System.out.println("1 - Agendar nova consulta ");
            System.out.println("2 - Ver as consultas ");
            System.out.println("3 - Ver o número de consultas por tipo de plano");
            System.out.println("4 - Ver o valor total das consultas por plano");
            System.out.println("9 - Sair ");
            opcao = teclado.nextInt();
            teclado.nextLine();
            int Matricula;
            int Dependentes;
            int ano;
            double Valor;
            int Plano;
            String Nome;
            switch(opcao)
            {
                case 1 : System.out.println("Informe seu nome para a consulta: ");
                         Nome = teclado.nextLine();
                         System.out.println("Informe sua matricula: ");
                         Matricula = teclado.nextInt();
                         System.out.println("Informe o número de dependentes: ");
                         Dependentes = teclado.nextInt();
                         System.out.println("Informe o ano da inclusão: ");
                         ano = teclado.nextInt();
                         System.out.println("Informe o valor dessa consulta: ");
                         Valor = teclado.nextDouble();
                         System.out.println("Informe o seu plano: "+'\n'+"1- Prata"+'\n'+"2- Ouro"+'\n'+"3- Diamante"+'\n'+"4- Familia");
                         Plano = teclado.nextInt();
                         CC.addConsulta(Nome,Matricula,Dependentes,ano,Valor,Plano);
                         break;
                case 2 : System.out.println("Informe o seu plano: "+'\n'+"1- Prata"+'\n'+"2- Ouro"+'\n'+"3- Diamante"+'\n'+"4- Familia");
                         Plano = teclado.nextInt();
                         if(Plano == 1)
                         {
                             System.out.println(CC.ListarConsultas(Plano));
                         }
                         
                         if(Plano == 2)
                         {
                             System.out.println(CC.ListarConsultas(Plano));
                         }
                         
                         if(Plano == 3)
                         {
                             System.out.println(CC.ListarConsultas(Plano));
                         }
                         
                         if(Plano == 4)
                         {
                             System.out.println(CC.ListarConsultas(Plano));
                         }
                         break;
                case 3 : System.out.println("Informe o seu plano: "+'\n'+"1- Prata"+'\n'+"2- Ouro"+'\n'+"3- Diamante"+'\n'+"4- Familia");
                         Plano = teclado.nextInt();
                         if(Plano == 1)
                         {
                             System.out.println("O número de consultas do plano prata é: "+CC.NumeroPlano(Plano));
                         }
                         
                         if(Plano == 2)
                         {
                             System.out.println("O número de consultas do plano ouro é: "+CC.NumeroPlano(Plano));
                         }
                         
                         if(Plano == 3)
                         {
                             System.out.println("O número de consultas do plano diamante é: "+CC.NumeroPlano(Plano));
                         }
                         
                         if(Plano == 4)
                         {
                             System.out.println(CC.NumeroPlano(Plano));
                         }
                         break;
                case 4 : System.out.println("Informe o seu plano: "+'\n'+"1- Prata"+'\n'+"2- Ouro"+'\n'+"3- Diamante"+'\n'+"4- Familia");
                         Plano = teclado.nextInt();
                         System.out.println(CC.valorConsultas(Plano)+"R$");
                         break;
                case 9 : System.out.println("FIM");
                         break;
                default: System.out.println("Opção Incorreta");         
            }
        }
    }
}
