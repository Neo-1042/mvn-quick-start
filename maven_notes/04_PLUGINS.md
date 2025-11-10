# Maven = "Plugin Runner"

[+] Provide the core functionality as well as additional
functions.

You could think of Maven as the engine that calls or manages
the plugins, which actually do all of the work.
Plugins often add more goals.

## Plugin Example Use Cases

1. Compile source code.
2. Run unit tests.
3. Publish to artifact repositories.
4. Deploy to a remote server.
5. Publish documentation.

- Core Plugins: Known to Maven, downloaded upon reference
- Others: declared in the pom.xml file

## Core Plugin: Apache Maven Compiler Plugin

[https://maven.apache.org/plugins/maven-compiler-plugin/examples/set-compiler-release.html](https://maven.apache.org/plugins/maven-compiler-plugin/examples/set-compiler-release.html)

List of examples: Using the ```-source``` and ```-target```
javac options.

