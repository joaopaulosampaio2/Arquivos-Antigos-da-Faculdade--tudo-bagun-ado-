import java.util.*;
public class Produto
{
    private int codigo; //incrementar 1 no codigo
    private String descricao;
    private double quantEstoque;
    private double custoMedio;
    // get e set para cada atributo com tratamento de exceção.
    public Produto (int codigo, String descricao, double quantEstoque, double custoMedio)
    {
       this.codigo = codigo;
       this.descricao = descricao;
       this.quantEstoque = quantEstoque;
       this.custoMedio = custoMedio;
    }
    
    public int getCodigo()
    {
        return this.codigo;
    }
    
    public String getDescricao()
    {
        return this.descricao;
    }
    
    public double getQuantEstoque()
    {
        return this.quantEstoque;
    }
    
    public double getCustoMedio()
    {
        return this.custoMedio;
    }
    
    public void setCodigo (int novoCodigo)
    {
       this.codigo = novoCodigo;  
    }
    
    public void setDescricao (String novaDescricao)
    {
        this.descricao = novaDescricao;
    }
    
    public void setQuantEstoque(double novaQuantEstoque)
    {
        this.quantEstoque = novaQuantEstoque;
    }
    
    public void setCustoMedio(double novoCustoMedio)
    {
        this.custoMedio = novoCustoMedio; 
    }
    
    public void entrada(double quantidade, double valorCompra)
    {
       //atualizar o estoque (adicionar)
       if(quantEstoque >= 0 && quantidade >= 0)
       {
           this.quantEstoque = quantEstoque + quantidade;
       }
       else
       {
           throw new atualizarEstoqueException("Estoque não pode ser negativo");
       }
       // atuaizar o custMedio (quantEstoque * custoMedio + valorCompra) / (quantidade + quantEstoque)
       this.custoMedio = (quantEstoque * custoMedio + valorCompra) / (quantidade + quantEstoque);
    }
    
    public void saida(double quantidade)
    {
        // atualizar estoque (subtrair).
        if(quantEstoque >= 0 && quantidade >= 0)
       {
           this.quantEstoque = quantEstoque - quantidade;
       }
       else
       {
           throw new atualizarEstoqueException("Estoque não pode ser negativo");
       }
    }
}
