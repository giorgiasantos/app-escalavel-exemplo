# Use a imagem base do OpenJDK para Java 11
FROM openjdk:17

# Define o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copie o arquivo JAR do serviço de usuários para o contêiner
COPY target/order-service-0.0.1-SNAPSHOT.jar order-service-0.0.1-SNAPSHOT.jar

# Exponha a porta 8080 para acessar o serviço
EXPOSE 8082

# Comando para iniciar o serviço de usuários
CMD ["java", "-jar", "order-service-0.0.1-SNAPSHOT.jar"]
