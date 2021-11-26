import java.util.ArrayList;
public class Departamento
{
   private String nome;
   private ArrayList<Empregado> listaEmp; 
   
   public Departamento(String  nome)
   {
       this.nome = nome;
       listaEmp = new ArrayList();
   }
   
   public void addEmpregado (Empregado e)
   {
       listaEmp.add(e);      
   }
   
   public void removeEmpregado (Empregado e)
   {
       listaEmp.remove(e);
   }
   
   public String getNome()
   {
      return this.nome; 
   }
   
   public void setNome(String nome)
   {
       this.nome = nome;
   }
   
   public String ListarEmpregado()
   {
       String saida="";
       Empregado empAux;
       for(int i=0; i<listaEmp.size();i++)
       {
           empAux = listaEmp.get(i);
           saida = saida + empAux.getNome();
       }
       return saida;
   }
   
}
