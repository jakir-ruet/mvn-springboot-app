## Getting Started

### [Create application](https://start.spring.io/)

### Build & Run the Application

```bash
mvn clean install # Build
mvn spring-boot:run # Run
java -jar target/your-app.jar # Run JAR
```

#### If need to change the port `src/main/resources/application.properties`

 ```bash
server.port=8081
 ```

 `Or`

#### If need to change the port `src/main/resources/application.yml`

 ```bash
server:
  port: 8081
 ```

#### On Web Browser

 ```bash
 http://127.0.0.1:8085/home
 ```
