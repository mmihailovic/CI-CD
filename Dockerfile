FROM openjdk:18
WORKDIR /app
COPY ./build/libs/KotlinProbavanje-0.0.1-SNAPSHOT.jar /app/KotlinProbavanje-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "KotlinProbavanje-0.0.1-SNAPSHOT.jar"]