package br.edu.unifil.lp1.consulta.controle;
import java.util.ArrayList;
import br.edu.unifil.lp1.consulta.modelo.Consulta;
/**
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class CadastroDeConsultas
{
    private ArrayList<Consulta> listaConsultas;
    private CadastroDeConsultas()
    {
      listaConsultas = new ArrayList<Consulta>();  
    }
    
    public void incluirConsulta(Consulta c)
    {
        //Incluir uma nova Consulta no cadastro(array);
        listaConsultas.add(c);
    }
    
    public void matriculaPaciente()
    {
        //Exibir matrícula e nome dos pacientes de todas as Consultas específico de plano de saúde: 
        //Prata, Ouro, Diamante e Família.
    }
    
    public void totalConsultas()
    {
       //Retornar o número total de Consultas de um tipo específico de plano de saúde: Prata, Ouro,
       //Diamante e Família. 
    }
    
    public void valorConsultas()
    {
       //Retornar o valor total de Consultas de um tipo específico de plano de saúde: Prata, Ouro,
       //Diamante e Família.
    }
}