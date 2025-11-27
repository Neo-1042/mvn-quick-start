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