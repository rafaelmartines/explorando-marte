# Explorando Marte

Este repositório foi construído para estudo da linguagem Java utilizando o desafio [Explorando Marte](EXPLORANDOMARTE.md "Explorando Marte")

## Requisitos

- Docker
- Docker Composer
- OpenJDK 17 LTS

Através da linha de comando no diretório do projeto executar o comando abaixo

```sh
docker-compose up -d --build
```

Será criado um diretório out contendo os arquivos compilados ao subir o docker.

Para testar o script, basta executar esse comando na linha de comando:

```sh
java -cp out br.com.explorandomarte.ExplorandoMarte
```