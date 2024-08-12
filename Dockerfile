FROM openjdk:21
WORKDIR /app
ADD target/SpringWeatherApi-1.0-SNAPSHOT.jar /app/SpringWeatherApi.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/SpringWeatherApi.jar"]