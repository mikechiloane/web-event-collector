FROM maven:3.9.9-eclipse-temurin-21-alpine as build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

# Stage 2: Create the final image with OpenJDK 17
FROM openjdk:21-jdk
COPY --from=build /home/app/target/web-event-collector-1.0.0.jar /usr/local/lib/app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/usr/local/lib/app.jar"]
