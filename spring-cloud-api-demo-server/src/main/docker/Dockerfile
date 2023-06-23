FROM openjdk:11
MAINTAINER hankun <ihankun@outlook.com>
VOLUME /app
ADD */target/*.jar app.jar
ENTRYPOINT ["java", "-server", "-Xms512M", "-Xmx512M", "-jar", "/app.jar"]
EXPOSE 10000
