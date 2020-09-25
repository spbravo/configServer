#######Maven build stage##########
FROM maven:3.6-jdk-11 as maven_build
WORKDIR /configServer

#copy pom
COPY /configServer/pom.xml .

#resolve maven dependencies
#copy source
COPY /configServer/src ./src

# build the app (no dependency download here)
RUN mvn clean package  -Dmaven.test.skip

# split the built app into multiple layers to improve layer rebuild
#RUN mkdir -p target/docker-packaging && cd target/docker-packaging && jar -xf ../my-app*.jar

########JRE run stage########


#FROM alpine:latest
FROM openjdk:8-jdk-alpine
COPY --from=0 configServer/target/configServer-0.0.1-SNAPSHOT.jar /App.jar
#WORKDIR /var/www/java  
#RUN javac App.java  
CMD ["java", "-cp", "App.jar", "configServer.ApplicationConfigServer"]
#CMD ["java", "-jar", "App.jar"]
