# Sacola API

A **Sacola API** é uma aplicação em Java construída com o framework Spring Boot que oferece uma API para atender a um sistema de delivery. Ela lida com entidades como Cliente, Endereço, Item, Produto, Restaurante e Sacola para possibilitar a gestão de pedidos.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3

## Configuração e Execução

### Pré-requisitos

- Java 17 deve estar instalado em sua máquina.
- [Maven](https://maven.apache.org/download.cgi) para gerenciamento de dependências.
- Um ambiente de banco de dados configurado, como PostgreSQL.

### Configuração do Banco de Dados

1. Crie um banco de dados para a aplicação em seu sistema de gerenciamento de banco de dados.

2. Abra o arquivo `application.properties` e configure as propriedades de conexão com o banco de dados, incluindo URL, nome de usuário e senha.

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/seu_banco_de_dados
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```
## Contribuição
Se você deseja contribuir para o projeto, sinta-se à vontade para abrir problemas, propor melhorias ou enviar solicitações de pull.


