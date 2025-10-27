# The Local Maven Repository

A local 'cache' of various builds and artifacts.

```bash
mvn clean install # Moves the jar file into ~/.m2/repository
cd ~/.m2/repository
ls -lTr
```

Any plugins or dependencies that Maven need for performing
the CTPID commands will be stored inside 
```~/.m2/repository```. For example, for the 
clinic.programming.training.Application.java file we have
the corresponding directory structure:

```/Users/rafael1642/.m2/repository/clinic/programming/maven-quick-start/1.0/maven-quick-start-1.0.[pom+jar]```

The ```maven-quick-start-1.0.pom``` file simply describes
what you will find in the corresponding 
```maven-quick-start-1.0.jar``` file.