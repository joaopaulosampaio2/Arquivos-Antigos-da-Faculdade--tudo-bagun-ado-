
/**
 * @author (João Paulo Theodoro) 
 * @version (1.0)
 */
public class Jogador
{
    //atributos//
    private String nome;
    private String posicao;
    private double altura;
    private double peso;
    private int numeroCamisa;
    public Jogador(String nome, String posição)
    {
        //inicializa as variaveis de instância
        this.nome = nome; 
        this.posicao = posicao;
    }
    
     public Jogador(double altura,double peso)
    {
        //inicializa as variaveis de instância
        this.altura = altura; 
        this.peso = peso;
        this.numeroCamisa = numeroCamisa;
    }
    //metodos get//
    public String getNome()
    {
        return this.nome;
    }
    
    public String getPosicao()
    {
        return this.posicao;
    }
    
    public double getAltura()
    {
        return this.altura;
    }
    
    public double getPeso()
    {
        return this.peso;
    }
    
    public int getNumerocamisa()
    {
        return this.numeroCamisa;
    }
    //metodos set//
    public void setNome(String novoNome)
    {
       this.nome = novoNome; 
    }
    
    public void setPosicao(String novoPosicao)
    {
       this.posicao = novoPosicao; 
    }
    
    public void setAltura(double novoAltura)
    {
       this.altura = novoAltura; 
    }
    
    public void setPeso(double novoPeso)
    {
       this.peso = novoPeso; 
    }
    
    public void setNumerocamisa(int novoNumero)
    {
       this.numeroCamisa = novoNumero;
    }
}
