FROM openjdk:8-jdk-alpine

EXPOSE 8080

ARG JAR_FILE=target/SWE_12factor_microservice-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]