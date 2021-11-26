
/**
 * @author (João Paulo) 
 * @version (1.0)
 */
public class Frota
{
    private Aviao frota[];
    public  Frota()
    {
       frota = new Aviao [75];
    }

    public void addAviao(Aviao aviao)
    {
        for(int i = 0; i < frota.length; i++)
        {
           if(frota[i] == null)
           {
               frota[i] = aviao;
               break;
            }
        }  
    }
    
    public void removeAviao(String identificador)
    {
        for(int i =0; i< frota.length; i++)
        {
            if(frota[i] != null )
            {
                if(frota[i].getIdentificador().equals(identificador))
                {
                   frota[i] = null; 
                }
                
            }
        }
    }
    
    public String listarFrota()
    {
        String saida = "";
        for(int i = 0; i < frota.length; i++)
        {
             if(frota[i] != null)
             {
                 saida = saida + 
                 "Identificador:" + frota[i].getIdentificador()+ '\n' + 
                 "Quantidade Maxima: "+ frota[i].getQuantidadeMaxima()+'\n'+
                 "Estado:" + frota[i].getEstado() + '\n';
             }
        }
        return saida;
    }
    
    public void embarcarAviao(String identificador)
    {
        for(int i = 0; i <frota.length; i++)
        {
            if(frota[i] != null)
            {
               if(frota[i].getIdentificador().equals(identificador))
               {
                 frota[i].embarcar();
               } 
            }
        }
    }
    
    public void desembarcarAviao(String identificador)
    {
        for(int i = 0; i <frota.length; i++)
        {
            if(frota[i] != null)
            {
               if(frota[i].getIdentificador().equals(identificador))
               {
                 frota[i].desembarcar();
               } 
            }
        }
    }
}
 


