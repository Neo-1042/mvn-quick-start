# Unit Testing

```<project_root>/src/test/java``` becomes the root for
unit testing. This is where Maven will look for the 
test classes.

```bash
cd <project_root>
mkdir -p src/test/java/com/neo_1042/my_app/
cd src/test/java/com/neo_1042/my/app/
touch ApplicationTest.java
```

## Increment version from 1.0 to 1.1 in the pom.xml

```<version>1.1</version>```

# Add JUnit Dependencies to the project

Mind the 
```xml
<scope>test</scope>
```

to switch from the default scope to the test scope:

```xml
<dependency>
  <groupId>junit</groupId>
  <artifactId>junit</artifactId>
  <version>4.13.2</version>
  <scope>test</scope>
</dependency>
```

Once you've modified the pom.xml file, run the "test" goal:
```bash
mvn test
# compile > test > package > install > deploy
```

# Unit Testing Reports (Surefire Plugin)

```bash
cd target/surefire-reports/
ls
TEST-clinic.programming.training.ApplicationTest.[xml|txt]
```