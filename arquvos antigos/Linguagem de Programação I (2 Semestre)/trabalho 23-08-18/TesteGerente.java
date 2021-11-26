

public class TesteGerente
{
    public static void main (String args[])
    {
        Gerente chefe = new Gerente("João Paulo",7000,500);
        System.out.println(chefe.getNome());
        System.out.println(chefe.getSalario());
    }
}
