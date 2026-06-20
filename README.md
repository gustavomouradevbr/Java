# 📚 Repositório de Estudos — Java OOP

Repositório de exercícios progressivos cobrindo os fundamentos de **Orientação a Objetos em Java**, organizado em módulos temáticos numerados. Cada módulo introduz novos conceitos sobre os anteriores, partindo de classes e objetos simples até herança, polimorfismo e tratamento de exceções — com foco em boas práticas de design e separação de responsabilidades.

---

## 📋 Índice

- [01 · Introdução à POO](#01--introdução-à-poo)
- [02 · Construtores e Encapsulamento](#02--construtores-e-encapsulamento)
- [03 · Memória, Arrays e Listas](#03--memória-arrays-e-listas)
- [04 · Tópicos de Data e Hora](#04--tópicos-de-data-e-hora)
- [05 · Enumerações e Composição](#05--enumerações-e-composição)
- [06 · Herança e Polimorfismo](#06--herança-e-polimorfismo)
- [07 · Tratamento de Exceções](#07--tratamento-de-exceções)
- [Mapeamento de Enums](#-mapeamento-de-enums)

---

## 01 · Introdução à POO

**Pacote:** `01-introducao-poo/01-fundamentos-poo`

| Arquivo | Conceito-chave |
|---|---|
| `entities/Triangle.java` | **Objeto com estado próprio.** Cada instância guarda seus três lados; a área é calculada pela **Fórmula de Heron** dentro da própria classe. |
| `entities/Product.java` | **Encapsulamento básico.** Atributos privados com getters/setters; métodos de negócio (`addProducts`, `removeProducts`) e `toString` sobrescrito. |
| `entities/Calculator.java` | **Membros estáticos (`static`).** Classe utilitária sem necessidade de instância; agrupa constantes (`PI`) e métodos de cálculo reutilizáveis. |
| `application/Program.java` | Demonstra que dois objetos `Triangle` guardam **estado independente** em memória. |
| `application/Program2.java` | Uso completo do ciclo de vida de `Product`: criação, manipulação de estoque e exibição formatada. |
| `application/Program3.java` | Chamada de **métodos e campos estáticos** via `Calculator.circumference()` e `Calculator.PI`. |

---

## 02 · Construtores e Encapsulamento

**Pacote:** `02-construtores-encapsulamento`

### 02.1 — Construtores e Sobrecarga

| Arquivo | Conceito-chave |
|---|---|
| `entities/Product.java` | **Sobrecarga de construtores:** três versões (vazio, completo, sem quantidade). Quantidade padrão definida no construtor parcial. |
| `entities/Product2.java` | Variante para praticar; reforça que a **sobrecarga** permite criar o objeto mesmo sem todos os dados disponíveis. |

### 02.2 — Lógica de Negócio e Descontos

| Arquivo | Conceito-chave |
|---|---|
| `entities/ClientType.java` | **Enum simples** (`REGULAR` / `PREMIUM`) com método fábrica `fromUserInput` para interpretar texto livre do usuário. |
| `entities/Pedido.java` | **Entidade com validação no setter** (`orderValue ≥ 0`, `loyaltyPoints ≥ 0`). Responsável apenas por guardar estado e validações básicas. |
| `services/OrderDiscountService.java` | **Separação de responsabilidades:** regras de desconto (PREMIUM +5%, ativo +3%, pontos de fidelidade) isoladas em uma camada de serviço, facilitando testes. |

---

## 03 · Memória, Arrays e Listas

**Pacote:** `03-memoria-arrays-listas`

### 03.1 — Arrays, Listas e Matrizes

| Arquivo | Conceito-chave |
|---|---|
| `application/Program.java` | **Array de primitivos** (`double[]`): tamanho fixo, preenchido com `0.0` por padrão; cálculo de média. |
| `application/Program2.java` | **Array de objetos** (`Product[]`): cada posição guarda uma referência; tamanho fixo vs. `ArrayList`. |
| `application/Program_3.java` | **`ArrayList` e Streams:** `add`, `remove`, `removeIf`, `filter`, `findFirst` — operações funcionais sobre listas. |
| `application/Program_4.java` | **Matriz quadrada** (`int[][]`): diagonal principal (`i == j`) e contagem de negativos. |
| `application/Program5.java` | **Matriz arbitrária:** busca de elemento e exibição dos **vizinhos** (esquerda, cima, direita, baixo) com verificação de bordas. |

### 03.2 — Exercícios de Fundamentos

| Arquivo | Conceito-chave |
|---|---|
| `entities_3/Rectangle.java` | Métodos de cálculo (área, perímetro, **diagonal via Pitágoras**) encapsulados na entidade geométrica. |
| `entities_3/Employee.java` | **Salário líquido** = bruto − imposto; `increaseSalary` demonstra modificação de estado via método. |
| `entities_3/Student.java` | Lógica de **status de aprovação** (soma das três notas ≥ 90) encapsulada em `showStatus()`. |
| `entities_3/DollarConverter.java` | **Classe utilitária `final`** com método estático puro; IOF fixo como constante privada. |
| `entities_3/Bank.java` | Conta bancária com `deposit` e `withdrawn` (taxa de R$ 5 embutida); **sobrecarga de construtores**. |
| `entities_3/Rent.java` | Associação de nome e e-mail a um número de quarto; demonstra **array esparso** (índice = número do quarto). |
| `entities_3/Employee_2.java` | Funcionário com ID; busca por `Stream.filter` + `findFirst` para aumento salarial direcionado. |
| `entities_3/Pessoa.java` | Entidade simples para exercícios de **média de altura** e filtragem por faixa etária com arrays. |

---

## 04 · Tópicos de Data e Hora

**Pacote:** `04-topicos-data-hora`

| Arquivo | Conceito-chave |
|---|---|
| `application/ExemploDataHora.java` | Comparativo entre **`LocalDate`** (apenas data, sem fuso) e **`Instant`** (momento absoluto UTC). Demonstra `DateTimeFormatter`, `plusDays` e conversão de `Instant` para `ZonedDateTime`. |

---

## 05 · Enumerações e Composição

**Pacote:** `05-enumeracoes-e-composicao`

### 05.1 — Enums Básico

| Arquivo | Conceito-chave |
|---|---|
| `entitiesenums/OrderStatus.java` | **Enum de ciclo de vida** de um pedido. Define estados sequenciais; uso de `valueOf` para converter `String` → constante. |
| `entities/Order.java` | **Composição com enum:** `Order` tem um `OrderStatus` como campo; `DateTimeFormatter` estático para formatação consistente. |

### 05.1 Extra — Enum com `java.util.Date`

| Arquivo | Conceito-chave |
|---|---|
| `entities/enums2/OrderStatus.java` | Mesmos estados, usando a API legada `java.util.Date`; exercício de comparação com a versão moderna. |

### 05.2 — Worker e Contratos

| Arquivo | Conceito-chave |
|---|---|
| `entities/enums/WorkerLevel.java` | **Enum de nível profissional** (`JUNIOR` / `MID_LEVEL` / `SENIOR`); tipagem forte evita strings mágicas. |
| `entities/Worker.java` | **Composição com lista:** `Worker` possui `Department` e uma `List<HourContract>`; método `income` filtra contratos por mês/ano usando `Calendar`. |
| `entities/Department.java` | Entidade de apoio; demonstra **composição simples** (Worker *tem-um* Department). |
| `entities/HourContract.java` | Contrato por hora com `totalValue = valuePerHour × hours`; data usada para filtro temporal. |

### 05.3 — Post e Comentários

| Arquivo | Conceito-chave |
|---|---|
| `entities/Post.java` | **Agregação de comentários** em `List<Comment>`; `toString` construído com `StringBuilder` para eficiência. |
| `entities/Comment.java` | Entidade mínima que demonstra que nem toda classe precisa de lógica — apenas **dado com identidade**. |

### 05.4 — Restaurante (Pedido Completo)

| Arquivo | Conceito-chave |
|---|---|
| `entities/enums/OrderStatus.java` | Enum de status reutilizado; lido via `valueOf` diretamente da entrada do usuário. |
| `entities/Order.java` | Agregado principal: cliente + itens + status. Lista de itens protegida por `Collections.unmodifiableList`. |
| `entities/OrderItem.java` | **Subtotal encapsulado** (`price × quantity`) na própria classe do item; validações no setter. |
| `entities/Client.java` | Dados pessoais separados do pedido (**composição**); `LocalDate` para data de nascimento. |
| `entities/Product.java` | Produto com validação de preço não-negativo no setter. |
| `services/OrderSummaryService.java` | **Serviço de formatação** desacoplado da entidade; monta o resumo textual do pedido. |

---

## 06 · Herança e Polimorfismo

**Pacote:** `06-Herança-e-Polimorfismo`

### 06.1 — Classes Abstratas (Conta Bancária)

| Arquivo | Conceito-chave |
|---|---|
| `entities/Account.java` | **Classe abstrata base:** `balance` protegido para acesso nas subclasses; `withdraw` com taxa fixa de R$ 5. |
| `entities/SavingsAccount.java` | **Override de `withdraw`** sem a taxa fixa; método exclusivo `updateBalance` aplica juros. |
| `entities/BusinessAccount.java` | **`super.withdraw` + taxa extra** de R$ 2; método `loan` adiciona saldo dentro do limite. |

### 06.2 — Exercício Abstrato (Contribuintes)

| Arquivo | Conceito-chave |
|---|---|
| `entities/TaxPayer.java` | **Classe abstrata com método abstrato `tax()`:** contrato que força cada subclasse a implementar seu cálculo de imposto. |
| `entities/Individual.java` | Imposto de PF: alíquota de 15% ou 25% (renda < 20 mil), deduzindo **50% dos gastos com saúde**. |
| `entities/Company.java` | Imposto de PJ: 14% se > 10 funcionários, senão 16%; demonstra **expressão ternária** como regra de negócio. |

### 06.3 — Exercício de Herança (Funcionários)

| Arquivo | Conceito-chave |
|---|---|
| `entities/Employee.java` | Classe base com `payment = hours × valuePerHour`; passível de especialização. |
| `entities/OutsourcedEmployee.java` | **Override de `payment`:** reaproveita `super.payment()` e soma `additionalCharge × 1.1`. |

### 06.4 — Exercício de Herança 2 (Produtos)

| Arquivo | Conceito-chave |
|---|---|
| `entities/Product.java` | Produto base com método `priceTag()` sobrescrevível. |
| `entities/ImportedProduct.java` | **Override de `priceTag`:** exibe `preço + taxa alfandegária` no total. |
| `entities/UsedProduct.java` | **Override de `priceTag`:** inclui data de fabricação formatada; usa `DateTimeFormatter` estático. |

### 06.5 — Herança (Demonstração de Cast e instanceof)

| Arquivo | Conceito-chave |
|---|---|
| `entities/Account.java` | Versão concreta (não abstrata) para demonstrar **upcasting** e **downcasting** com segurança. |
| `entities/SavingsAccount.java` | Declarada `final` — impede herança adicional; `withdraw` também `final`. |
| `entities/BusinessAccount.java` | Exemplo de cast seguro: `(BusinessAccount) acc2` funciona pois `acc2` foi instanciado como `BusinessAccount`. |

### 06.6 — Métodos Abstratos (Formas Geométricas)

| Arquivo | Conceito-chave |
|---|---|
| `entities/Shape.java` | **Classe abstrata com `abstract double area()`:** define o contrato de área sem implementação. |
| `entities/Circle.java` | Implementa `area()` com `Math.PI × r²`. |
| `entities/Rectangle.java` | Implementa `area()` com `width × height`. |
| `entities/enums/Color.java` | **Enum de cores** (`BLACK` / `BLUE` / `RED`) como atributo da forma; evita strings livres. |

---

## 07 · Tratamento de Exceções

**Pacote:** `07-tratamento-de-execao`

### 07.0 — try-catch Básico

| Arquivo | Conceito-chave |
|---|---|
| `application/App.java` | **Múltiplos `catch`:** `ArrayIndexOutOfBoundsException` e `InputMismatchException` tratados de forma independente. |
| `application/App2.java` | **Bloco `finally`:** garante fechamento do `Scanner` e exibição de "METHOD2 END" independentemente de exceção. |
| `application/App3.java` | **`FileNotFoundException`:** leitura de arquivo com tratamento de ausência e `finally` para fechar recurso. |

### 07.1 — Exemplo Muito Ruim (Anti-padrão)

| Arquivo | Conceito-chave |
|---|---|
| `application/App.java` + `entites/Reservation.java` | **Validação misturada no `Program`:** lógica de negócio (datas futuras, check-out > check-in) espalhada na camada de I/O — difícil de testar e manter. |

### 07.2 — Exemplo Ruim (Semi-padrão)

| Arquivo | Conceito-chave |
|---|---|
| `entites/Reservation.java` | `updateDates` retorna `String` com mensagem de erro ou `null`. **Problema:** acoplamento entre camadas; o chamador precisa checar `null` manualmente. |

### 07.3 — Exemplo Bom ✅ (Padrão Recomendado)

| Arquivo | Conceito-chave |
|---|---|
| `model/exceptions/DomainException.java` | **Exceção de domínio customizada** (`extends RuntimeException`): encapsula erros de negócio sem obrigar `throws` na assinatura. |
| `model/entities/Reservation.java` | Validações no **construtor e em `updateDates`** lançam `DomainException`; a entidade garante seu próprio invariante. |
| `application/App.java` | `try` único captura `ParseException`, `DomainException` e `RuntimeException` — **separação clara** entre erros de formato, negócio e inesperados. |

### 07.4 — Exercício Completo (Conta Bancária com Exceção)

| Arquivo | Conceito-chave |
|---|---|
| `model/exception/BusinessException.java` | **Exceção de negócio** (`extends RuntimeException`) para violações de regra (limite e saldo insuficiente). |
| `model/entites/Account.java` | `withdraw` lança `BusinessException` para `amount > withdrawLimit` ou `amount > balance` — **proteção de invariante na entidade**. |

---

> **Dica de revisão:** leia a coluna *Conceito-chave* de cima para baixo para percorrer a progressão natural dos tópicos — cada módulo adiciona uma camada de complexidade sobre o anterior.