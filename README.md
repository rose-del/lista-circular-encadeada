# Lista Circular Simplesmente Encadeada

Lista Circular Encadeada em Java, permitindo inserir, remover e acessar elementos em diferentes posições da lista.
Uma lista circular encadeada é uma estrutura de dados linear onde o último nó aponta novamente para o primeiro, formando um ciclo. 🔄

## Conceito Utilizado

A Lista Circular Encadeada é uma variação da lista simplesmente encadeada (https://github.com/rose-del/lista-encadeada-java), onde:

* Cada elemento (**Nodo**) aponta para o próximo.
* O último nodo aponta para o primeiro.
* Não existe valor `null` ao final da lista.
* A lista forma um ciclo contínuo.

Exemplo visual:

```
10 -> 20 -> 30 -> 40
 ^                 |
 |_________________|
```

## Estrutura

É composto por três classes principais:

### - Nodo.java

Representa cada elemento da lista.

Responsabilidades:

* Armazenar o valor do nodo
* Manter referência para o próximo nodo

### - ListaCircularEncadeada.java

Classe responsável por toda a lógica da lista circular.

Funcionalidades implementadas:

| Método                         | Descrição                                 |
| ------------------------------ | ----------------------------------------- |
| `size()`                       | Retorna o tamanho da lista                |
| `addElemento(int elemento)`    | Adiciona elemento ao final da lista       |
| `get(int index)`               | Retorna o nodo em um índice específico    |
| `add(int index, int elemento)` | Insere elemento em uma posição específica |
| `remove(int index)`            | Remove elemento de uma posição            |
| `exibir()`                     | Mostra todos os elementos da lista        |


### - Main.java

Classe responsável por executar testes e demonstrar o funcionamento da lista.

Operações testadas:

* Inserção no final
* Inserção no início
* Inserção em posição específica
* Remoção de elementos
* Verificação da circularidade

## Como Executar o Projeto

### 1. Clone o repositório

```bash
git clone https://github.com/rose-del/lista-circular-encadeada.git
```

### 2. Compile os arquivos

```bash
javac Main.java
```

### 3. Execute o programa

```bash
java Main
```

## Exemplo de Saída

```
=== Inserindo no final ===
10 -> 20 -> 30 -> (volta para 10)
Tamanho: 3

=== Inserindo 5 no início (índice 0) ===
5 -> 10 -> 20 -> 30 -> (volta para 5)
Tamanho após adds: 4

=== Inserindo 15 no início (índice 2) ===
5 -> 10 -> 15 -> 20 -> 30 -> (volta para 5)
Tamanho após adds: 5

=== Removendo índice 0 — testa circularidade ===
10 -> 15 -> 20 -> 30 -> (volta para 10)

Tamanho após removes: 4
```

## Detalhes Importantes

* A lista mantém a **circularidade** após inserções e remoções.
* O método `exibir()` mostra explicitamente o retorno ao primeiro elemento.
* O tamanho da lista é atualizado dinamicamente.
