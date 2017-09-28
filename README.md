# docker-spring-boot-test
Projeto para testar utilização do docker com Nginx, Vue, Spring Boot e MySQL

### Comandos
Build da imagem do Vue:
```
docker build -f ./src/main/docker/vue.dockerfile -t brunosc/vue-state-cli .
```

Build da imagem do nginx:
```
docker build -f ./src/main/docker/nginx.dockerfile -t brunosc/nginx-vue-state .
```

Build da imagem do nginx:
```
docker build -f ./src/main/docker/java.dockerfile -t brunosc/docker-spring-boot-test:vue-mysql .
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
Acessar http://{HOST}
* Irá aparecer uma página com dois botões: Atualizar e Gerar Dados.