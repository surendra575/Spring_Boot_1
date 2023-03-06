FROM openjdk:17
COPY target/Spring_Boot_Ex2.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java","-jar","Spring_Boot_Ex2.jar"]
