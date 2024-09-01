# Planeta-BIES
Este repositorio alberga el proyecto del Planeta BIES, el cual cuenta con implementaciones de patrones de diseño, testing y construido sobre Maven.

## Requisitos

- Java JDK 21 o superior
- Maven 3.6.3 o superior
- Git

## Instalación y Ejecucion
Dentro de este repositorio tendras varias opciones para gestionar su testing, generacion de documentacion, empaquetado y posible despliegue al proyecto.

### Clonar el Repositorio

Para clonar el repositorio, abre la terminal y navega al directorio donde deseas clonar el proyecto. Luego, ejecuta el siguiente comando:
- " git clone https://github.com/Joscalion04/Planeta-BIES.git "

### Ejecucion del Ciclo de Vida Maven con Verify
Todos los procesos del ciclo de vida estandar de maven estan preconfigurados en el archivo pom.xml del proyecto para su correcto funcionamiento mediante el comando:
- " mvn verify "
  
Este comando realiza todos los pasos anteriores y ademas en el caso de tener los testings aprobados ofrece la opcion de realizar commit-push al repositorio inmediatamente

### Ejecucion del Ciclo de Vida Maven Estandar
Dentro de las opciones puedes optar por llevar a cabo el ciclo de vida maven por pasos individuales dandose el siguiente orden recomendado para el ciclo de vida basico de maven:

#### Compilacion
Para construir el proyecto maven, abre la terminal y navega al directorio donde se encuentre el archivo pom.xml. Luego, ejecuta el siguiente comando:
- " mvn compile "

#### Testing
Para hacer testing sobre los cambios realizados, abre la terminal y navega al directorio donde se encuentre el archivo pom.xml. Luego, ejecuta el siguiente comando:
- " mvn test "

#### Javadocs
El repositorio viene configurado para la creacion de documentacion basada en la libreria javadoc, con el siguiente comando maven puedes crear la documentacion:
- " mvn javadoc:javadoc "

Ademas el repositorio para facilitar el acceso al index de la documentacion posee en la carpeta BIES un batchfile para abrir inmediatamente el index.html, este batch es:
- " open-javadoc.bat "

#### Empaquetado 
Para hacer el empaquetado del proyecto dentro de la carpeta BIES es necesario que ejecutes el siguiente comando:
 - " mvn package "


