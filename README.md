# Repositório de Estudos Java — Sumário por Módulo

Este README lista, por módulo/pasta numerada, os conceitos e tópicos estudados no curso.

## 01 - Introdução a POO
- Conceito de classe e objeto: instância e estado por objeto.
- Atributos e métodos: encapsulamento básico com getters/setters.
- Representação textual de objetos (`toString`) e formatação de saída.
- Membros estáticos e utilitários (métodos/constantes estáticas).
- Noções iniciais de modelagem de domínio simples e organização de código.

## 02 - Construtores e Encapsulamento
- Construtores e sobrecarga de construtores (inicialização de objetos).
- Encapsulamento: campos privados, getters/setters e proteção do estado.
- Boas práticas para `toString` e métodos de utilidade de instância.
- Separação de responsabilidades: isolar lógica de negócio em serviços.
- Uso de enums e tipos auxiliares em regras de negócio (ex.: tipos de cliente).

## 03 - Memória, Arrays e Listas
- Estruturas de dados básicas: arrays de primitivos e arrays de objetos.
- Matrizes (arrays 2D) e iteração aninhada.
- Coleções dinâmicas: `ArrayList` / `List` — adição, remoção, inserção.
- Operações funcionais com streams: `filter`, `collect`, `findFirst`, `removeIf`.
- Diferenças práticas entre arrays (tamanho fixo) e listas (dinâmicas).

## 04 - Tópicos Data/Hora
- API `java.time`: uso de `LocalDate`, `LocalDateTime` e `Instant`.
- Formatação e parsing com `DateTimeFormatter`.
- Noções sobre fuso horário (`ZoneId`) e conversão de instantes para zona local.
- Boas práticas: persistir instantes/UTC e formatar para exibição.

## 05 - Enumerações e Composição
- Uso de `enum` para representar estados/constantes tipadas (ex.: status de pedido).
- Composição (has‑a): modelagem de objetos que agregam outros (Pedido, Item, Produto, Cliente).
- Organização de modelos de domínio: entidades e relacionamentos entre objetos.
- Camada de serviço para gerar resumos/relatórios a partir dos modelos compostos.
- Integração com datas/horários em modelos (ex.: data de nascimento, timestamp de pedido).

## 06 - Herança e Polimorfismo
- Herança: extensão de classes, reutilização de atributos e métodos da superclasse.
- Polimorfismo: variáveis do tipo da superclasse referenciando instâncias de subclasses.
- Sobrescrita de métodos (overriding) e resolução dinâmica de métodos em runtime.
- Upcasting e downcasting; uso seguro de `instanceof` antes do cast.
- Classes/métodos abstratos: definir contratos (`abstract`) para implementação nas subclasses.
- Modificadores de acesso relevantes (`protected`, `private`) e uso de `final` quando aplicável.

---

Se desejar, posso (1) incluir links para cada exemplo dentro das pastas numeradas, (2) gerar um índice navegável com referências a READMEs locais, ou (3) consolidar os conceitos em notas de estudo mais detalhadas para cada pasta. Indique qual opção prefere.
# Fundamentos de Java (Antes de Framework)

Este repositorio e destinado ao estudo dos fundamentos de Java antes do uso de frameworks.

## Objetivo

Consolidar a base da linguagem Java

## Estrutura

O conteudo esta organizado por temas e modulos praticos, com exemplos e exercicios progressivos para fixar os conceitos essenciais.

## Publico-alvo

Estudantes e iniciantes que desejam construir uma base solida em Java antes de avancar para frameworks como Spring.

## Índice: 06 - Herança e Polimorfismo

- [classes_abstratas](06-Herança-e-Polimorfismo/classes_abstratas/README.md)
- [exercicio_abstrato](06-Herança-e-Polimorfismo/exercicio_abstrato/README.md)
- [exercicio_heranca](06-Herança-e-Polimorfismo/exercicio_heranca/README.md)
- [exercicio_heranca2](06-Herança-e-Polimorfismo/exercicio_heranca2/README.md)
- [heranca](06-Herança-e-Polimorfismo/heranca/README.md)
- [metados_abstratos](06-Herança-e-Polimorfismo/metados_abstratos/README.md)
 
