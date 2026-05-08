# Arquitetura do Sistema

## 1. Visão Geral

O sistema consiste em uma aplicação web desenvolvida para execução das funcionalidades propostas no trabalho prático, utilizando arquitetura cliente-servidor.

O usuário acessa a aplicação pelo navegador, enquanto o backend realiza o processamento das requisições e gerenciamento dos dados.

---

## 2. Tecnologias Utilizadas

- **Java**: linguagem principal da aplicação.
- **Spring Boot**: utilizado no desenvolvimento do backend e gerenciamento da aplicação web.
- **HTML, CSS e JavaScript**: utilizados na interface do sistema.
- **Thymeleaf**: integração entre frontend e backend com renderização dinâmica das páginas.
- **H2 Database**: banco de dados utilizado para persistência dos dados.

---

## 3. Arquitetura do Sistema

A aplicação segue uma arquitetura web simples baseada no modelo cliente-servidor:

- Navegador Web (Frontend)
- Aplicação Spring Boot (Backend)
- Banco de Dados H2

### Diagrama de Contexto

![Diagrama de Contexto](/docs/c4-contexto.png)

### Diagrama de Conteiners

![Diagrama de Contexto](/docs/c4-conteiner.png)

---

## 4. Modelo Arquitetural

O sistema utiliza o padrão MVC (Model-View-Controller):

- **Model**: representação e persistência dos dados.
- **View**: interface do usuário.
- **Controller**: tratamento das requisições e comunicação entre frontend e backend.

---

## 5. Justificativa das Escolhas

As tecnologias escolhidas atendem adequadamente ao escopo do projeto, permitindo desenvolvimento mais simples, organização do código e facilidade de manutenção.

O uso do Spring Boot e do padrão MVC contribui para melhor separação de responsabilidades, enquanto o H2 simplifica a configuração do ambiente durante o desenvolvimento.