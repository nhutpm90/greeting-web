FROM openjdk:8-jdk-alpine
WORKDIR /opt/myapp
COPY build/libs/greeting-web-1.0.0.jar greeting-web-1.0.0.jar
ENTRYPOINT ["java","-jar","greeting-web-1.0.0.jar"]