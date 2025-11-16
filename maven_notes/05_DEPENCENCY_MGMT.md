# Dependency Management

[+] Specify to Maven the primary dependency and it will
automatically resolve additional dependencies, using the:

# Maven Central Repository

Any dependencies will first try to look locally for any
required dependencies, that act as a "local cache".

## Dependency Scopes

Maven supports **6 scopes** (4 of them are commonly used):

1. Compile (default)
2. Runtime
3. Test
4. Provided
5. System
6. Import

### 1. Compile

This is the default scope for dependency management. This
signifies that the dependency is required for:

[+] Compilation

[+] Execution

Compile-scoped dependencies will be added to any dependent
projects. For example, a <u>web module</u> will inherit any 
compile-scoped dependency from a <u>library module</u>.

Compile dependencies are included within WAR/EAR packages.

### 2. Runtime

A runtime-scoped dependency will be needed during the
deployment and/or runtime of the project. Not required for
compilation.

Runtime dependencies are included within WAR/EAR packages

### 3. Test

Needed only during unit testing. Not needed for compilation,
not deployment to the runtime environment.

### 4. Provided

Provided by the target runtime or deployment system 
(e.g. WAS)

### 5. System (not recommended, unless it's mandatory)

Rarely used. Local Dependencies or lib/ folder.
This is not recommended because defeats the whole point
of Maven's Dependency System. 
However, for legal reasons, you might be compelled to use
dependencies in this way.

### 6. Import

Almost never used. Import or replace dependencies from other
projects.

## Most common scopes: compile and test

# Adding Dependencies

If you add a third-party library:
```java
import org.apache.commons.lang3.StringUtils;
```
Then it becomes a dependency to the project. If you try to
compile the project,
```bash
mvn clean compile
```
it will throw the following error:
```log
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.5.1:compile (default-compile) on project maven-quick-start: Compilation failure: Compilation failure: 
[ERROR] /Users/rafael1642/GIT/Projects/mvn-quick-start/src/main/java/clinic/programming/training/Application.java:[5,32] package org.apache.commons.lang3 does not exist
[ERROR] /Users/rafael1642/GIT/Projects/mvn-quick-start/src/main/java/clinic/programming/training/Application.java:[10,34] cannot find symbol
```

### Add the dependency from the MVN REPOSITORY: CENTRAL

org.apache.commons-lang3

Add these tags between gav (groupId, artifactId, version)
and the build tag:  
```xml
<depencencies>
    <!-- https://mvnrepository.com/artifact/org.apache.commons/commons-lang3 -->
    <dependency>
        <groupId>org.apache.commons</groupId>
        <artifactId>commons-lang3</artifactId>
        <version>3.19.0</version>
    </dependency>
</dependencies>
```

<u>Mnemonic</u>: GAV -> DEPENDENCIES -> BUILD (PLUGINS)