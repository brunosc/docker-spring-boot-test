# docker build -f ./src/main/docker/vue.dockerfile -t brunosc/vue-state-cli .
# docker run -p 3000:3000 brunosc/vue-state-cli
# https://medium.com/@andyccs/webpack-and-docker-for-development-and-deployment-ae0e73243db4
# alterar host no webpack
# docker run -d -p 8080:8080 brunosc/docker-spring-boot-test:mysql
# docker run -d -p 3306:3306 mysql:5.6

FROM node:latest
MAINTAINER Bruno Martins da Silva
ENV NODE_ENV=development
COPY ./src/main/vue /var/www
RUN chmod 755 -R /var/www
WORKDIR /var/www
RUN npm install 
ENTRYPOINT ["npm", "run", "dev-container"]
EXPOSE 3000