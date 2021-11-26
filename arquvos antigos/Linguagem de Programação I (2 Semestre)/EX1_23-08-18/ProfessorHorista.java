
/**
 * @author (João Paulo) 
 * @version (1.0)
 */
public class ProfessorHorista extends Professor
{
   private int horas; 
   public ProfessorHorista(int matricula, double salario, String nome, int h)
   {
      super(matricula, salario, nome);
      horas = h;
   }
   
   public int getHoras()
   {
       return horas;
   }
   
   public void setHoras(int h)
   {
       horas = h;
   }
   
   public double getSalario()
   {
       return super.getSalario() * horas;
   }
}
