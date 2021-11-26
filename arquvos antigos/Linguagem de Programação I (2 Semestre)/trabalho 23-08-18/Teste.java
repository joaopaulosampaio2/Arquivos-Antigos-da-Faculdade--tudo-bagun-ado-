
public class Teste
{
    public static void main(String args[])
    {
        double resultado;
        resultado = 3 * Util.PI;
        System.out.println(resultado);
        Departamento myDepartamento = new Departamento("RH");      
        //instancie dois Empregados e adicione-os
        Empregado empregado1 = new Empregado("roberval", 1500);
        Empregado empregado2 = new Empregado("valter", 1600);
        myDepartamento.addEmpregado(empregado1);
        myDepartamento.addEmpregado(empregado2);
        //liste os empregados
        System.out.println(myDepartamento.ListarEmpregado());
        //excluir o empregado 2
        myDepartamento.removeEmpregado(empregado2);
        System.out.println(myDepartamento.ListarEmpregado());
    }
}
