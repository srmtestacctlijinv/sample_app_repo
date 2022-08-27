FROM openjdk:8
ADD target/sampleApp.jar sampleApp.jar
ENTRYPOINT ["java","-jar","/sampleApp.jar"]
