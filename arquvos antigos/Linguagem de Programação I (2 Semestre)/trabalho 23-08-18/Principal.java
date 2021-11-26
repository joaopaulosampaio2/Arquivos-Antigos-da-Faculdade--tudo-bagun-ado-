import java.util.*; 
public class Principal
{
    public static void main (String args[])
    {
       controle ctr = new controle();
       Scanner tec = new Scanner(System.in);
       int opcao = 0; 
       String nome;
       double salario;
       int id;
       while(opcao != 11) 
       {
            System.out.println("1-Cadastrar Empregado");
            System.out.println("2-Listar Empregado");
            System.out.println("3-Cadastrar Departamento");
            System.out.println("4-Assosciar Empregado");
            System.out.println("5-Desassociar Empregado");
            System.out.println("6-Listar Empregados por Departamento");
            System.out.println("7-Listar Departamento");
            System.out.println("8-Alterar Salário");
            System.out.println("9-Excluir Empregado");
            System.out.println("10-Excluir Departamento");
            System.out.println("11-Fim");
            opcao = tec.nextInt();tec.nextLine();
            switch(opcao)
            {
                case 1 : System.out.println("Nome:");
                         nome = tec.nextLine();
                         System.out.println("Salario:");
                         salario = tec.nextDouble();
                         ctr.cadastrarEmpregado(nome,salario);
                         break;
                case 2 : System.out.println(ctr.listarEmpregado());
                         break; 
                case 3 : System.out.println("Nome:");
                         nome = tec.nextLine();
                         ctr.cadastrarDepartamento(nome); 
                         break;
                case 4 : System.out.println("Departamento:");
                         nome = tec.nextLine();
                         System.out.println("Id do empregado:");
                         id = tec.nextInt();
                         ctr.associarEmp (nome,id);
                         break;
                case 5 : System.out.println("Departamento:");
                         nome = tec.nextLine();
                         System.out.println("Id do empregado:");
                         id = tec.nextInt();
                         ctr.desassociarEmp(nome,id); 
                         break;
                case 6 : System.out.println("Departamento:");
                         nome = tec.nextLine();
                         System.out.println(ctr.listarEmpregado(nome));
                         break;
                case 7 : System.out.println(ctr.listarDepartamento());
                         break;
                case 8 : System.out.println("Id do empregado:");
                         id = tec.nextInt();
                         System.out.println("Salario:");
                         salario = tec.nextDouble();
                         ctr.alterarSalario(id,salario);
                         break;
                case 9 : System.out.println("Nome do Empregado:");
                         nome = tec.nextLine();
                         ctr.excluirEmpregado(nome);
                         break;
                case 10 :System.out.println("Nome do Departamento:");
                         nome = tec.nextLine();
                         ctr.excluirDepartamento(nome);
                         break;
                default: System.out.println("FIM");
                         break;        
            }     
       }
    }
}
