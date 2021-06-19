FROM adoptopenjdk/openjdk11:alpine-jre
COPY target/devops-demo.jar devops.jar
ENTRYPOINT ["java","-jar","/devops.jar"]