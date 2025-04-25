Cadastro de Ninjas (Dio_Java)
Bem-vindo ao Cadastro de Ninjas, um projeto Spring Boot desenvolvido como parte do curso da DIO (Digital Innovation One). Este projeto implementa um sistema simples de cadastro de ninjas, permitindo gerenciar informações como nome, clã e habilidades. É ideal para aprender conceitos de Spring Boot, REST APIs e integração com bancos de dados.
📖 Sobre o Projeto
O CadastroDeNinjas é um módulo do repositório Dio_Java, que contém vários projetos Java. Este módulo usa Spring Boot para criar uma API REST que gerencia cadastros de ninjas. Ele foi desenvolvido com foco em:

Estruturação de APIs RESTful.
Mapeamento objeto-relacional com Spring Data JPA.
Configuração do Maven Wrapper para builds consistentes.
Boas práticas de desenvolvimento em ambientes Linux (WSL2) e Windows.

🚀 Tecnologias Utilizadas

Java: JDK 17 (Temurin, gerenciado via asdf).
Spring Boot: Framework principal para a API.
Spring Data JPA: Para persistência de dados.
Maven: Gerenciamento de dependências (usando Maven Wrapper).
H2 Database (futuro): Banco em memória para testes (a ser implementado).
Git: Controle de versão, com integração ao GitHub.

🛠️ Pré-requisitos
Antes de começar, certifique-se de ter:

Java 17 instalado (recomendado: openjdk version "22.0.2" via asdf).
Maven ou use o ./mvnw incluído no projeto.
Git para clonar o repositório.
IntelliJ IDEA (ou outra IDE compatível).
WSL2 com Ubuntu (opcional, mas recomendado para consistência com o ambiente de desenvolvimento).

📦 Como Configurar o Projeto
Siga os passos abaixo para rodar o projeto localmente:
1. Clone o Repositório
git clone https://github.com/MatheusxEduardo/Dio_Java.git
cd Dio_Java/Spring/CadastroDeNinjas

2. Configure o Java (WSL2)
Se você usa asdf para gerenciar versões do Java:
asdf install java temurin-17.0.12+7
asdf local java temurin-17.0.12+7
java -version

Certifique-se de que o JAVA_HOME está configurado:
export JAVA_HOME=~/.asdf/installs/java/temurin-17.0.12+7

3. (Opcional) Configure o IntelliJ

Abra o projeto no IntelliJ: File > Open > Dio_Java/Spring/CadastroDeNinjas.
Configure o SDK em File > Project Structure > SDK apontando para o JDK 17 do asdf.
Use o Maven Wrapper (./mvnw) em File > Settings > Build, Execution, Deployment > Build Tools > Maven.

4. Compile e Execute
Use o Maven Wrapper para compilar e rodar:
./mvnw clean install
./mvnw spring-boot:run

A aplicação estará disponível em http://localhost:8080.
🖥️ Estrutura do Projeto
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
└── pom.xml                   # Dependências Maven

🌟 Funcionalidades Atuais

Cadastro de ninjas com nome, clã e habilidades.
API REST para listar, criar e consultar ninjas.
Configuração inicial com Spring Boot e Maven.

🔜 Funcionalidades Futuras

Validação de campos (ex.: email único, formato válido).
Integração com banco H2 para testes.
Testes unitários com JUnit e Mockito.
Documentação da API com Swagger/OpenAPI.

🐛 Como Reportar Problemas
Encontrou um bug ou quer sugerir uma melhoria? Crie uma issue no GitHub:
gh issue create --title "Descrição do Problema" --body "Detalhes do problema ou sugestão."

Ou acesse: Issues.
🤝 Contribuindo

Faça um fork do repositório.
Crie uma branch: git checkout -b minha-feature.
Commit suas alterações: git commit -m "Adiciona feature X".
Push para a branch: git push origin minha-feature.
Abra um Pull Request.

⚠️ Notas sobre WSL2

Armazene o projeto no sistema de arquivos do WSL2 (ex.: /home/<seu-usuario>/projetos/Dio_Java) para melhor performance.

Use o arquivo .gitattributes para gerenciar finais de linha:
*.java text eol=lf
*.cmd text eol=crlf


Evite acessar o repositório pelo Windows para evitar conflitos de permissões.


📚 Recursos Úteis

Documentação do Spring Boot
GitHub CLI
DIO - Digital Innovation One

🎉 Agradecimentos
Obrigado à DIO por fornecer o curso e à comunidade open-source por ferramentas incríveis como Spring e Maven!
