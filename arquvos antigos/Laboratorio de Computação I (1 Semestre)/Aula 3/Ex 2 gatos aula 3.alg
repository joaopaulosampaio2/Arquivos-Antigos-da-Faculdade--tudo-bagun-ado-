algoritmo "semnome"
// Função :
// Autor :
// Data : 14/03/2018
// Seção de Declarações
var
saco, gato1, gato2, sobra : real
inicio
escreval ("informe o peso do saco de racao em kg")
leia(saco)
escreval("informe a quantidade consumida pelo primeiro gato em gramas ")
leia (gato1)
gato1 <- gato1/1000
escreval ("informe a quantidade consumida pelo segundo gato em gramas ")
leia (gato2)
 gato2 <- gato2/1000
sobra <- saco - ((gato1 + gato2) *5)
escreval ("no saco de racao restara:" , sobra)
fimalgoritmo
