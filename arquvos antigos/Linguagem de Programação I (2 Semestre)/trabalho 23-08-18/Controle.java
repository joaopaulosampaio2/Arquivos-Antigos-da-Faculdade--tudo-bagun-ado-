import java.util.ArrayList;
public class controle
{
    private ArrayList<Empregado> listEmp;
    private ArrayList<Departamento> listDep;
    int empregad = 0;
    public controle()
    {
        listEmp = new ArrayList<Empregado>();
        listDep = new ArrayList<Departamento>();
    }

    public void cadastrarEmpregado (String nome, double salario)
    {
        //Criar empregado
        Empregado emp1 = new Empregado(nome, salario);
        //Inserir objeto empregado na lista listEmp
        listEmp.add(emp1);
    }
   
    public void excluirEmpregado(String nome)
    {
       Empregado auxEmp;
       for(int i=0; i < listEmp.size(); i++)
       {
           auxEmp = listEmp.get(i);
           if(auxEmp.getNome().equals(nome))
           {
               listEmp.remove(auxEmp);
           }
       }
    }
    
    public void excluirDepartamento(String nome)
    {
       Departamento auxDep;
       for(int i=0; i < listDep.size(); i++)
       {
           auxDep = listDep.get(i);
           if(auxDep.getNome().equals(nome))
           {
               listDep.remove(auxDep);
           }
       }
    }
            
    public String alterarSalario (int id, double salario)
    {
        String saida = "Empregado não encontrado";
        for(int i = 0; i <listEmp.size(); i++)
        {
            Empregado auxEmp;
            auxEmp = listEmp.get(i);
            if(auxEmp.getId() == id)
            {
                auxEmp.setSalario(salario);
                saida = "Salario alterado com sucesso";
            }
        }
        return saida;
    }
    
    public void cadastrarDepartamento (String nome)
    {
        //criar objeto departamento
        Departamento dep1 = new Departamento (nome);
        //Inserir objeto departamento na lista listDep
        listDep.add(dep1);
    }
   
    public void associarEmp (String departamento, int matricula)
    {
        //localizar departamento e funcionario
        //se achou adiciona empregado ao departamento
        //chamar metodo adicionaEmpregado() da classe Departamento
        Departamento auxDep;
        Empregado auxEmp; 
        for (int i = 0; i < listDep.size(); i++)
        {
            auxDep = listDep.get(i);
            if(auxDep.getNome().equals (departamento))
            {
                for(int j = 0; j < listEmp.size(); j++)
                {
                    auxEmp = listEmp.get(j);
                    if((auxEmp.getId() == matricula) && (auxEmp.getNAOaloc() == 'N'))
                    {
                        auxDep.addEmpregado(auxEmp);
                        auxEmp.setNAOaloc('S');
                        break;
                    }                         
                }
                break;
            }
        }    
        
    }
   
    public void desassociarEmp(String departamento, int matricula)
    {
        //localizar departamento e empregado
        //se achou remove empregado do departamento
        //chamar metodo removeEmpregado() da classe departamento
        Departamento auxDep;
        Empregado auxEmp;
        for (int i = 0; i < listDep.size(); i++)
        {
            auxDep = listDep.get(i);
            if(auxDep.getNome().equals (departamento))
            {
                for(int j = 0; j < listEmp.size(); j++)
                {
                    auxEmp = listEmp.get(j);
                    if((auxEmp.getId() == matricula) && (auxEmp.getNAOaloc() == 'S'))
                    {
                        auxDep.removeEmpregado(auxEmp);
                        auxEmp.setNAOaloc('N');
                        break;
                    }                                               
                }
                break;
            }
        }
    }
   
    public String listarEmpregado(String departamento)
    {
        //percorrer listDep e localizar o departamento
        //se achou chamar o metodo listarEmpregado()
        //classe Departamento
        String saida = "";
        Departamento auxDep;
        for(int i = 0; i < listDep.size(); i++)
        {
            auxDep = listDep.get(i);
            if (auxDep.getNome().equals (departamento))
            {
                 saida = auxDep.ListarEmpregado();
                 break;
            }
        }
        return saida;
    }

    public String listarEmpregado()
    {
        //percorrer listEmp e retornar id, nome e
        //salario de todos os empregados cadastrados
        String saida = "";
        Empregado empAux;
        for(int i=0; i<listEmp.size();i++)
        {
             empAux = listEmp.get(i);
             saida = saida + empAux.getId() + " " +
                     empAux.getNome() + " " +
                     empAux.getSalario() + '\n';
        }
        return saida;
    }
    
    public String listarDepartamento()
    {
        String saida = "";
        Departamento auxDep;
        for(int i = 0; i <listDep.size(); i++)
        {
            auxDep = listDep.get(i);
            saida = saida + "  " + auxDep.getNome();
        }
        return saida;
    }
}  
    
    
    
    
    
    
    
