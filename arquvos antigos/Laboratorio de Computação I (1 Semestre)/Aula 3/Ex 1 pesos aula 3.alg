algoritmo "semnome"
// Função :
// Autor :
// Data : 14/03/2018
// Seção de Declarações
var
pesoreal, pesogordo, pesomagro : real
inicio
escreval ("informe seu peso")
leia(pesoreal)
pesogordo <- pesoreal + pesoreal * (15/100)
pesomagro <- pesoreal - pesoreal * (20/100)
escreval ("se voce engordar 15% ficara com:" ,pesogordo)
escreval ("se voce emagrecer 20% ficara com:" ,pesomagro)
fimalgoritmo
