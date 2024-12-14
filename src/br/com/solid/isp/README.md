[voltar para a página inicial.](https://github.com/viniciuspadovam/Design-Pattern)

# [I] - Interface Segregation Principle Princípio da Segregação de Interfaces

> “Classes não devem ser forçadas a depender de métodos que não usam”

Segundo o **Princípio da Segregação de Interface**, é melhor evitar adicionar novas funcionalidades ou métodos a uma interface existente. Em vez disso, é recomendável incorporar uma nova interface e permitir que as classes implementem interfaces diferentes com base na necessidade.

No exemplo, de forma errônea, a interface `Ivehicle.java` tem métodos de criação de carro e moto, o que a deixa "inflada", pois para criar uma classe `Car.java` que irá implementar essa interface, será necessário implementar o método da moto.

Enquanto no exemplo correto, há interfaces especificas para carro e moto e a geral, o que permite que a classe `Car.java` tenha somente métodos relacionados a um carro e a classe `Motorcycle.java` tenha somente métodos relacionados a uma moto.
