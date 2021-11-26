

public class Empregado
{
    private int id;
    private static int proximaId = 1; 
    private String nome;
    private double salario;
    private char NAOaloc;
    //metodo get e set para nome e salario
    //construtor com parametros nome e salario      
    public Empregado()
    {
        setId();
    }
    
    public Empregado(String nome, double salario)
    {
        setId();
        this.NAOaloc = 'N';
        this.nome = nome;
        this.salario = salario;
    }
    
    public char getNAOaloc()
    { return this.NAOaloc;
    }
    
    public void setNAOaloc(char novoNAOaloc)
    {
        this.NAOaloc = novoNAOaloc;
    }
    
    public void setId()
    {
        id = proximaId;
        proximaId++;
    }
    
    public static int getProximaId()
    {
        return proximaId;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getNome()
    {
       return this.nome;
    }
    
    public void setNome(String novoNome)
    {
      this.nome = novoNome;  
    }
    
    public double getSalario()
    {
       return this.salario;
    }
    
    public void setSalario(double novoSalario)
    {
        this.salario = novoSalario;
    }
    
  
}
