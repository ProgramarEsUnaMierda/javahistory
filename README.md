# javahistory

A brief summary of changes in java code.
The code includes a base class Java5 that works in J2SE 1.5 and then define Java6 to Java9 classes with some methods redefined to use the new things included on each version.

# Compile

docker run -it --rm --name javahistory -v "$PWD":/usr/javahistory -v "$PWD/.m2":/usr/.m2 -w /usr/javahistory maven:3.5.2-jdk-9-slim mvn clean install -Dmaven.repo.local=/usr/.m2

## Specific JVM

docker run -it --rm --name javahistory -v "$PWD":/usr/javahistory -v "$PWD/.m2":/usr/.m2 -w /usr/javahistory maven:3.5.2-jdk-9-slim mvn clean install -Dmaven.repo.local=/usr/.m2 -P[java6,java7,java8,java9]

You will get different compilation errors on each version with not compatible language changes.

# Run

docker run --rm -v "$PWD/.m2":/usr/.m2 openjdk:9-jdk java --module-path /usr/.m2/com/peum/javahistory/1.0-SNAPSHOT --module javahistory

# Check dependencies

docker run --rm -v "$PWD/.m2":/usr/.m2 openjdk:9-jdk jdeps --module-path /usr/.m2/com/peum/javahistory/1.0-SNAPSHOT --module javahistory
