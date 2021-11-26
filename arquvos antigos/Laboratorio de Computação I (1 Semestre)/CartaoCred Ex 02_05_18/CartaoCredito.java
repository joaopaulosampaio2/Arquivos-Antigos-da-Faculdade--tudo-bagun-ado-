

public class CartaoCredito
{
    private int numero;
    private float saldo;
    private float limite;
    private float bonus;
    private String bandeira;
    private float valorCompra;
    private float valorPago;
    
    public CartaoCredito (int numeroCard, String bandeiraCard)
    {
        numero = numeroCard;
        bandeira = bandeiraCard;
    }
    
    public CartaoCredito (int numeroCard, float limiteCard, String bandeiraCard)
    {
        numero = numeroCard;
        limite = limiteCard;
        bandeira = bandeiraCard;
    }
    
    public float getSaldo()
    {
        return saldo;
    }
    
    public float getlimite()
    {
        return limite;
    }
    
    public float getBonus()
    {
        return bonus;
    }
    
    public String getBandeira()
    {
        return bandeira;
    }
    
    public int getNumero()
    {
        return numero;
    }

    public void setBandeira(String bandeiraCard)
    {
        if (!bandeiraCard.trim().equals(""))
        { 
            bandeira = bandeiraCard; 
        }
    }
    
    public void setlimite(float limiteCard)
    {
        if (limiteCard >= 0)
        {
            limite = limiteCard;
        }
    }
    
    private void creditaBonus(float valor, char tipo)
    {
        if (tipo == 'C') 
        {
           bonus = bonus + valor * (3 / 100F);
        }
        else 
        {
            bonus = bonus + valor * 0.02f;
        }
        if (bonus > 1000)
        {
            bonus = 1000f;
        }
    }
 
    
    public void Pagar(float valorPago)
    {
        saldo = saldo - valorPago; 
        creditaBonus(valorPago, 'P');
    }

    public void Comprar(float valorCompra)
    {
        if (saldo <= limite)
        {
           saldo = saldo + valorCompra;
           creditaBonus(valorCompra, 'C');
        }
    }
}    