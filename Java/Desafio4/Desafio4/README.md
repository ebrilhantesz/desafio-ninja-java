# 🥷 Sistema de Gerenciamento de Ninjas em Java

Projeto desenvolvido em Java com foco em Programação Orientada a Objetos (POO), utilizando conceitos fundamentais e intermediários da linguagem como interfaces, herança, polimorfismo, classes abstratas e enums.

---

# 📚 Conceitos aplicados

Este projeto foi criado com o objetivo de praticar conceitos importantes utilizados no desenvolvimento backend com Java:

* Interfaces
* Classes abstratas
* Herança
* Polimorfismo
* Enum
* Construtores
* Sobrescrita de métodos (`@Override`)
* Organização de classes
* Encapsulamento conceitual
* Reutilização de código

---

# 🏗️ Estrutura do projeto

O sistema possui uma arquitetura baseada em:

```text
Interface Ninja
        ↑
Classe abstrata NinjaBase
        ↑
 ┌──────────────┐
 │              │
NinjaBasico   NinjaAvancado
```

---

# ⚔️ Funcionalidades

## ✅ Ninja Básico

* Exibe informações do ninja
* Executa habilidades
* Utiliza tipos de habilidades com Enum

## ✅ Ninja Avançado

Além das funcionalidades do ninja básico:

* Possui especialidade adicional
* Sobrescreve métodos
* Utiliza reutilização de código com `super`

---

# 🔥 Enum de habilidades

O projeto utiliza um enum chamado `TipoHabilidade` para representar habilidades fixas dos ninjas.

## Tipos disponíveis:

* TAIJUTSU
* NINJUTSU
* GENJUTSU
* KATON
* RINNENGAN

---

# 🧠 Conceitos de POO utilizados

## Interface

A interface `Ninja` define os comportamentos obrigatórios:

```java
mostrarInformacoes();
executarHabilidade();
```

---

## Classe Abstrata

A classe `NinjaBase` centraliza atributos e comportamentos compartilhados:

* nome
* idade
* habilidade

Evita repetição de código e melhora a organização do projeto.

---

## Polimorfismo

As classes implementam os mesmos métodos com comportamentos diferentes.

Exemplo:

```java
executarHabilidade();
```

Cada tipo de ninja executa sua habilidade de maneira personalizada.

---

# 🚀 Tecnologias utilizadas

* Java
* IntelliJ IDEA
* Git
* GitHub

---

# ▶️ Como executar o projeto

1. Clone o repositório
2. Abra no IntelliJ IDEA
3. Execute a classe `Main.java`

---

# 📁 Estrutura de arquivos

```text
src/
│
└── DesafioInterface/
    │
    ├── Main.java
    ├── Ninja.java
    ├── NinjaBase.java
    ├── NinjaBasico.java
    ├── NinjaAvancado.java
    └── TipoHabilidade.java
```

---

# 🎯 Objetivo do projeto

O objetivo principal deste projeto foi praticar conceitos fundamentais de Programação Orientada a Objetos em Java, simulando diferentes tipos de ninjas e suas habilidades através de uma arquitetura mais próxima de aplicações reais.

---

# 👨‍💻 Autor

Desenvolvido por Eduardo Brilhante.
