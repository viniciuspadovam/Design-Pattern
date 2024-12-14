# [D] - Dependency Inversion Principle Princípio da Inversão de Dependência

> “Módulos de alto nível não devem depender de módulos de baixo nível.   
> Ambos devem depender de abstrações; Abstrações não devem depender de detalhes.”

Ao *programador ou desenvolver o software*, é comum implementá-lo de forma que cada módulo ou método se refira especificamente aos seus colaboradores, que fazem o mesmo. 

Entretanto, esse **tipo de programação** normalmente não possui camadas suficientes de abstração, o que resulta em um sistema fortemente acoplado, já que cada módulo faz referência direta aos módulos de nível inferior. 

Nesse sentido, é preciso utilizar um **padrão de design** conhecido como **“padrão de inversão de dependência”**, resolvido pelo uso de injeção de dependência.

Seguindo o exemplo da maneira errada de implementação, a classe de SQL é chamada diretamente na classe `Payment.java`, o que acarreta em uma alteração desnecessária no caso da classe de SQL ter que ser alterado para uma classe de MongoDB.

Já no exemplo correto, usando o padrão *Factory*, implementando direcionado à interfaces, mesmo com a alteração das classes, não se faz necessária uma alteração real na classe `Payment.java`. 
