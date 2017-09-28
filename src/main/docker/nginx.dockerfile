FROM nginx:latest
MAINTAINER Bruno Martins da Silva
COPY ./src/main/docker/config/nginx.conf /etc/nginx/nginx.conf
EXPOSE 80 443
ENTRYPOINT ["nginx"]
# Parametros extras para o entrypoint
CMD ["-g", "daemon off;"]
