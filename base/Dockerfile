FROM java:8-jre
MAINTAINER Andrii Merenkov <amerenkov@exadel.com>

ADD ./target/base.jar /tmp/
CMD ["java", "-Xmx100m", "-jar", "/tmp/base.jar"]

EXPOSE 8080