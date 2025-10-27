# Running two Different Phases from Two Different Lifecycles

To make sure there is a clean project before we run the
next build, we can ran the following:
```bash
mvn clean install
mvn clean package # package \in jar-lifecycle
```

# mvn clean install

Reminder: 

1. compile
2. test
3. package
4. install (new)
5. deploy

The install phase will copy the jar file that was generated
during the package phase and move it into the
**Local Maven Repository.**
