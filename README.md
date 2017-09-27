# docker-spring-boot-test
Projeto para testar utilização do docker com Spring Boot e MySQL

### Subindo
Fazer o build da imagem:
```
docker build -f ./src/main/docker/Dockerfile -t brunosc/docker-spring-boot-test:mysql .
```

Build compose:
```
docker-compose build
```

Rodar:
```
docker-compose up
```

### Testando
Acessar http://{HOST}:8080
* Irá aparecer uma página em branco

Acessar http://{HOST}:8080/seed
* Irá informar que os dados foram gerados

Acessar novamente http://{HOST}:8080
* Irá um JSON com os dados gerados

Onde:
* **brunosc** usuário do docker-hub
* **docker-spring-boot-test** nome da imagem
* **mysql** tag da imagem com MySQL