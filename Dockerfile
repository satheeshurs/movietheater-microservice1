FROM alpine/git
WORKDIR /app
RUN git clone https://github.com/satheeshurs/movietheater-microservice1.git
FROM maven:3.5-jdk-8-alpine
WORKDIR /app
COPY --from=0 /app/movietheater-microservice1 /app
RUN mvn install
FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=1 /app/target/movietheater-microservice1.jar /app
CMD ["java -jar movietheater-microservice1"]