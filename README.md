# 📘 Programação Orientada à Objetos II - Atividade 02

Este repositório contém a implementação da **Atividade 02** da disciplina de **POO II (Java)**.  
O foco da atividade é praticar **Generics** em Java, criando classes, métodos e interfaces genéricas.

---

## 📂 Estrutura da Atividade

1. **Classe Caixa Genérica 📦**
   - Permite guardar e recuperar um objeto de qualquer tipo.
   - Exemplo de uso no programa principal:
     - `Caixa<String>` para guardar uma palavra.
     - `Caixa<Integer>` para guardar um número.

2. **Classe Par Genérico 🔑➡📘**
   - Armazena uma chave e um valor (genéricos).
   - Inclui construtor, getters e setters.

3. **Método Genérico para Troca 🔄**
   - Recebe um array de elementos e dois índices.
   - Troca os elementos de posição.

4. **Método Genérico com Comparação ⚖**
   - Retorna o maior de dois elementos.
   - Usa `T extends Comparable<T>` para permitir comparação.
   - Testado com `Integer` e `String`.

5. **Interface Genérica e Implementações 💾**
   - Interface `Repositorio<T>` com método `salvar(T obj)`.
   - Implementações:
     - `RepositorioDeAlunos` (para nomes de alunos).
     - `RepositorioDeProdutos` (para objetos da classe `Produto` com nome e preço).

---

## 🚀 Como executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/epmorales/POO-II-Projetos-Lista-02.git
