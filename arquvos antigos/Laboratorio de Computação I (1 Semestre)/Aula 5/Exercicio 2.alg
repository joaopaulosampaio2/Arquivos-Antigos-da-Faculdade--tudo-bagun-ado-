algoritmo " Ex 2 Numeros Primos (Aula5)"

var
n, x, z, c : inteiro
inicio
      escreval("Qualquer numero: ")
      leia (n)
      escreval("----------------------")
      se n > 0 entao
      z <- 1
      para c de 2 ate (n-1) faca
      se n mod c = 0 entao
      x <- x + 1
      fimse
      fimpara
      se x <> 0 entao
         escreval (n, "  -Não faz parte dos numeros primos")
         senao
         se x = 0 entao
         escreval(n, "   -Faz parte dos numeros primos")
         fimse
      fimse
fimse
//João Paulo Theodoro Sampaio
//João Vitor leite


fimalgoritmo
