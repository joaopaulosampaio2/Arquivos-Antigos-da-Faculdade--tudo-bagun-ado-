

public class Gerente extends Empregado
{
    private double bonus;
    public Gerente(String nome, double salario, double bonus)
    {
        super(nome, salario);
        this.bonus = bonus;
    }
    
    public double getSalario()
    {
        return super.getSalario() + bonus;
    }
}
