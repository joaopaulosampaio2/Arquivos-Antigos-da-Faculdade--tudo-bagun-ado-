import java.util.*;
public class TesteMatriz
{
    public static void main (String args[])
    {
        Matriz matriz = new Matriz();
        int mtz[][] = new int[2][2];
        matriz.carrega(mtz);
        System.out.println("Matriz mtz");
        matriz.mostra(mtz);
        
        int xbq[][] = new int[2][2];
        matriz.carrega(xbq);
        System.out.println("Matriz xbq");
        matriz.mostra(xbq);
        
        int aux[][] = new int[2][2];
        aux = matriz.soma(mtz,xbq);
        System.out.println("Matriz aux");
        matriz.mostra(aux);
        
        int transposta[][] = new int[2][2];
        matriz.carrega(transposta);
        System.out.println("Matriz m");
        transposta = matriz.transposta(transposta);
        matriz.mostra(transposta);
        
        int trs[][] = new int [3][3];
        matriz.carrega(trs);
        System.out.println(matriz.isQuadradoMagico(trs));
        
    }
}
