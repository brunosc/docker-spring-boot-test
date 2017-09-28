# vue

> Exemplo com docker, nginx, spring boot e mysql

### Pontos de atenção

``` bash
# instalar dependencias
npm install

# rodar localmente, na porta 3000
npm run dev-local

# para rodar no container, é utilizado o comando:
npm run dev-container
```

Para rodar no container, foi alterado o "devServer.host" no webpack para '0.0.0.0' pois utilizo docker-machine.