FROM openjdk:17-jdk-slim
EXPOSE 8090:8080
ADD target/aws-redis.jar aws-redis.jar
ENTRYPOINT ["java","-jar","/aws-redis.jar"]
