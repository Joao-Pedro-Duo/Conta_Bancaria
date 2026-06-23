# 	  			Projeto Conta Bancária - Java   			![Simbolo bancario Imagens – Download Grátis no Magnific (antes Freepik)](https://img.magnific.com/vetores-premium/icone-do-edificio-do-banco_1301270-12227.jpg?semt=ais_hybrid&w=220&q=70)     

&nbsp;

<br />

&nbsp;

<div align="center">
<img src="https://img.shields.io/github/languages/top/Joao-Pedro-Duo/conta\_bancaria?style=flat-square" />

<img src="https://img.shields.io/github/repo-size/Joao-Pedro-Duo/conta\_bancaria?style=flat-square" />

<img src="https://img.shields.io/github/languages/count/Joao-Pedro-Duo/conta\_bancaria?style=flat-square" />

<img src="https://img.shields.io/github/last-commit/Joao-Pedro-Duo/conta\_bancaria?style=flat-square" />

<img src="https://img.shields.io/github/issues/Joao-Pedro-Duo/conta\_bancaria?style=flat-square" />

<img src="https://img.shields.io/github/issues-pr/Joao-Pedro-Duo/conta\_bancaria?style=flat-square" />

<img src="https://img.shields.io/badge/status-conclu%C3%ADdo-brightgreen" alt="Status: Concluído">

&nbsp;

------

&nbsp;

<br />

&nbsp;

## 1. Descrição

O **Projeto Conta Bancária** é um sistema de gestão projetado para simular e administrar operações financeiras relacionadas a contas bancárias. Oferece funcionalidades como **cadastro**, **consulta**, **atualização** e **remoção** de contas, além de transações como depósitos, saques e transferências.

&nbsp;

O sistema organiza as informações dos clientes — incluindo nome do titular, número da conta, saldo e tipo de conta — garantindo a realização segura das operações. Seu principal objetivo é automatizar e simplificar o gerenciamento de contas bancárias, como Conta Corrente e Conta Poupança, promovendo agilidade e precisão no controle financeiro.

&nbsp;

Este projeto, desenvolvido em **Java**, foca no estudo e aplicação dos conceitos de Programação **Orientada a Objetos (POO)**, incluindo:

&nbsp;

- Classes e Objetos;

- Atributos e Métodos;

- Modificadores de Acesso;

- Herança e Polimorfismo;

- Classes Abstratas;

- Interfaces.&nbsp;


Além de servir como um simulador funcional, o projeto oferece uma base prática para compreender os princípios fundamentais da POO aplicados a um cenário realista.

&nbsp;

<br />

&nbsp;

## 2. Funcionalidades do Projeto

1\. **Criar Conta:** Cria uma nova conta bancária especificando nome do titular, número da agência, saldo inicial e propriedades específicas conforme o tipo da conta. O número da conta é gerado automaticamente.

2\. **Listar todas as Contas:** Lista todas as contas cadastradas no sistema.

3\. **Consultar uma Conta pelo número:** Encontra uma conta pelo número.

4\. **Consultar uma Conta pelo titular:** Encontra uma ou mais contas associadas ao nome do titular.

5\. **Editar Conta:** Permite atualizar os dados de uma conta existente a partir do número da conta.

6\. **Excluir Conta:** Remove uma conta específica com base no número da conta.

7\. **Sacar:** Realiza a retirada de um valor de uma conta, desde que o saldo seja suficiente.

8\. **Depositar:** Adiciona um valor ao saldo de uma conta existente.

9\. **Transferir:** Transfere um valor de uma conta para outra, respeitando os respectivos saldos e limites.

&nbsp;

<br />

&nbsp;

## 3. Diagrama de Classes

Um **Diagrama de Classes** é um modelo visual usado na programação orientada a objetos para representar a estrutura de um sistema. Ele exibe classes, atributos, métodos e os relacionamentos entre elas, como associações, heranças e dependências.

&nbsp;

Esse diagrama ajuda a planejar e entender a arquitetura do sistema, mostrando como os componentes interagem e se conectam. É amplamente utilizado nas fases de design e documentação de projetos.

&nbsp;

Abaixo, você confere o Diagrama de Classes do Projeto Conta Bancária:****

&nbsp;

```mermaid

classDiagram

class Conta {

&nbsp; - numero: int

&nbsp; - agencia: int

&nbsp; - tipo: int

&nbsp; - titular: String

&nbsp; - saldo: float

&nbsp; + getNumero() int

&nbsp; + getAgencia() int

&nbsp; + getTipo() int

&nbsp; + getTitular() String

&nbsp; + getSaldo() float

&nbsp; + setNumero(numero: int) void

&nbsp; + setAgencia(agencia: int) void

&nbsp; + setTipo(tipo: int) void

&nbsp; + setTitular(titular: String) void

&nbsp; + setSaldo(saldo: float) void

&nbsp; + sacar(valor: float) boolean

&nbsp; + depositar(valor: float) void

&nbsp; + visualizar() void

}

class ContaCorrente {

&nbsp; - limite: float

&nbsp; + getLimite() float

&nbsp; + setLimite(limite: float) void

&nbsp; + sacar(valor: float) boolean

&nbsp; + visualizar() void

}

class ContaPoupanca {

&nbsp; - aniversario: int

&nbsp; + getAniversario() int

&nbsp; + setAniversario(aniversario: int) void

&nbsp; + visualizar() void

}

ContaCorrente --> Conta

ContaPoupanca --> Conta

```

&nbsp;

<br />

&nbsp;

## 4. Tela Inicial do Sistema - Menu

<div align="center">
<img src="https://i.imgur.com/MFK9yXB.png" title="source: imgur.com" width="90%"/>

&nbsp;

<br />

&nbsp;

## 5. Requisitos

Para executar os códigos localmente, você precisará de:&nbsp;

\- \[Java JDK 21+](https://www.oracle.com/java/technologies/downloads/#java21)

\- \[Eclipse](https://eclipseide.org/) ou \[Eclipse STS](https://spring.io/tools)

&nbsp;

<br />

&nbsp;

## 6. Como Executar o projeto no Eclipse/STS&nbsp;



### 6.1. Importando o Projeto

&nbsp;

1\. Clone o repositório do Projeto \[Conta Bancária](https://github.com/Joao-Pedro-Duo/Conta_Bancaria) dentro da pasta do *Workspace* do Eclipse/STS

&nbsp;

```bash

git clone https://https://github.com/Joao-Pedro-Duo/Conta_Bancaria.git

```

&nbsp;

2\. **Abra o Eclipse/STS** e selecione a pasta do *Workspace* onde você clonou o repositório do projeto

3\. No menu superior do Eclipse/STS, clique na opção: **File 🡲 Import...**

4\. Na janela **Import**, selecione a opção: **General 🡲 Existing Projects into Workspace** e clique no botão **Next**

5\. Na janela **Import Projects**, no item **Select root directory**, clique no botão **Browse...** e selecione a pasta do Workspace onde você clonou o repositório do projeto

6\. O Eclipse/STS reconhecerá automaticamente o projeto

7\. Marque o Projeto Conta Bancária no item **Projects** e clique no botão **Finish** para concluir a importação&nbsp;



### 6.2. Executando o projeto&nbsp;

1\. Na guia **Package Explorer**, localize o Projeto Conta Bancária

2\. Abra a **Classe Menu**

3\. Clique no botão **Run** <img src="https://i.imgur.com/MtBQjUp.png" title="source: imgur.com" width="3%"/> para executar a aplicação

4\. Caso seja perguntado qual é o tipo do projeto, selecione a opção **Java Application**

5\. O console exibirá o menu do Projeto.

&nbsp;

<br />

&nbsp;

## 7. Contribuição&nbsp;

Este repositório é parte de um projeto educacional, mas contribuições são sempre bem-vindas! Caso tenha sugestões, correções ou melhorias, fique à vontade para:&nbsp;

\- Criar uma **issue**

\- Enviar um **pull request**

\- Compartilhar com colegas que estejam aprendendo Java!

&nbsp;




## 8. Contato&nbsp;&nbsp;

Desenvolvido por \[João Pedro](https://github.com/Joao-Pedro-Duo)

Para dúvidas, sugestões ou colaborações, entre em contato via GitHub ou abra uma issue!

