FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD /target/docker-spring-boot-test.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=container -jar /app.jar