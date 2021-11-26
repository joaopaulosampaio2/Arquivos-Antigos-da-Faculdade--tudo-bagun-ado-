
/**
 * @author (João Paulo)
 * @version (1.0)
 */
public class Aviao
{
    private String identificador;
    private char estado;
    private int quantidadeMaxima;
    private int quantidadePassageiros;
    public Aviao (String iden, int quantM)
    {
        
        identificador = iden;
        estado = 'P';
        quantidadeMaxima = quantM;

    } 
    
    public void decolar     ()
    {
        if (estado == 'P')
        {
            estado = 'V'; 
        }
        else
        {
            System.out.println("AviÃ£o ja esta em VOOOO");
        }  
    }
    public void pousar()
    {
        if(estado == 'V')
        {
            estado = 'P';
        }
        else
        {
            System.out.println("AviÃ£o ja esta parado.");
        }
    }
    
    public String getIdentificador()
    {
     return identificador;
    } 
    
    public char getEstado()
    {
        return estado;
    }
    
    public int getQuantidadePassageiros()
    {
        return quantidadePassageiros;
    }
    
    public void setIdentificador(String id)
    {
        if(!id.trim().equals(""))
        {
            System.out.println("ID Invalida.");
        }
        else
        {
            identificador = id;
        }
    }
    
    public void setQuantidadeMaxima(int qm)
    {
        if(quantidadeMaxima <=0 && quantidadeMaxima > quantidadeMaxima)
        {
            System.out.println("Quantidade Invalida.");
        }
        else
        {
            quantidadeMaxima = qm;
        }
    }
    
    public int getQuantidadeMaxima()
    {
        return quantidadeMaxima;
    }
    
    public void embarcar()
    {
        if((estado =='P') && (quantidadePassageiros == quantidadeMaxima))
        {
            quantidadePassageiros +=1;
        }
    }
    
    public void desembarcar()
    {
        if((estado =='P') && (quantidadePassageiros == quantidadeMaxima))
        {
            quantidadePassageiros -=1;
        }
    }
}

