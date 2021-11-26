
public class Produto
{
    private int codigo;
    private String descricao;
    private double qtdEstoque;
    private double custoMedio;
        
   public int getCodigo() 
   {
        return codigo;
   }
    
   public void setCodigo(int codigo) 
   {
        this.codigo = codigo;
   }
    
   public double getQtdEstoque() 
   {
        return qtdEstoque;
   }
    
   public void setQtdEstoque() 
   {
        this.qtdEstoque = qtdEstoque;
   }
    
   public double getCustoMedio() 
   {
        return custoMedio;
   }
    
   public void setCustoMedio() 
   {
        this.custoMedio = custoMedio;
   }
    
   public String getDescricao() 
   {
        return descricao;
   }
    
   public void setDescricao() 
   {
        this.descricao = descricao;
   }
    
   public Produto(String descricao) 
   {
        this.codigo = codigo;
        this.qtdEstoque = qtdEstoque;
        this.custoMedio = custoMedio;
        this.descricao = descricao;
        codigo = codigo + 1;
   }
    
   public void entrada(double quantidade, double valorCompra) 
   {
        if (qtdEstoque >=0 && quantidade >= 0) 
        {
         this.qtdEstoque = qtdEstoque + quantidade;
         this.custoMedio = (qtdEstoque * custoMedio + valorCompra) / quantidade + qtdEstoque;
        }
        else
        {
            throw new Exct ("Erro na entrada de dados");
        }
   }
    
   public void saida(double quantidade) 
   {
        if (qtdEstoque >=0 && quantidade >= 0 && qtdEstoque >= quantidade) {
         this.qtdEstoque = qtdEstoque + quantidade;
        }else{
            throw new  Exct("Erro na entrada de dados");
        }
   }
}

