FROM openjdk:8-jre
ARG JAR_FILE
RUN mkdir /apollo-sample
ADD target/$JAR_FILE /apollo-sample/app.jar
ENTRYPOINT ["java", "-jar", "/apollo-sample/app.jar"]