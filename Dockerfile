FROM java:8-jdk-alpine
ADD ./target/mongodb-ex-0.0.1-SNAPSHOT.jar mongodb-ex-0.0.1-SNAPSHOT.jar
EXPOSE 8084
ENTRYPOINT ["java", "-jar", "mongodb-ex-0.0.1-SNAPSHOT.jar"]