# Sistema de Cadastro de Clientes

Este é um projeto simples de cadastro de clientes utilizando a biblioteca Swing em Java. O objetivo principal é praticar a criação de interfaces gráficas e o tratamento de exceções.

## Funcionalidades

- Cadastro de clientes com os seguintes campos:
  - Nome
  - Idade
  - E-mail
- Validações de entrada:
  - O campo "Nome" não pode estar vazio.
  - O campo "Idade" deve conter apenas números inteiros.
  - O campo "E-mail" deve conter o caractere `@`.
- Exibição de mensagens de sucesso ou erro usando `JOptionPane`.

## Estrutura do Projeto

O projeto está dividido em quatro pacotes:

### `br.edu.fatecpg.view`
- **TelaCadastro**: Classe principal que exibe a interface gráfica e gerencia as ações do usuário.
- **Main.java**: Chama o JFrame para execução.

### `br.edu.fatecpg.model`
- **CadastroCliente**: Classe que representa os dados do cliente (nome, idade e e-mail).

  ### `br.edu.fatecpg.serivces`
- **ValidandoExececoes**: Onde ficam as super de erros para serem exibidas ao chamar os métodos.

    ### `br.edu.fatecpg.exception`
- **ExcecaoEmail**: Exceção Personalizada para quando o email não conter o caractere `@`.
- **ExcecaoNome**: Exceção Personalizada para quando o campo de nome estiver vazio.
- **ExcecaoIdade**: Exceção Personalizada para quando a idade não for um número inteiro.

## Tecnologias Utilizadas

- **Java**
- **Swing** 

## Desenvolvido Por:

`Larissa Cristina` e `Arthur Lopes` da Fatec Praia Grande


