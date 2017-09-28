# docker build -f ./src/main/docker/java.dockerfile -t brunosc/docker-spring-boot-test:vue-mysql .

FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD /target/docker-spring-boot-test.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar