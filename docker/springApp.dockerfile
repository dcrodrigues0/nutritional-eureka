FROM openjdk:8
MAINTAINER Daniel
WORKDIR /app
COPY target/nutrition-0.0.1-SNAPSHOT.jar /app/spring-app.jar
ENTRYPOINT ["java", "-jar", "spring-app.jar"]