# Java History

A brief summary of changes in java code.
The code includes a base class Java5 that works in J2SE 1.5 and then define Java6 to Java9 classes with some methods redefined to use the new things included on each version.

Clone this repo to play with Java History.

## Compile

```
docker run -it --rm --name javahistory -v "$PWD":/usr/javahistory -v "$PWD/.m2":/usr/.m2 -w /usr/javahistory maven:3.5.2-jdk-9-slim mvn clean install -Dmaven.repo.local=/usr/.m2
```
### Specific JVM

You will get different compilation errors on each version about the incompatible language changes used.

```
docker run -it --rm --name javahistory -v "$PWD":/usr/javahistory -v "$PWD/.m2":/usr/.m2 -w /usr/javahistory maven:3.5.2-jdk-9-slim mvn clean install -Dmaven.repo.local=/usr/.m2 -P[java5,java6,java7,java8]
```

## Run

```
docker run --rm -v "$PWD/main/target":/usr/mods openjdk:9-jdk java --module-path /usr/mods/main-1.0-SNAPSHOT.jar:/usr/mods/dependency/ --module javahistory
```

## Check dependencies

```
docker run --rm -v "$PWD/main/target":/usr/mods openjdk:9-jdk jdeps --module-path /usr/mods/main-1.0-SNAPSHOT.jar:/usr/mods/dependency/ --module javahistory
```