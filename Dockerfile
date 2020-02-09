FROM ubuntu
FROM maven:3-jdk-8
VOLUME "$USER_HOME_DIR/.m2"
EXPOSE 9080/tcp 9443/tcp
COPY ./service-a/target /usr/src/app
WORKDIR /usr/src/app
CMD ["java","-jar","/usr/src/app/demo.jar"]
ENTRYPOINT ["java","-jar","/usr/src/app/demo.jar"]
