# docker-spring-boot-test
Projeto para testar utilização do docker com projetos Spring Boot

Fazer o build da imagem:
```
docker build -t brunosc/docker-spring-boot-test:hello-world .
```

Rodar a imagem:
```
docker run -p 8080:8080 -t brunosc/docker-spring-boot-test:hello-world
```

Subir no docker-hub:
```
docker push brunosc/docker-spring-boot-test:hello-world
```

Onde:
* **brunosc** usuário do docker-hub
* **docker-spring-boot-test** nome da imagem
* **hello-world** tag da imagem inicial - somente hello world clássico