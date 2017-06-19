FROM java:8
ADD target/dockerMysql-0.0.1.jar dockerMysql-0.0.1.jar
RUN bash -c 'touch /dockerMysql-0.0.1.jar'
ENTRYPOINT ["java", "-jar" ,"dockerMysql-0.0.1.jar"]