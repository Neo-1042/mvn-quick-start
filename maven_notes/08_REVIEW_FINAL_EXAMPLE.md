# Course Review

[+] Power of Maven

[+] Core Concepts

[+] Lifecycles -> Phases -> Goals

[+] Dependencies -> Maven Central

[+] Run unit tests using Maven

# Bonus practice: Java interview Persona-Empleado From Scratch

File: pom.xml
```xml
<project
    xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
        http://maven.apache.org/maven-v4:0:0.xsd">

    <modelVersion>4.0.0</modelVersion>
    <groupId>com.rafael</groupId>
    <artifactId>entrevista-java</artifactId>
    <version>1.0</version>
</project>
```

Project Structure

```bash
tree
.
├── pom.xml
├── Requerimientos.md
└── src
    └── main
        └── java
            └── com
                └── rafael
                    └── entrevista
                        ├── App.java
                        ├── dao
                        │   ├── EmpleadoService.java
                        │   └── EmpleadoServiceImpl.java
                        └── entity
                            ├── Empleado.java
                            └── Persona.java
```

```bash
java -cp entrevista-java-1.0.jar com.rafael.entrevista.App
# BUILD SUCCESS. System.out.println(); OK
```