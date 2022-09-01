# syntax=docker/dockerfile:1
#Docker images can be inherited from other images
FROM openjdk:latest
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xlm ./
#Run this inside the image
RUN ./mvnw dependency:go-offline
COPY src ./src
CMD ["./mvnw", "spring-boot:run"]