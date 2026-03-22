# Lista 6 - Parte 1: TAD Lista Sequencial 📋

Repositório destinado à implementação da **Atividade 6 (Parte 1): TAD Lista Sequencial** da disciplina de **Estrutura de Dados I**, do curso de **Tecnologia em Análise e Desenvolvimento de Sistemas** no **IFTM Campus Patrocínio**.

---

## 🚀 Sobre o Projeto

Este projeto implementa um **Tipo Abstrato de Dado (TAD) de Lista Sequencial** em Java utilizando arrays como estrutura base. O foco está na manipulação manual de índices e na lógica de deslocamento de elementos (*shift*), simulando o comportamento de uma lista dinâmica sem o uso das bibliotecas padrão do Java.

---

## 🛠️ Tecnologias e Ferramentas

| Item | Detalhe |
|:---|:---|
| **Linguagem** | Java |
| **IDE recomendada** | IntelliJ IDEA |
| **Instituição** | Instituto Federal do Triângulo Mineiro (IFTM) |
| **Campus** | Patrocínio - MG |
| **Docente** | Júnio Moreira |

---

## 📦 Estrutura da Classe `MyArrayList`

A classe `MyArrayList` encapsula todas as operações da lista sequencial. Como o array é recebido por parâmetro em cada método, a estrutura é stateless — ideal para entender os algoritmos de manipulação de índices de forma isolada.

### ➕ Inserção

| Método | Descrição | Complexidade |
|:---|:---|:---|
| `addFirst(int item, int[] list)` | Insere um elemento no início da lista, deslocando todos os outros para a direita | O(n) |
| `addLast(int item, int[] list)` | Insere um elemento no final da lista | O(n) |
| `insertAt(int elementosPreenchidos, int position, int value, int[] list)` | Insere um elemento em uma posição específica com *shift* para a direita | O(n) |

### ➖ Remoção

| Método | Descrição | Complexidade |
|:---|:---|:---|
| `deleteItem(int item, int[] list)` | Remove a primeira ocorrência de um valor, deslocando os elementos para a esquerda | O(n) |
| `removeFirst(int[] list)` | Remove o primeiro elemento da lista | O(n) |
| `removeLast(int[] list)` | Remove o último elemento da lista | O(1)* |
| `removeAt(int[] list, int position)` | Remove o elemento em uma posição específica | O(n) |

> \* `removeLast` delega para `deleteItem`, sendo O(n) na prática.

### 🔍 Busca

| Método | Descrição |
|:---|:---|
| `find(int[] list, int position)` | Retorna o valor na posição indicada |
| `get(int[] list, int position)` | Retorna o valor na posição indicada |

### ✏️ Atualização

| Método | Descrição |
|:---|:---|
| `set(int item, int position, int[] list)` | Atualiza o valor em uma posição específica, retornando um novo array |

---

## 🧠 Conceitos Aplicados

- **Shift direito:** utilizado nas inserções para abrir espaço em uma posição sem perder elementos
- **Shift esquerdo:** utilizado nas remoções para fechar o espaço deixado pelo elemento removido
- **Expansão dinâmica:** ao inserir, um novo array com `length + 1` é criado e os dados são copiados
- **Contração dinâmica:** ao remover, um novo array com `length - 1` é criado, descartando o elemento removido
- **Dois ponteiros:** usado no `deleteItem` com índices `i` (original) e `j` (novo array) independentes

---

## 💻 Como Rodar o Projeto

1. Clone o repositório:
```bash
git clone https://github.com/moreiraptc/Lista6-Parte1-Estrutura-de-Dados.git
```

2. Abra o projeto no **IntelliJ IDEA**

3. Execute a classe `Main.java`

4. Interaja com o menu no console escolhendo a operação desejada

---


## 👨‍💻 Autor

Feito por **[moreiraptc](https://github.com/moreiraptc)** como parte das atividades da disciplina de Estrutura de Dados I — IFTM Campus Patrocínio.
