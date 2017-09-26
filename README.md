# docker-spring-boot-test
Projeto para testar utilização do docker com projetos Spring Boot

Fazer o build da imagem:
```
docker build -f ./docker/java.dockerfile -t brunosc/docker-spring-boot-test:mysql .
```

Rodar a imagem:
```
docker run -p 8080:8080 -t brunosc/docker-spring-boot-test:mysql
```

Subir no docker-hub:
```
docker push brunosc/docker-spring-boot-test:mysql
```

Onde:
* **brunosc** usuário do docker-hub
* **docker-spring-boot-test** nome da imagem
* **mysql** tag da imagem com MySQL