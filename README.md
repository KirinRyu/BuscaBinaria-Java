# Busca Binária
Neste projeto eu desenvolvi o algoritmo de busca binária em linguagem Java, utilizei a IDE IntelliJ para o código.
O código fora desenvolvido visando atender quantidades ilimitadas de dados presentes na lista, então pode adicionar quantos dados quiser! Ademais, mesmo que o projeto tenha sido feito a partir de Strings, posso garantir que dados do tipo int ou double serão muito bem trabalhados neste projeto também.
Importante ressaltar também que criei um código capaz de ordenar os elementos do vetor de forma crescente, então fique à vontade para colocar strings nele de forma desordenada, pois o próprio programa irá ordenar para você.

Mas o que seria a Busca Binária?
-
Esse algoritmo consiste em aperfeiçoar o tempo de pesquisa, isto é, reduzir o tempo de lentidão na busca de um certo dado num vetor com infinitos elementos do mesmo tipo - sendo ele número, nomes ou caracteres.
A lógica nesse conceito está na suposição de onde o elemento está localizado de acordo com as posições possíveis de dentro do vetor. Tendo isso em mente, quando há um input de um dado específico por parte do usuário, o programa divide o vetor declarado em duas partes, permitindo que 50% do trabalho desnecessário no processo de busca seja descartado.


Imagine que o usuário busque por um item que esteja na última posição de um vetor que contenha 200 elementos, se o programa utilizar o algoritmo de busca linear, certamente irá demorar para retornar. 
Entretanto, com a técnica de busca binária o trabalho vai sendo cortado por uma série de divisões.


Então caso você queira o elemento de número 150 de um vetor de 200 itens, o programa não vai precisar checar cada elemento até chegar no desejado. Basta ele dividir o vetor em dois e analisar se é maior ou menor que o número procurado.

---

De forma matemática, podemos definir:

Posição do elemento procurado é 150;

200 / 2 = 100;

100 < Posição Procurada (150). Então devemos procurar apenas os números acima, descartando o resto;

(100 + 200) / 2 = 150


E aqui está o resultado! A operação de busca binária se tornou muito mais efetiva e rápida em relação ao método de busca linear.

