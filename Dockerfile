FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target/spring-crud-k8s-demo-0.0.1-SNAPSHOT.jar  spring-crud-k8s-demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","spring-crud-k8s-demo.jar"]

