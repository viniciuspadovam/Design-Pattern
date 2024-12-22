# Factory Pattern

### O que é?

A proposta do padrão Factory é de criar objetos, por isso este é considerado um padrão **criacional**. Basicamente, a lógica criacional é encapsulada dentro do factory e, ou é fornecido um método que retorna um novo objeto criado (*Padrão Factory Method*) ou delega-se a criação do objeto para uma subclasse (*Padrão Abstract Factory*).

O cliente não precisa conhecer as diferentes implementações da interface ou da classe. A única coisa que o cliente precisa conhecer é a ***Factory** (Factory Method ou Abstract Factory)* para que possa obter uma instância de uma das implementações da interface. Dessa forma, os clientes são desacoplados da criação de objetos. Esse desacoplamento se dá em função da aplicação do princípio da **inversão de dependência**. Entre as vantagens do desacoplamento tem-se a possibilidade de serem implementadas classes concretas que podem ser alteradas sem afetar o cliente, reduzindo assim o acoplamento entre as classes e aumentando a flexibilidade.

Portanto, o padrão Factory possibilita desacoplar objetos de criação do sistema subjacente através do encapsulamento do código responsável pela criação de objetos. Isso tem como resultado também uma maior simplificação para os desenvolvedores quando é necessária a realização de refatoração no código, pois agora existe um único ponto onde as alterações podem ocorrer.

Frequentemente o Factory é implementado como um ***Singleton** ou uma classe estática*, pois normalmente apenas uma única instância é necessária. Com isso, tem-se uma centralização na criação do objeto Factory, o que permite uma maior organização e manutenibilidade do código-fonte, além da redução dos erros quando alterações ou atualização são realizadas.

### Problemas que o Factory resolve

1. Complexidade na criação de objetos:
- Quando um objeto requer configurações ou inicializações complexas antes de ser usado.
- Exemplo: Criação de objetos que dependem de dados externos, como arquivos de configuração ou parâmetros dinâmicos.
Manutenção de código:

2. Quando você tem várias subclasses e precisa decidir qual instanciar com base em condições dinâmicas.
- Evita o uso de múltiplas instruções `if-else` ou `switch-case` espalhadas pelo código.

3. Desacoplamento:
- Reduz o acoplamento entre o código que usa os objetos e as classes concretas, permitindo mudanças nas implementações sem impactar os consumidores.

4. Polimorfismo e extensibilidade:
- Facilita a introdução de novos tipos de objetos sem modificar o código existente.
- Exemplo: Adicionar uma nova classe derivada sem alterar a lógica do cliente.

5. Reutilização de código:
- Centraliza a lógica de criação em um único lugar, tornando mais fácil reutilizar e testar.

### Exemplo de código

Foram criados os dois modelos / entidades + a interface que os dois partilham no package *vehicle*, fora deste package, há a classe `Transport.java` que é nossa *Factory* e outras duas classes auxiliares à fctory, o `CarTransport.java` e `MotorcycleTransport.java` que são as classes que vão instanciar as entidades a partir da interface, gerando um desacoplamento na classe `Main.java`, pois a `Main.java` não precisa saber exatamente o que está instanciando a partir da interface e da factory.
