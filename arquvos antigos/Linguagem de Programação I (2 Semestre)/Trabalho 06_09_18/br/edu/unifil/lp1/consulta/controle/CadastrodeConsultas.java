package br.edu.unifil.lp1.consulta.controle;
import br.edu.unifil.lp1.consulta.modelo.*;
import java.util.ArrayList;
public class CadastrodeConsultas
{
    private ArrayList<Consulta> ListConsulta;
    int Dependentes;
    int Matricula;
    int ano;
    double Valor;
    int Plano;
    String Nome;
    public CadastrodeConsultas()
    {
        ListConsulta = new ArrayList<Consulta>();
    }
    
    public void addConsulta(String Nome,int Matricula,int Dependentes,int ano,double Valor,int Plano)
    {
        Consulta C; 
        if(Plano == 1)
        {
            C = new ConsultaPrata(Nome,Matricula,Dependentes,ano,Valor,Plano);
            ListConsulta.add(C);
        }
        
        if(Plano == 2)
        {
            C = new ConsultaOuro(Nome,Matricula,Dependentes,ano,Valor,Plano);
            ListConsulta.add(C);
        }
        
        if(Plano == 3)
        {
            C = new ConsultaDiamante(Nome,Matricula,Dependentes,ano,Valor,Plano);
            ListConsulta.add(C);
        }
        
        if(Plano == 4)
        {
            C = new ConsultaFamilia(Nome,Matricula,Dependentes,ano,Valor,Plano);
            ListConsulta.add(C);
        }
    }
    
    public String ListarConsultas(int Plano)
    {
        String saida = "";
        Consulta auxCon;
        if(Plano == 1)
        {
            for(int i = 0;i < ListConsulta.size(); i++)
            {
                auxCon = ListConsulta.get(i);
                if(auxCon.getClass().toString().contains("Prata"))
                {
                  saida = saida + "Nome: "+ auxCon.getNome()+'\n'+"Matricula: "+auxCon.getMatricula()+'\n'+"Número de Dependentes: "
                 +auxCon.getDependentes()+'\n'+"Ano de Inclusão: "+ auxCon.getano()+'\n'+"Valor da Consulta: "+auxCon.getValor();
                }else
                {
                    System.out.println("Não existem consultas com o plano Prata registradas");
                }
            }  
        }
        
        if(Plano == 2)
        {
            for(int i = 0;i < ListConsulta.size(); i++)
            {
                auxCon = ListConsulta.get(i);
                if(auxCon.getClass().toString().contains("Ouro"))
                {
                  saida = saida + "Nome: "+ auxCon.getNome()+'\n'+"Matricula: "+auxCon.getMatricula()+'\n'+"Número de Dependentes: "
                 +auxCon.getDependentes()+'\n'+"Ano de Inclusão: "+ auxCon.getano()+'\n'+"Valor da Consulta: "+auxCon.getValor();
                }else
                {
                    System.out.println("Não existem consultas com o plano Ouro registradas");
                }
            }  
        }
        
        if(Plano == 3)
        {
            for(int i = 0;i < ListConsulta.size(); i++)
            {
                auxCon = ListConsulta.get(i);
                if(auxCon.getClass().toString().contains("Diamante"))
                {
                  saida = saida + "Nome: "+ auxCon.getNome()+'\n'+"Matricula: "+auxCon.getMatricula()+'\n'+"Número de Dependentes: "
                 +auxCon.getDependentes()+'\n'+"Ano de Inclusão: "+ auxCon.getano()+'\n'+"Valor da Consulta: "+auxCon.getValor();
                }else
                {
                    System.out.println("Não existem consultas com o plano Diamante registradas");
                }
            }  
        }
        
        if(Plano == 4)
        {
            for(int i = 0;i < ListConsulta.size(); i++)
            {
                auxCon = ListConsulta.get(i);
                if(auxCon.getClass().toString().contains("Familia"))
                {
                  saida = saida + "Nome: "+ auxCon.getNome()+'\n'+"Matricula: "+auxCon.getMatricula()+'\n'+"Número de Dependentes: "
                 +auxCon.getDependentes()+'\n'+"Ano de Inclusão: "+ auxCon.getano()+'\n'+"Valor da Consulta: "+auxCon.getValor()+'\n';
                }else
                {
                    System.out.println("Não existem consultas com o plano Familia registradas");
                }
            }  
        }
         return saida;
    }
    
    public int NumeroPlano(int Plano)
    {
        Consulta auxCon;
        int numeroConsultas = 0;
        if(Plano == 1)
        {
            for(int i = 0;i < ListConsulta.size(); i++)
            {
                auxCon = ListConsulta.get(i);
                if(auxCon.getClass().toString().contains("Prata"))
                {
                    numeroConsultas++;
                }else
                {
                    numeroConsultas = 0;
                }
            }  
        }
        
        if(Plano == 2)
        {
            for(int i = 0;i < ListConsulta.size(); i++)
            {
                auxCon = ListConsulta.get(i);
                if(auxCon.getClass().toString().contains("Ouro"))
                {
                    numeroConsultas++;
                }else
                {
                    numeroConsultas = 0;
                }
            }  
        }
        
        if(Plano == 3)
        {
            for(int i = 0;i < ListConsulta.size(); i++)
            {
                auxCon = ListConsulta.get(i);
                if(auxCon.getClass().toString().contains("Diamante"))
                {
                    numeroConsultas++;
                }else
                {
                    numeroConsultas = 0;
                }
            }  
        }
        
        if(Plano == 4)
        {
            for(int i = 0;i < ListConsulta.size(); i++)
            {
                auxCon = ListConsulta.get(i);
                if(auxCon.getClass().toString().contains("Familia"))
                {
                    numeroConsultas++;
                }else
                {
                    numeroConsultas = 0;
                }
            }  
        }
        return numeroConsultas;
    }
    
    public double valorConsultas(int Plano)
    {
        Consulta auxCon;
        double valorConsultas = 0;
        if(Plano == 1)
        {
            for(int i = 0;i < ListConsulta.size(); i++)
            {
                auxCon = ListConsulta.get(i);
                if(auxCon.getClass().toString().contains("Prata"))
                {
                    valorConsultas += auxCon.getValor();
                }
            }  
        }
        
        if(Plano == 2)
        {
            for(int i = 0;i < ListConsulta.size(); i++)
            {
                auxCon = ListConsulta.get(i);
                if(auxCon.getClass().toString().contains("Ouro"))
                {
                    valorConsultas += auxCon.getValor();
                }
            }  
        }
        
        if(Plano == 3)
        {
            for(int i = 0;i < ListConsulta.size(); i++)
            {
                auxCon = ListConsulta.get(i);
                if(auxCon.getClass().toString().contains("Diamante"))
                {
                    valorConsultas += auxCon.getValor();
                }
            }  
        }
        
        if(Plano == 4)
        {
            for(int i = 0;i < ListConsulta.size(); i++)
            {
                auxCon = ListConsulta.get(i);
                if(auxCon.getClass().toString().contains("Familia"))
                {
                    valorConsultas += auxCon.getValor();
                }
            }  
        }
        return valorConsultas;
    }
}
