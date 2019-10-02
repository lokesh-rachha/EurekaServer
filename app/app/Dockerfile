FROM openjdk:8-jdk-alpine
Expose 8091
COPY target/*.jar appn.jar
ENTRYPOINT exec java -jar appn.jar