FROM openjdk:8-jre-alpine
EXPOSE 2022
ADD isht3ii-1.0-SNAPSHOT.jar isht3ii.jar
ENTRYPOINT ["java","-jar","isht3ii.jar"]

