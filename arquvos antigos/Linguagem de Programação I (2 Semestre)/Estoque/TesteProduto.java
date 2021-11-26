import java.util.*;
public class TesteProduto 
{
    public static void main(String args[])
    {
         Scanner tec = new Scanner(System.in);
         System.out.println("Digite a descrição do produto");
         String descricao = tec.nextLine();
         Produto prod = new Produto (descricao);
         int opcao = 0;
         double quantidade, valorCompra, qtdEstoque, custoMedio;       
         String nome;
         
         while(opcao != 7)
         {
          try
          {
          System.out.println("1 - Entrada de produto");
          System.out.println("2 - Saída de produto");
          System.out.println("3 - Consultar custo medio");
          System.out.println("4 - Consultar estoque");
          System.out.println("5 - Consultar codigo");
          System.out.println("6 - Consultar descrição");
          System.out.println("7 - Fim"); 
          opcao = tec.nextInt();
          tec.nextLine();
          
          switch(opcao)
          {
             case 1 :
                     try
                     {
                        System.out.println("informe a quantidade");
                        quantidade = tec.nextDouble();
                        System.out.println("informe o valor da compra");
                        valorCompra = tec.nextDouble();
                        prod.entrada(quantidade, valorCompra);
                                               
                     }
                     catch(InputMismatchException e)
                     {
                         System.out.println("Erro!, Entrada de caracteres invalidos, digite novamente");
                         tec.nextLine();
                     }
                     catch(Exct e)
                     {
                         System.out.println("Erro!, Entrada de numeros invalidos, digite novamente");
                         tec.nextLine();
                     }    
                     break;
             case 2 :try
                     {
                        System.out.println("informe a quantidade");
                        quantidade = tec.nextDouble();
                        prod.saida(quantidade);            
                     }
                     catch(InputMismatchException e)
                     {
                         System.out.println("Erro!, Entrada de caracteres invalidos, digite novamente");
                         tec.nextLine();
                     }
                     catch(Exct e)
                     {
                         System.out.println("Erro!, Entrada de numeros invalidos, digite novamente");
                         tec.nextLine();
                     }
             
             case 3 :  System.out.println(" ");
                       System.out.println(prod.getCustoMedio());
                       System.out.println(" ");
                       break;
                       
             case 4 :  System.out.println(" ");
                       System.out.println(prod.getQtdEstoque());
                       System.out.println(" ");
                       break;
             
             case 5 :  System.out.println(" ");
                       System.out.println(prod.getCodigo());
                       System.out.println(" ");
                       break;
             
             case 6 :  System.out.println(" ");
                       System.out.println(prod.getDescricao());
                       System.out.println(" ");
                       break;
             
             case 7 :  System.out.println("FIM");
                       break;
             default : System.out.println("Erro!, Opção inválida");  
                       break;
          }
          }
          catch(InputMismatchException e)
          {
             System.out.println("Erro!, Entrada de caracteres invalidos, digite novamente");
             tec.nextLine();
          }
          catch(Exct e){
             System.out.println("Erro!, Entrada de numeros invalidos, digite novamente");
             tec.nextLine();
          }
                        
        }
    }
}