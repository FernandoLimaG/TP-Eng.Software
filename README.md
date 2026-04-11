# Trabalho Prático - Engenharia de Software

**Nome:** Fernando de Lima Gonçalves <br>
**Curso:** Engenharia de Computação <br>
**Matrícula:** 905004 <br>
**Instituição:** Pontifícia Universidade Católica de Minas Gerais <br>

# Gestor de Estoque de Alimentos Perecíveis

## 1. Objetivo do Trabalho
Desenvolver uma aplicação web para auxiliar usuários comuns e pequenas organizações no gerenciamento de estoques de alimentos, visando reduzir o desperdício doméstico e consumo consciente.

## 2. Definição do Problema
O desperdício de alimentos em nível domiciliar é frequentemente causado pela má gestão sobre os alimentos estocados e suas respectivas datas de validade.

## 3. Tipo de Solução
A solução será uma **Aplicação Web Fullstack**. 
* **Backend:** Java com o framework Spring Boot.
* **Frontend:** HTML5, CSS3 e JavaScript, utilizando o motor de templates Thymeleaf.

## 4. Requisitos

### Requisitos Funcionais (RF)
* **RF01:** O sistema deve permitir o cadastro de alimentos (Nome, Categoria, Data de Validade e Quantidade).
* **RF02:** O sistema deve listar todos os alimentos cadastrados em um painel central.
* **RF03:** O sistema deve destacar visualmente (alertas) os alimentos que vencem em menos de 3 dias.
* **RF04:** O sistema deve permitir a exclusão ou atualização de itens (consumo ou descarte).

### Requisitos Não Funcionais (RNF)
* **RNF01:** O sistema deve ser desenvolvido em Java.
* **RNF02:** A interface deve ser responsiva para uso em navegadores de smartphones e desktops.
* **RNF03:** Persistência de dados em banco de dados H2.

## 5. Casos de Uso
* **Ator Principal:** Usuário Comum.
* **Fluxo 01:** Cadastrar Alimento na Dispensa (O usuário insere os dados via formulário).
* **Fluxo 02:** Visualizar Alertas de Validade (O sistema filtra itens próximos ao vencimento).
* **Fluxo 03:** Atualizar Quantidade/Status (O usuário edita o item após o consumo ou outro motivo).
* **Fluxo 04:** Consultar Lista de Compras (Baseado nos itens que foram removidos ou estão acabando).

## 6. Gestão do Projeto
O acompanhamento das tarefas e o backlog do desenvolvimento podem ser visualizados no link abaixo:
* [Link para o GitHub Project](https://github.com/users/FernandoLimaG/projects/4)
