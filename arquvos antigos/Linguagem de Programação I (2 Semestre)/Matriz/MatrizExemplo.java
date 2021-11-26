import java.util.*;
public class MatrizExemplo
{
    public static void main(String args[])
    {
        Scanner tec = new Scanner(System.in);
        int a[][] = new int [4][4];
        int soma = 0;
        int soma2 = 0;
        for(int i=0; i < a.length; i++)
        {
            for(int j=0; j < a[i].length; j++)
            {
                System.out.println("Linha " + (i+1) + "Coluna " + (j+1) + ": ");
                a[i][j] = tec.nextInt();
                soma += a[i][j];
            }
        }
        System.out.println("Soma: " + soma);
        int media = soma / 16;
        System.out.println("Media: " + media);
        for(int i=0; i < a.length; i++)
        {
            for(int j=0; j < a[i].length; j++)
            {
                if(a [i] [j] > media)
                {
                    System.out.println("Numeros maiores que a Média : " + a[i][j]);
                }
            }
        }
        soma2 = a[0][0] + a[1][1] + a[2][2] + a[3][3];
        System.out.println("Soma da Diagonal principal é: " + soma2);
     }
}

