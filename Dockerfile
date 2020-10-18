FROM maven:slim

WORKDIR /immutable/
COPY pom.xml /immutable/pom.xml
RUN mvn dependency:go-offline

COPY ./src /immutable/src
RUN mvn clean package

CMD mvn spring-boot:run