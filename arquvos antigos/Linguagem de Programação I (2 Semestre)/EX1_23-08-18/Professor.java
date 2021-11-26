
/**
 * @author (João Paulo) 
 * @version (1.0)
 */
public class Professor
{
    private String nome;
    private int matricula;
    private double salario;
    
    public Professor(int matricula, double salario, String nome)
    {
        nome = nome;
        salario = salario;
        matricula = matricula;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public int getMatricula()
    {
        return matricula;
    }
    
    public double getSalario()
    {
        return salario;
    }
    
    public void setNome(String novoNome)
    {
        this.nome = novoNome;
    }
    
    public void setMatricula(int novoMatricula)
    {
        this.matricula = novoMatricula;
    }
    
     public void setSalario(double novoSalario)
    {
        this.salario = novoSalario;
    }
}
