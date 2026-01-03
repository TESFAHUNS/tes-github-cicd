FROM openjdk:8
EXPOSE 8080
ADD target/tes-springboot.jar tes-springboot.jar
ENTRYPOINT ["java","-jar","tes-springboot.jar"]