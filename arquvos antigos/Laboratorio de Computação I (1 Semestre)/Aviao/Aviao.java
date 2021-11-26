
/**
 * @author (João Paulo)
 * @version (1.0)
 */
public class Aviao
{
    private String identificador;
    private char estado;
    private int quantPassageiros;
    private int quantMxm;
    private String Aviao; 
    
    public Aviao (String newidentificador, int newquantMxm){
        char estado = 'P';
        String identificador = newidentificador;
        int quantMxm = newquantMxm;
    }
    public void decolar(){
       if (estado == 'V'){
        this.estado = 'P';
        }else {
        System.out.println ("Avião já, em voo");
        }
    }
    public void pousar(){
        if (estado == 'P'){
        this.estado = 'V';
        }else {
        System.out.println ("Avião já, pousado");
        }
    }
    public String getIdentificador(){
        return identificador;
    }
    public char getEstado(){
        return estado;
    }
    public int getQuantPassageiros(){
        return quantPassageiros;
    }
    public int getQuantMxm(){
        return quantMxm;
    }
    public void setIdentificador(String identificador){
        if (identificador == null && identificador.trim().equals("")){
        throw new IllegalArgumentException();
      }
    }
    public void setQuantMxm (int newquantMxm){
        if (quantMxm == 0 && quantMxm < 0 && newquantMxm > quantMxm){
        throw new IllegalArgumentException();
        }
    }
    public void embarcar(){
        if (estado == 'P'){
            for (int i = 0; i < quantMxm; i++){
                quantPassageiros = quantPassageiros + 1;
                
            }
        }   
    }
    public void desembarcar(){
        if (estado == 'P'){
            for (int i = 0; i <= quantPassageiros; i--){
                quantPassageiros = quantPassageiros - 1;
                if (quantPassageiros == 0){
                break;
                }
            }
        }   
    }
    public String getAviao(String identificador)
    {
        return Aviao;
    }
}
