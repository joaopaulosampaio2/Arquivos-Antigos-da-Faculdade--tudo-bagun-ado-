algoritmo "semnome"
// Função :
// Autor :
// Data : 15/03/2018
// Seção de Declarações 
var
produto1, produto2 : caracter
total, desconto, valor1, valor2 : real
inicio
escreval ("insira o nome do primeiro produto ")
leia(produto1)
escreval ("insira o preco ")
leia(valor1)
escreval ("insira o nome do segundo produto ")
leia(produto2)
escreval ("insira o preco ")
leia(valor2)
total <- valor1 + valor2
escreval (" 1 = " , produto1)
escreval(" valor = " , valor1)
escreval (" 2 = " , produto2)
escreval (" valor = " , valor2)
escreval (" o total da compra é = " , total)
se (total > 100) entao
desconto <- total * (20/100)
escreval (" o total da compra com desconto é = " , total - desconto)
fimse
fimalgoritmo
