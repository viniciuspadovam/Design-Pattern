[voltar para a página inicial.](https://github.com/viniciuspadovam/Design-Pattern)

# [L] - Liskov substitution principle (princípio da substituição de Liskov)

> “Uma classe derivada pode ser substituível por sua classe base.”

Esse princípio define que objetos de uma superclasse devem ser substituíveis por objetos de suas subclasses sem quebrar a aplicação. Isso requer que os objetos de suas subclasses se comportem da mesma maneira que os objetos de sua superclasse. Em outras palavras, os objetos dentro de um programa podem ser substituídos por instâncias de seus tipos de subcategoria sem alterar a precisão daquele programa específico.

Como no exemplo do código de cartões da Nubank, onde as classes `DebitCard.java` e `CreditCard.java`, que herdam de `NubankCard.java`, podem ser substituídas entre si na classe `MainPayment.java` sem que ocorra nenhuma divergência ou que se faça necessária nenhuma alteração.
