From openjdk:latest
ADD target/capsgcppoc-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
EXPOSE 8060
