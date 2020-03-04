FROM adoptopenjdk/openjdk12:latest
VOLUME /tmp
COPY . .
RUN ./mvnw clean install -DskipTests=true
EXPOSE 8079
ENTRYPOINT ["java","-jar","target/demo-0.0.1-SNAPSHOT.jar"]