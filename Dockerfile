FROM openjdk:17-alpine
MAINTAINER github/mmarcosab
WORKDIR /app
ENTRYPOINT ["java", "-jar", "/app/out/artifacts/explorando_marte_jar/explorando-marte.jar"]
