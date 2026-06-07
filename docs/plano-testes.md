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

---

# Resultados da Execução dos Testes - TP5

## TC01 - Cadastro de Produto Válido

**Objetivo:** Verificar se o sistema permite cadastrar um produto com dados válidos.

**Dados Utilizados:**

* Nome: Leite Integral
* Quantidade: 10
* Validade: data futura

**Resultado Esperado:**
Produto cadastrado com sucesso e exibido na listagem.

**Resultado Obtido:**
O produto foi cadastrado corretamente e exibido na tabela de produtos.

**Status:** PASS

## TC02 - Cadastro com Quantidade Inválida

**Objetivo:** Verificar a validação de quantidade.

**Dados Utilizados:**

* Nome: Arroz
* Quantidade: 0
* Validade: data futura

**Resultado Esperado:**
O sistema deve impedir o cadastro e exibir mensagem de erro.

**Resultado Obtido:**
O cadastro foi bloqueado e a mensagem de erro foi exibida corretamente.

**Status:** PASS

## TC03 - Edição de Produto

**Objetivo:** Verificar a atualização dos dados de um produto existente.

**Dados Utilizados:**

* Alteração da quantidade de um produto previamente cadastrado.

**Resultado Esperado:**
As alterações devem ser salvas e refletidas na listagem.

**Resultado Obtido:**
A atualização foi realizada corretamente e os novos dados foram exibidos na tabela.

**Status:** PASS

## TC04 - Exclusão de Produto

**Objetivo:** Verificar a remoção de produtos cadastrados.

**Dados Utilizados:**

* Produto previamente cadastrado.

**Resultado Esperado:**
O produto deve ser removido da listagem.

**Resultado Obtido:**
O produto foi removido com sucesso.

**Status:** PASS

## TC05 - Alerta de Vencimento

**Objetivo:** Verificar a identificação de produtos próximos ao vencimento.

**Dados Utilizados:**

* Produto com validade inferior a 7 dias.

**Resultado Esperado:**
O sistema deve exibir alerta indicando vencimento próximo.

**Resultado Obtido:**
O alerta foi exibido corretamente com a quantidade de dias restantes.

**Status:** PASS