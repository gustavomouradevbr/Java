# Java — Repositório de Estudos

Índice de conhecimentos organizados por módulo, cobrindo os fundamentos e paradigmas da linguagem Java com orientação a objetos.

---

## 01 — Introdução à POO

- **Paradigma Orientado a Objetos:** distinção entre programação procedural e orientada a objetos; o papel das classes como molde e dos objetos como instâncias em memória
- **Classes e Objetos:** definição de atributos (estado) e métodos (comportamento) dentro de uma classe; ciclo de vida de um objeto com `new`
- **Encapsulamento básico:** modificadores de acesso `private` e `public`; exposição controlada do estado interno via métodos de acesso (*getters* e *setters*)
- **Membros de instância vs. membros estáticos:** diferença entre atributos e métodos que pertencem ao objeto e aqueles que pertencem à classe (`static`); constantes estáticas com `static final`
- **Método `toString`:** sobrescrita para representação textual de objetos; integração com concatenação de strings e `System.out`
- **Referências e valor nulo:** variáveis de tipo referência e o conceito de `null`; separação entre a variável e o objeto que ela aponta na memória heap
- **Pacotes e organização de código:** convenção de nomenclatura de pacotes; separação entre camadas `application` e `entities`

---

## 02 — Construtores e Encapsulamento

- **Construtores:** propósito de garantir que um objeto nasce em estado válido; construtor padrão (sem argumentos) e construtores parametrizados
- **Sobrecarga de construtores (*Overloading*):** definição de múltiplos construtores com assinaturas distintas; uso da palavra-chave `this` para redirecionar chamadas entre construtores
- **Encapsulamento avançado:** proteção de invariantes de negócio nos *setters* com validação; atributos sem *setter* público para garantir imutabilidade parcial
- **Separação de responsabilidades:** isolamento da lógica de regra de negócio em uma camada de serviço (`services`), mantendo as entidades focadas em estado e validação básica
- **Enumerações (`enum`):** representação de conjuntos fechados de constantes com tipo seguro; parsing de entrada do usuário para um valor de enum
- **Lógica de desconto e cálculo financeiro:** aplicação de regras condicionais sobre porcentagens; limite máximo de desconto; separação entre cálculo de percentual e cálculo de valor final

---

## 03 — Memória, Arrays e Listas

- **Memória stack vs. heap:** como variáveis primitivas e referências são alocadas na stack; como objetos são alocados na heap; o que acontece com a memória ao sair de um escopo
- **Arrays de primitivos:** declaração, alocação e acesso por índice; valor padrão de inicialização; propriedade `length`
- **Arrays de objetos:** diferença entre alocar o array (referências nulas) e instanciar cada objeto; acesso a membros via índice
- **Matrizes bidimensionais (`int[][]`):** representação de grades e tabelas; iteração com loops aninhados; acesso a vizinhos com verificação de bordas
- **`ArrayList` e a interface `List`:** dinamismo do tamanho em contraste com arrays fixos; operações `add`, `remove`, `indexOf`, `removeIf`
- **API de Streams (`java.util.stream`):** pipeline funcional com `filter`, `findFirst`, `collect`; uso de expressões lambda; `Collectors.toList()`
- **Varredura e limpeza de buffer:** uso de `Scanner`; problema do buffer residual após `nextInt()` / `nextDouble()` e uso de `nextLine()` para limpá-lo

---

## 04 — Tópicos de Data e Hora

- **`LocalDate`:** representação de datas sem horário e sem fuso horário; aritmética de datas com `plusDays`, `minusMonths` e similares
- **`LocalDateTime`:** combinação de data e hora sem informação de fuso; adequado para registros de eventos locais
- **`Instant`:** ponto absoluto e universal na linha do tempo (baseado em UTC); uso ideal para logs, timestamps de banco de dados e auditoria
- **Formatação com `DateTimeFormatter`:** definição de padrões de formato (`dd/MM/yyyy HH:mm:ss`); conversão entre objeto de data e `String` nos dois sentidos
- **Fusos horários com `ZoneId`:** conversão de `Instant` para `ZonedDateTime` no momento de exibição; boas práticas de persistir em UTC e formatar para o usuário na camada de saída
- **`java.util.Date` (legado):** distinção em relação à API moderna de `java.time`; uso de `SimpleDateFormat` e os cuidados com *thread-safety*

---

## 05 — Enumerações e Composição

- **Enumerações (`enum`) avançadas:** enums como tipos de primeira classe em Java; métodos `valueOf` e `name`; uso em estruturas condicionais e como campos de entidade
- **Composição de objetos:** modelagem do relacionamento "tem-um" (*has-a*); uma classe contém referências a instâncias de outras classes como atributos
- **Agregação vs. composição:** distinção entre objetos que gerenciam o ciclo de vida dos objetos que contêm e aqueles que apenas os referenciam
- **Listas como atributos:** uso de `List` como campo de uma entidade; métodos auxiliares `addItem` / `removeItem` para encapsular o acesso à lista interna
- **`StringBuilder`:** construção eficiente de strings complexas em `toString`; encadeamento de `append`
- **Camada de serviço (`services`):** extração de lógica de formatação e apresentação para fora das entidades; princípio da responsabilidade única
- **Modelagem de domínio:** composição de múltiplas entidades (`Client`, `Order`, `OrderItem`, `Product`) para representar um fluxo de negócio completo

---

## 06 — Herança e Polimorfismo

- **Herança (`extends`):** mecanismo de reutilização e especialização; a subclasse herda atributos e métodos da superclasse; uso de `super` para acessar construtores e métodos do pai
- **Polimorfismo:** capacidade de uma variável do tipo da superclasse referenciar objetos de subclasses distintas em tempo de execução; dispatch dinâmico de métodos
- **Sobrescrita de métodos (`@Override`):** redefinição de comportamento herdado na subclasse; importância da anotação para verificação em tempo de compilação
- **Classes abstratas (`abstract class`):** classes que não podem ser instanciadas diretamente; definição de um contrato parcial para subclasses; mistura de implementação concreta e métodos abstratos
- **Métodos abstratos (`abstract`):** declaração de comportamento sem implementação; obrigatoriedade de implementação em qualquer subclasse concreta
- **Modificador `protected`:** visibilidade intermediária entre `private` e `public`; atributos acessíveis diretamente pelas subclasses dentro do mesmo pacote ou por herança
- **Modificador `final`:** aplicado a classes para impedir herança; aplicado a métodos para impedir sobrescrita; semântica de imutabilidade estrutural
- **Casting e `instanceof`:** operação de *downcast* para acessar membros específicos de uma subclasse; verificação segura de tipo em tempo de execução com `instanceof` para evitar `ClassCastException`
- **Coleções polimórficas:** uso de `List<SuperClasse>` para armazenar instâncias de subclasses diferentes; iteração uniforme com acesso ao comportamento especializado de cada elemento
