FROM openjdk:14.0-jdk-slim
EXPOSE 8110
ADD ./target/redis-server-0.0.1-SNAPSHOT.jar servicio-redis.jar 
ENTRYPOINT ["java", "-jar", "/servicio-redis.jar"]