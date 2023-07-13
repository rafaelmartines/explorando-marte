FROM openjdk:17-alpine
MAINTAINER github/rafaelmartines
WORKDIR /app
ENTRYPOINT ["/bin/sh", "build.sh"]
