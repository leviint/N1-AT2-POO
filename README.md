# TaskFlow - Gerenciador de Projetos

## Descrição do Projeto

O **TaskFlow** é um sistema de gerenciamento de projetos desenvolvido em Java, que permite aos usuários criar e gerenciar projetos, bem como adicionar, remover e editar funcionários associados a esses projetos. O objetivo do projeto é facilitar a organização e o acompanhamento de tarefas e prazos, proporcionando uma interface simples e intuitiva.

## Funcionalidades

### 1. Gerenciamento de Projetos
- **Criar Projeto**: Permite que o usuário crie um novo projeto informando o nome e o prazo de entrega.
- **Remover Projeto**: Possibilita a remoção de um projeto existente.
- **Verificar Prazo de Entrega**: O usuário pode verificar se um projeto está dentro do prazo ou se já foi ultrapassado.

### 2. Gerenciamento de Funcionários
- **Adicionar Funcionário**: Os usuários podem adicionar novos funcionários a um projeto especificando o nome, cargo e salário.
- **Remover Funcionário**: Permite que um funcionário seja removido do projeto por nome.
- **Editar Funcionário**: Os usuários podem editar as informações de um funcionário (nome, cargo e salário).
- **Listar Funcionários**: Exibe a lista de funcionários associados a um projeto, mostrando informações como nome, cargo e salário.

## Estrutura do Código

O projeto é composto por três classes principais:

- **Funcionario.java**: Representa um funcionário, contendo atributos como nome, cargo e salário, além de métodos para manipulação desses dados.
- **Projeto.java**: Representa um projeto, gerenciando o nome, prazo de entrega e uma lista de funcionários. Inclui métodos para validar prazos e manipular funcionários associados.
- **Principal.java**: Classe principal que contém a lógica do menu e a interação com o usuário. Responsável por orquestrar as funcionalidades do sistema.

## Como Usar

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu_usuario/taskflow.git
2. **Compile o projeto**:  
    Certifique-se de ter o **JDK** instalado e compile os arquivos **.java**:
    ```bash
    javac pacote/*.java
3. **Execute o programa**:  
    Inicie o programa a partir da classe **Principal**:
    ```bash
    java pacote.Principal
4. **Siga as instruções no console** para interagir com o sistema.

## Tecnologias Utilizadas

- Java
- Estruturas de Dados (ArrayList)
- Manipulação de Data com LocalDate

---
