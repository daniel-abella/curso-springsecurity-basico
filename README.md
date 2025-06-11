# 🔐 Spring Security Demo com JWT

Projeto de demonstração do curso de **Introdução ao Spring Security**, usando autenticação baseada em **JWT (JSON Web Token)**. Desenvolvido com **Spring Boot**, o projeto implementa segurança para uma API REST com controle de acesso por papéis de usuário.

[![Java](https://img.shields.io/badge/Java-17+-red)](https://www.oracle.com/java/technologies/javase-downloads.html)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-brightgreen)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-3.6+-blue)](https://maven.apache.org/)
[![GitHub](https://img.shields.io/badge/Repo-GitHub-lightgrey)](https://github.com/daniel-abella/curso-springsecurity-basico)

---

## 📁 Estrutura do Projeto

```
springsecuritydemo1/
├── .mvn/
├── src/
│   └── main/java/com/danielabella/springsecuritydemo1/
│       ├── Springsecuritydemo1Application.java     # 🟢 Entry point
│       ├── JwtTokenService.java                    # 🔑 JWT handler
│       ├── SecurityConfiguration.java              # 🔐 Configuração de segurança
│       ├── UserAuthenticationFilter.java           # 🧰 Filtro JWT
│       ├── User.java                               # 👤 Entidade de usuário
│       ├── Role.java / RoleName.java               # 🏷️ Controle de papéis
│
├── resources/application.properties                # ⚙️ Configurações da aplicação
├── pom.xml                                         # 📦 Dependências Maven
├── mvnw / mvnw.cmd                                 # 🛠️ Maven wrapper
├── spring-boot-jwt-security.postman_collection.json # 📬 Testes Postman
```

---

## 🚀 Como Executar Localmente

### ✅ Pré-requisitos

- [Java 17+](https://adoptium.net/)
- [Maven 3.6+](https://maven.apache.org/)
- Git

### 📥 Clonando o Repositório

```bash
git clone https://github.com/daniel-abella/curso-springsecurity-basico.git
cd curso-springsecurity-basico/springsecuritydemo1
```

### ▶️ Rodando a Aplicação

Linux/macOS:
```bash
./mvnw spring-boot:run
```

Windows:
```bash
mvnw.cmd spring-boot:run
```

Aplicação disponível em: [http://localhost:8080](http://localhost:8080)

---

## ⚙️ Sobre o `application.properties`

```properties
server.port=8080
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jackson.serialization.indent_output=true

jwt.secret=4Z^XrroxR@dWxqf$mTTKwW$!@#qGr4P
jwt.issuer=pizzurg-api

logging.level.org.springframework.security=INFO
logging.level.com.seuprojeto=DEBUG
```

**Explicações:**
- `server.port`: Porta onde a aplicação será executada.
- `spring.jpa.hibernate.ddl-auto`: Define o comportamento do Hibernate ao iniciar (ex: `update`, `create`, `validate`).
- `spring.jpa.show-sql`: Exibe queries no console.
- `jwt.secret`: Chave secreta usada para assinar os tokens JWT (deve ser mantida segura).
- `jwt.issuer`: Identificador da aplicação no token JWT.
- `logging.level.*`: Define níveis de log para depuração e auditoria.

👉 Altere `jwt.secret` para uma string aleatória diferente em produção, e o `jwt.issuer` para refletir o nome real da sua aplicação.

---

## 🔄 Endpoints e Exemplos de Uso

### 🔐 1. Registro de Usuário

**Endpoint:** `POST /auth/register`

**Requisição:**
```json
{
  "username": "joao",
  "password": "123456",
  "role": "USER"
}
```

---

### 🔑 2. Login

**Endpoint:** `POST /auth/login`

**Requisição:**
```json
{
  "username": "joao",
  "password": "123456"
}
```

**Resposta esperada:**
```json
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
}
```

---

### 🔒 3. Acesso a Rota Protegida

**Endpoint:** `GET /api/secure`

**Headers:**
```
Authorization: Bearer <seu_token_jwt>
```

---

## 🧪 Testando com Postman

1. Importe o arquivo `spring-boot-jwt-security.postman_collection.json`.
2. Use os endpoints para:
   - Registrar um novo usuário.
   - Fazer login e copiar o token JWT.
   - Usar o token para acessar rotas protegidas.

---

## 👨‍🏫 Autor

**Daniel Abella**  
🔗 [@daniel-abella (GitHub)](https://github.com/daniel-abella)
