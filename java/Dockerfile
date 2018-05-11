FROM openjdk:jdk-alpine

USER root

WORKDIR /app
COPY . /app

CMD javac TcpSynIpAttack.java && java TcpSynIpAttack \
    && javac TcpSynAttack.java && java TcpSynAttack
