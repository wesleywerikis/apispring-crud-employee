# Employee CRUD API

Esta é uma API RESTful desenvolvida em Spring Boot para realizar operações CRUD (Create, Read, Update, Delete) em uma entidade Employee. A aplicação utiliza JPA para persistência de dados e pode ser conectada a diferentes bancos de dados.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.0**
- **Spring Data JPA**
- **Hibernate**
- **MySQL**
- **Lombok**

## Requisitos

- **Java 17+**
- **Maven** para gerenciamento de dependências

## Instalação e Execução

1. Clone o repositório:
   ```bash
   git clone https://github.com/username/api_crud_employee.git
    ````
    
2. Navegue até o diretório do projeto:
    ```bash
   cd api_crud_employee
    ````
3. Execute o projeto com o Maven:
    ```bash
   ./mvnw spring-boot:run
    ````     
4. Acesse a API no seguinte endereço:
    ```bash
   http://localhost:8080/api/employees
    ````

## Endpoints

Abaixo estão os principais endpoints para realizar operações CRUD com a entidade Employee.

| Método  | Endpoint             | Descrição                         |
|---------|----------------------|-----------------------------------|
| POST    | `/api/employees`     | Cria um novo empregado            |
| GET     | `/api/employees`     | Retorna todos os empregados       |
| GET     | `/api/employees/{id}`| Retorna um empregado pelo ID      |
| PUT     | `/api/employees/{id}`| Atualiza um empregado existente   |
| DELETE  | `/api/employees/{id}`| Remove um empregado               |

## Exemplo de Uso

• Criar um Empregado
```bash
 POST /api/employees
 Content-Type: application/json

{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com"
}
```

• Buscar Todos os Empregados
```bash
 GET /api/employees
````

• Atualizar um Empregado
```bash
 PUT /api/employees/1
 Content-Type: application/json

{
  "firstName": "Jane",
  "lastName": "Doe",
  "email": "jane.doe@example.com"
}
```

• Deletar um Empregado
```bash
 DELETE /api/employees/1
````

## Exceções

- **404 Not Found**: Ocorre se um empregado não for encontrado ao buscar, atualizar ou deletar.
- **400 Bad Request**: Ocorre se os dados de entrada forem inválidos.

## Configuração do Banco de Dados

Para conectar ao MySQL, configure as credenciais no arquivo `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
