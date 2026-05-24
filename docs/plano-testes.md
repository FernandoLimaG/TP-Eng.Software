# Plano de Testes

## Objetivo

Este documento descreve os casos de teste previstos para aplicação "Gstor de Estoque de Alimentos Perecíveis"

---

# Caso de Uso: Cadastrar Produto

## Teste 1 — Cadastro válido

### Entrada
- Nome: Leite
- Validade: data futura
- Quantidade: 5

### Resultado Esperado
O produto deve ser salvo e exibido na lista.

---

## Teste 2 — Cadastro com validade vencida

### Entrada
- Nome: Iogurte
- Validade: data passada
- Quantidade: 2

### Resultado Esperado
O produto não deve ser salvo.

---

## Teste 3 — Cadastro sem nome

### Entrada
- Nome vazio
- Validade: data futura
- Quantidade: 3

### Resultado Esperado
O navegador deve impedir o envio do formulário.

---

# Caso de Uso: Listar Produtos

## Teste 1 — Lista com produtos

### Entrada
Produtos cadastrados no banco.

### Resultado Esperado
Os produtos devem aparecer na tabela.

---

## Teste 2 — Lista vazia

### Entrada
Nenhum produto cadastrado.

### Resultado Esperado
A tabela deve aparecer vazia.

---

## Teste 3 — Exibição correta

### Entrada
Produto cadastrado com nome, validade e quantidade.

### Resultado Esperado
Os dados devem ser exibidos corretamente na tabela.

---

# Caso de Uso: Excluir Produto

## Teste 1 — Exclusão válida

### Entrada
Clique no botão excluir de um produto existente.

### Resultado Esperado
O produto deve ser removido da lista.

---

## Teste 2 — Exclusão do último produto

### Entrada
Excluir o único produto existente.

### Resultado Esperado
A lista deve ficar vazia.

---

## Teste 3 — Exclusão múltipla

### Entrada
Excluir vários produtos sequencialmente.

### Resultado Esperado
Todos os produtos devem ser removidos corretamente.