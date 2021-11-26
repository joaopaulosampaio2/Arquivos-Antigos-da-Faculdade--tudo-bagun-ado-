import java.util.*;
public class Matriz
{
    private Scanner tec;
    public Matriz()
    {
        tec = new Scanner(System.in);
    }
    
    public void carrega(int m[][])
    {
        for(int i=0; i < m.length; i++)
        {
            for(int j=0; j < m[i].length; j++)
            {
                System.out.println("Linha " + (i+1) + "Coluna " + (j+1) + ": ");
                m[i][j] = tec.nextInt();
            }
        }
    }
    
    public void mostra(int m[][])
    {
        for(int i=0; i < m.length; i++)
        {
            for(int j=0; j < m[i].length; j++)
            {
                System.out.println("Linha " + (i+1) + "Coluna " + (j+1) + ": " + m[i][j]);
            }
        }
    }
    
    public int[][] soma(int m1[][], int m2[][])
    {
        //verificar se as duas matrizes sao do mesmo tamanho.
        int m3[][] = new int[m1.length][m1[0].length];
        for(int i=0; i < m1.length; i++)
        {
            for(int j=0; j < m1[i].length; j++)
            {
                m3[i][j] =m1[i][j] + m2[i][j];
            }
        }
        return m3;
    }
    
    public int[][] transposta(int m[][])
    {
        //retorne a matriz transporta
        int transposta[][] = new int[m.length][m[0].length];
        for(int i=0; i < m.length; i++)
        {
            for(int j=0; j < m[i].length; j++)
            {
                transposta[j][i] = m[i][j];
            }
        }
        return transposta;
    }
    
    public boolean isQuadradoMagico(int m1[][]){
       int diagPrincipal = 0;
            for(int i = 0; i< m1.length;i++){
        diagPrincipal += m1[i][i];
    }
    int diagSecundaria = 0;
      for(int i = m1.length - 1; i >= 0; i--){
        diagSecundaria += m1[i][i];
    }
    int somaLinha = 0;
    if(diagPrincipal == diagSecundaria){
        
        for(int i = 0; i< m1.length;i++){
            somaLinha += m1[0][i];
        }
            if(somaLinha == diagSecundaria){
           somaLinha = 0;
             for(int i = 0; i< m1.length;i++){
                 somaLinha += m1[1][i];
           }
        }
        else{
            return false;
        }
        if(somaLinha == diagSecundaria){
           somaLinha = 0;
             for(int i = 0; i< m1.length;i++){
                 somaLinha += m1[2][i];
           }
        }
        else{
            return false;
        }
    }
    else{
        return false;
    }
    int somaColuna = 0;
    if(somaLinha == diagSecundaria){
          
        for(int i = 0; i< m1.length;i++){
            somaColuna += m1[0][i];
        }
            if(somaColuna == diagSecundaria){
           somaColuna = 0;
             for(int i = 0; i< m1.length;i++){
                 somaColuna += m1[1][i];
           }
        }
        else{
            return false;
        }
        if(somaColuna == diagSecundaria){
           somaColuna = 0;
             for(int i = 0; i< m1.length;i++){
                 somaColuna += m1[2][i];
           }
        }
        else{
            return false;
        }
    }
    else{
        return false;
    }
    if(somaColuna == diagSecundaria){
        return true;
        } 
        else{
        return false;
        }
      }
}
