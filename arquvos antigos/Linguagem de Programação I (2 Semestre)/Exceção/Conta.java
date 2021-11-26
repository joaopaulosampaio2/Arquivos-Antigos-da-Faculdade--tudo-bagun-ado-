import java.util.*;
public class Conta
{
    private int numero;
    private double saldo;
    public Conta(int numero)
    {
        this.numero = numero;
    }
    /*
    public boolean saca(double valor)
    {
        if(valor >this.saldo)
        {
            return false;
        }
        else
        {
            this.saldo = this.saldo - valor;
            return true;
        }
        */
    public void saca(double valor)
    {
        if(valor > this.saldo)
        {
            //throw new IllegalArgumentException("Saldo Insuficiente");
            throw new IllegalArgumentException("Saldo Insuficiente");
        }
        else
        {
            this.saldo = this.saldo - valor;
        }
    }  
}

