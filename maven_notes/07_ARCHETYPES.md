# Maven Archetypes

Maven Archetypes are Maven Project templates we can use to
jumpstart any new project.
From simple Maven projects, it's better to start from scratch.
But the **more complex projects** we have, the more desirable
it becomes to have a **starting point**.

[https://maven.apache.org/archetype/index.html](https://maven.apache.org/archetype/index.html)


"An archetype is defined as an original pattern or model from
which all other things of the same kind are made."

Maven Archetypes can be seen as simply another plugin that
extends the functionality of Maven.

```bash
cd /project_root/
mvn archetype:generate
    mvn-archetype # Filter by strings that start with this
    # maven-archetype-quickstart
    # Choose a number: (version)
    # Define value for property 'groupId': clinic.programming.training
    # Define value for property 'artifactId': quick-start-example
    # Define value for property 'version': 1.0
    # Define value for property 'package': clinic.programming.training
    # Confirm properties configuration: Y
```

## Remove the archetype example

```bash
rm -rf quick-start-archetype-example
```

# Generating a Project Non-Interactively

[https://maven.apache.org/archetypes](https://maven.apache.org/archetypes)

maven-archetype-bundles provides a list.

```bash
mvn archetype:generate -DgroupId=clinic.programming.training -DartifactId=jumpstart-example -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

### Small practice: Junit basic AppTest

```java
package com.neo_1042.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    /**
     * Create the test case
     * 
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous test :)
     */
    public void testApp() {
        assertTrue(true);
    }
}
```

# List the contents of a jar file

```bash
mvn clean install
ls # pom.xml src target
cd target/
ls # jumpstart-example-1.0-SNAPSHOT.jar

jar -tf jumpstart-example-1.0-SNAPSHOT.jar
```