FROM amazoncorretto:24.0.1-alpine3.21
LABEL authors="EderAJ"
WORKDIR /app
COPY ./target/desidiamx-0.0.1-SNAPSHOT.jar ./app.jar
EXPOSE 8080
CMD ["java","-jar", "./app.jar"]