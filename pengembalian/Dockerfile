FROM openjdk:17.0.1-jdk-oracle

#direktori
WORKDIR /app

#copy jar file
copy target/*.jar app.jar

#expose
EXPOSE 8089

CMD ["java","-jar","app.jar"]