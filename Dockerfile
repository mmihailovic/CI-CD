FROM openjdk:17
WORKDIR /app
COPY ./target/my-kotlin-app-0.1.jar /app/my-kotlin-app-0.1.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "my-kotlin-app-0.1.jar"]