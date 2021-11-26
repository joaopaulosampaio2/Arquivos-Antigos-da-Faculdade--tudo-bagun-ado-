
/**
 * Classe Conta para representar conta corrente.
 * @author (João Paulo) 
 * @version (1.0)
 */
public class Conta
{
    // atributos
    int numero;
    String titular;
    double saldo;

    //construtor
    public Conta(String tit, int num)
    {
        numero = num;
        titular = tit;
    }
    
    public Conta(String tit)
    {
        titular = tit;
    }
    //mÃ©todo sacar com parÃ¢metro valor
    public boolean sacar(double valor)
    {
        //declaraÃ§Ã£o da variavel novoSaldo seguida por atribuiÃ§Ã£o
        if (valor > saldo){
            return false;
        }
        else{
            double novoSaldo = saldo - valor;
            saldo = novoSaldo;
            return true;
        }
    }
    
    public void depositar(double valor)
    {
        saldo = saldo + valor;
    }
    
    public double getSaldo()
    {
        return saldo;
    }
}
