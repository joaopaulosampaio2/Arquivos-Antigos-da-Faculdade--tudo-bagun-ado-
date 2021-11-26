
/**
 * @author (João Paulo) 
 * @version (1.0)
 */
public class Frota
{
    private Aviao frota [];
    
    public Frota()
    {
        frota = new Aviao[5];
    }
    
    public void addAviao(Aviao aviao)
    {
        for (int i = 0; i < frota.length; i++)
        {
           frota[i] = aviao;
        }
    }
    
    public void removeAviao(String Identificador)
    {
        for (int i = 0; i < frota.length; i++)
        {
              if(frota[i].getIdentificador().compareTo(Identificador)==0)
              {
                  frota[i] = null;
                  i = frota.length;
              }
        }        
    }
    
    public String listarFrota()
    {
        String saida = " ";
        for (int i = 0; i < frota.length;i++)
        {
            if (frota [i] != null)
            {
              saida = saida +
              "Avião: " + frota[i].getIdentificador() + '\n' +
              "Quantidade maxima de passageiros: " + frota[i].getQuantMxm() + '\n'+
              "Estado: " + frota[i].getEstado() + '\n'+
              "passageiros: " + frota[i].getQuantPassageiros() + '\n'+ '\n' ;
            }
        }
        return saida;
    }
}

