FROM java:8

ENV SPRING_PROFILE=default

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime;
RUN echo "Asia/shanghai" > /etc/timezone;


COPY target/provider-demo-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8080

CMD ["sh", "-c","java -Xmx128m -jar -Dspring.profiles.active=$SPRING_PROFILE /app.jar"]
