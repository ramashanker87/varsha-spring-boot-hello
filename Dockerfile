FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY target/varsha-spring-boot-hello-1.0.0.jar /app/varsha-spring-boot-hello.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/varsha-spring-boot-hello.jar"]
