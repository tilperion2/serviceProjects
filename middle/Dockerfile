FROM java:8-jre
MAINTAINER Andrii Merenkov <amerenkov@exadel.com>

ADD ./target/middle.jar /tmp/
CMD ["java", "-Xmx100m", "-jar", "/tmp/middle.jar"]

EXPOSE 8080