
/**
 * @author (João Paulo) 
 * @version (1.0)
 */
public class ProfessorDE extends Professor
{
   private int licencaPremio;
   public ProfessorDE(int matricula, double salario, String nome)
   {
        super(matricula,salario,nome);
   }
   
   public void setLicencaPremio(int licencaPremio)
   {
       this.licencaPremio = licencaPremio;
   }
   
   public int getLicencaPremio()
   {
       return licencaPremio;
   }
}
