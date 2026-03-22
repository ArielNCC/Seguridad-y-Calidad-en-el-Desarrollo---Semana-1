FROM httpd:2.4
RUN apt-get update && apt-get install -y libssl-dev openssl
WORKDIR /var/www/html
COPY server-nopass.key /usr/local/apache2/conf/server.key
COPY server.crt /usr/local/apache2/conf/server.crt
COPY httpd.conf /usr/local/apache2/conf/httpd.conf
COPY httpd-ssl.conf /usr/local/apache2/conf/extra/httpd-ssl.conf

EXPOSE 80 443