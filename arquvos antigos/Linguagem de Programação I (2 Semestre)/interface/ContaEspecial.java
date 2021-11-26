

public abstract class ContaEspecial extends Conta implements Tributavel
{
    private double valorDoLimite;
    private double imposto;
    
    public ContaEspecial(int numero, double valorDoLimite)
    {
        super(numero);
        this.valorDoLimite = valorDoLimite;
    }
    
    public void atualiza(double taxa)
    {
        saldo = saldo + saldo * taxa;
    }
    
    public void calculaTributo()
    {
        imposto = saldo * 0.1;
    }
}
