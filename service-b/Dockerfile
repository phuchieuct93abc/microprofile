FROM ubuntu
FROM maven:3-jdk-8
VOLUME "$USER_HOME_DIR/.m2"
EXPOSE 9081/tcp 9444/tcp
COPY ./target /usr/src/app
WORKDIR /usr/src/app
CMD ["java","-jar","/usr/src/app/demo.jar"]
ENTRYPOINT ["java","-jar","/usr/src/app/demo.jar"]
