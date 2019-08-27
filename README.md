# Apache TomEE Simple REST Starter

## Instructions

### Requirements
- Maven
- TomEE (with JAX-RS)

### To create .war file:

 `mvn clean package`

 ### To deploy

 1. Copy `Hello.war` file from `target/` into: `%CATALINA_HOME%/webapps`

 2. Ensure TomEE service is running

 3. Go to http://localhost:8080/hello (default)

