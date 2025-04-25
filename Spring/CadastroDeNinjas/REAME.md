# 🥷 Cadastro de Ninjas - Spring Boot

![Ninja Coding](https://media0.giphy.com/media/v1.Y2lkPTc5MGI3NjExYmtyZDF4NDFydnl1MjZrcnpmZ2h3MTFveHIyanlhNWhmZ255dWtvaCZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/12775LeUHMZjNu/giphy.gif)

Bem-vindo ao **Cadastro de Ninjas**, um projeto desenvolvido com **Spring Boot** como parte do curso dos estudos. Este módulo, localizado no repositório [Dio_Java](https://github.com/MatheusxEduardo/Dio_Java), implementa uma API REST para gerenciar cadastros de ninjas, incluindo informações como nome, clã e habilidades.

---

## 📑 Índice

- [Sobre o Projeto](#sobre-o-projeto)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Pré-requisitos](#pré-requisitos)
- [Como Configurar e Executar](#como-configurar-e-executar)
  - [Clonar o Repositório](#clonar-o-repositório)
  - [Configurar o Java (WSL2)](#configurar-o-java-wsl2)
  - [Configurar o IntelliJ](#configurar-o-intellij)
  - [Compilar e Executar](#compilar-e-executar)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Funcionalidades](#funcionalidades)
- [Funcionalidades Futuras](#funcionalidades-futuras)
- [Reportar Problemas](#reportar-problemas)
- [Contribuindo](#contribuindo)
- [Notas para WSL2](#notas-para-wsl2)
- [Recursos Úteis](#recursos-úteis)
- [Agradecimentos](#agradecimentos)

---

## 📖 Sobre o Projeto

O **Cadastro de Ninjas** é um projeto educacional que demonstra o uso do **Spring Boot** para criar uma API RESTful. Ele faz parte do repositório `Dio_Java`, que contém vários exercícios e projetos Java. O objetivo é aprender e aplicar conceitos como:

- Desenvolvimento de APIs REST.
- Mapeamento objeto-relacional com **Spring Data JPA**.
- Gerenciamento de dependências com **Maven**.
- Configuração de ambientes multiplataforma (Linux via WSL2 e Windows).

---

## 🛠️ Tecnologias Utilizadas

- **Java**: JDK 17 (Temurin, gerenciado via `asdf`).
- **Spring Boot**: Framework para construção da API.
- **Spring Data JPA**: Persistência de dados.
- **Maven**: Gerenciamento de dependências (usando Maven Wrapper).
- **Git**: Controle de versão com GitHub.
- **H2 Database** (planejado): Banco em memória para testes.

---

## ✅ Pré-requisitos

Antes de começar, você precisa ter:

- **Java 17** instalado (recomendado: `temurin-17.0.12+7`).
- **Maven** ou o `./mvnw` incluído no projeto.
- **Git** para clonar o repositório.
- **IntelliJ IDEA** (ou outra IDE compatível).
- **WSL2 com Ubuntu** (opcional, mas recomendado para consistência).
- **GitHub CLI (`gh`)** (opcional, para gerenciar issues).

---

## 🚀 Como Configurar e Executar

Siga os passos abaixo para rodar o projeto localmente.

### Clonar o Repositório

Clone o repositório e navegue até a pasta do projeto:

```bash
git clone https://github.com/MatheusxEduardo/Dio_Java.git
cd Dio_Java/Spring/CadastroDeNinjas
```

### Configurar o Java (WSL2)

Se você usa `asdf` para gerenciar versões do Java:

```bash
asdf install java temurin-17.0.12+7
asdf local java temurin-17.0.12+7
java -version
```

Configure o `JAVA_HOME`:

```bash
export JAVA_HOME=~/.asdf/installs/java/temurin-17.0.12+7
```

### Configurar o IntelliJ

1. Abra o projeto: **File > Open > Dio_Java/Spring/CadastroDeNinjas**.
2. Configure o SDK: **File > Project Structure > SDK** (selecione o JDK 17 do `asdf`).
3. Configure o Maven: **File > Settings > Build, Execution, Deployment > Build Tools > Maven** (use `./mvnw`).

### Compilar e Executar

Compile e inicie a aplicação:

```bash
./mvnw clean install
./mvnw spring-boot:run
```

![Coding Animation](https://media.giphy.com/media/LmNwrBhejkK9EFP504/giphy.gif)

---

## 📂 Estrutura do Projeto

```plaintext
Spring/CadastroDeNinjas/
├── src/
│   ├── main/
│   │   ├── java/com/dio/cadastradeninjas/
│   │   │   ├── controller/    # Controladores REST
│   │   │   ├── model/        # Entidades JPA
│   │   │   ├── repository/   # Repositórios Spring Data
│   │   │   └── service/      # Lógica de negócio
│   │   └── resources/
│   │       └── application.properties  # Configurações do Spring
├── mvnw                      # Maven Wrapper (Linux)
├── mvnw.cmd                  # Maven Wrapper (Windows)
├── pom.xml                   # Dependências Maven
└── README.md                 # Este arquivo
```

---

## 🌟 Funcionalidades

- **Cadastro de Ninjas**: Permite criar e gerenciar ninjas com nome, clã e habilidades.
- **API REST**: Endpoints para operações CRUD básicas.
- **Configuração Multiplataforma**: Suporte a WSL2 e Windows via Maven Wrapper.

---

## 🔜 Funcionalidades Futuras

- [ ] Validação de campos (ex.: email único, formato válido).
- [ ] Integração com banco H2 para testes.
- [ ] Testes unitários com JUnit e Mockito.
- [ ] Documentação da API com Swagger/OpenAPI.

---

## 🐞 Reportar Problemas

Encontrou um bug ou quer sugerir algo? Crie uma issue:

```bash
gh issue create --title "Problema X" --body "Detalhes do problema ou sugestão."
```

Ou acesse: [Issues](https://github.com/MatheusxEduardo/Dio_Java/issues).

---

## 🤝 Contribuindo

1. Faça um fork do repositório.
2. Crie uma branch: `git checkout -b minha-feature`.
3. Commit suas alterações: `git commit -m "Adiciona feature X"`.
4. Push para a branch: `git push origin minha-feature`.
5. Abra um Pull Request.

---

## ⚠️ Notas para WSL2

- **Sistema de Arquivos**: Armazene o projeto em `/home/<seu-usuario>/projetos` para melhor performance.
- **Finais de Linha**: Use o `.gitattributes` para evitar conflitos:

  ```plaintext
  *.java text eol=lf
  *.cmd text eol=crlf
  ```

- **Terminal**: Configure o IntelliJ para usar o terminal do WSL2 (**Settings > Tools > Terminal** > `wsl.exe --distribution Ubuntu`).

---

## 📚 Recursos Úteis

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [GitHub CLI](https://cli.github.com)
- [Digital Innovation One](https://dio.me)
- [Java 17 Documentation](https://docs.oracle.com/en/java/javase/17/)

---
