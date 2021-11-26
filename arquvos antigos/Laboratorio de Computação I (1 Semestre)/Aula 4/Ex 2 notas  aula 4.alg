algoritmo "semnome"
// Função :
// Autor :
// Data : 15/03/2018
// Seção de Declarações 
var
nome1, nome2, nome3 : caracter
nota1, nota2, nota3, media : real
inicio
escreval ("nome da disciplina 1 ")
leia(nome1)
escreval ("nota da disciplina 1")
leia(nota1)
escreval ("nome da disciplina 2 ")
leia(nome2)
escreval ("nota da disciplina 2 ")
leia(nota2)
escreval ("nome da disciplina 3 ")
leia(nome3)
escreval ("nota da disciplina 3 ")
leia(nota3)
media <- (nota1 + nota2 + nota3) /3
escreval (" sua media e = " , media)
se (media >= 70) entao
escreval ("aprovado ")
senao
escreval ("reprovado ")
fimse
fimalgoritmo
