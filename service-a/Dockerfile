FROM ubuntu
FROM maven:3-jdk-8
VOLUME "$USER_HOME_DIR/.m2"
EXPOSE 9080/tcp 9443/tcp
COPY ./target /usr/src/app
COPY --chown=1001:0 ./postgresql-9.4-1201-jdbc41.jar /opt/ol/wlp/lib/
WORKDIR /usr/src/app
CMD ["java","-jar","/usr/src/app/demo.jar"]
ENTRYPOINT ["java","-jar","/usr/src/app/demo.jar"]
