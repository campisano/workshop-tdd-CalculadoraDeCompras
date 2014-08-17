== Caelum TDD exercise ==

* from https://gist.github.com/mauricioaniche/8042e7a2689c96a4fe1f

Exercício: Tabela de Descontos, Frete, Compra.
Uma compra tem muitos ítens e um cliente. Cada item tem um nome, um preço unitário, uma quantidade. Um cliente tem nome e estado.
Para se calcular o valor final, deve-se ver o valor total da compra + frete - desconto.

O frete: de acordo com a região do país e quantidade de ítens.
SP, até 3 ítens: 10,00
SP, mais que 3 ítens: 17,00
RJ, até 4 ítens: 11,00
RJ, mais que 4 ítens: 15,00
Sul do país: 22,00
Restante: 25,00

Desconto: Baseado no valor da compra.
Se compra total for menor ou igual a 500, desconto de 5%.
Se compra total estiver entre 501 e 2000 (inclusive), desconto de 10%.
Mais que isso, 15%.

Fazer uma classe que, dado uma compra com ítens e cliente, ele devolve o valor final da compra.