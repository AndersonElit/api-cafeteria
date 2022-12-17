# api-cafeteria

crear y poblar tablas:

la base de datos se creo en el gestor de base de datos postgres

para crear y poblar las tablas se debe ejecutar el script tablas_db.sql, este se debe correr desde un IDE como dbeaver

el proyecto se debe clonar desde el link que se proporcione y se debe abrir en algun IDE que soporte java(recomendado: Intellij IDEA)

se debe configurar el archivo application.properties de la siguiente manera:
spring.datasource.url=jdbc:postgresql://localhost:5432/*nombre_base_de_datos*
spring.datasource.username=*nombre_usuario*
spring.datasource.password=*contraseña*

el resto se deja tal cual.

para ver la documentacion de los servicios se incorporo swagger 3, lo que se debe hacer es correr el servicio y abrir el siguiente link:
http://localhost:8080/swagger-ui.html
