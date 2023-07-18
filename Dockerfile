FROM openjdk:17-alpine
LABEL org.opencontainers.image.authors="rafael.martines@gmail.com"
WORKDIR /app
ENTRYPOINT ["/bin/sh", "build.sh"]
