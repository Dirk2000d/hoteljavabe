FROM amazoncorretto:11
EXPOSE 8080
ADD target/javahotel*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
