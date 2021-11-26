

public abstract class Conta
{
    protected double saldo;
    private int numero;
    
    public Conta(int numero)
    {
        this.numero = numero;
    }
    
    public abstract void atualiza(double taxa);
}
