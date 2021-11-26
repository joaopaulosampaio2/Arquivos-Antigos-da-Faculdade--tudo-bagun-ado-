
/**
 * @author (João Paulo) 
 * @version (1.0)
 */
public class Agencia
{
    private int numero;
    private Conta contas[];
    public Agencia (int numero)
    {
        this.numero = numero;
        contas = new Conta[5];
    }
    
    public void incluiConta(Conta conta)
    {
       for(int i=0; i<contas  ) 
    }
    
    public String listaConta()
    {
        String saida = "";
        for(int i=0; i<contas.length; i++)
        {
            saida = saida + contas[i].getNumero
                   " " + contas[i].getTitular() + '\n ;
        }
        return saida;
    }
}
