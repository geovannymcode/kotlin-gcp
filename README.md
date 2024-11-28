# Kotlin API Deployment on Google Cloud 🚀

[![Kotlin](https://img.shields.io/badge/Kotlin-1.8.22-blueviolet.svg?style=for-the-badge&logo=kotlin)](https://kotlinlang.org/)
[![Spring Boot](https://img.shields.io/badge/SpringBoot-3.1.3-green?style=for-the-badge&logo=springboot)](https://spring.io/projects/spring-boot)
[![Google Cloud](https://img.shields.io/badge/GoogleCloud-Deployed-blue?style=for-the-badge&logo=googlecloud)](https://cloud.google.com/)
[![License](https://img.shields.io/badge/License-MIT-brightgreen?style=for-the-badge)](LICENSE)

### Una API REST desarrollada con **Kotlin** y desplegada en **Google Cloud App Engine**, con conexión a una base de datos **PostgreSQL** en **Cloud SQL**.

Este proyecto es el resultado de un workshop en el que aprendimos a desarrollar y desplegar una aplicación REST en Google Cloud usando Kotlin y Spring Boot.

---

## 📜 Características

- API RESTful desarrollada en **Kotlin** con **Spring Boot**.
- Conexión a una base de datos PostgreSQL alojada en **Cloud SQL**.
- Despliegue en **Google App Engine**.
- Configuración segura y optimizada para producción.
- Ejemplo funcional para insertar y consultar datos.

---

## 🚀 Despliegue en Google Cloud

### **Requisitos Previos**
1. Tener una cuenta de Google Cloud activa.
2. Configurar `gcloud CLI`:
   ```bash
   ./google-cloud-sdk/bin/gcloud init
   ```
3. Clonar este repositorio:
```bash
git clone https://github.com/geovannymcode/kotlin-gcp.git
cd kotlin-gcp
```

### **Despliegue**
1. Configurar tu proyecto en Google Cloud:
    - Crear una instancia PostgreSQL en **Cloud SQL**.
    - Habilitar **Cloud SQL Admin API**.
    - Añadir las siguientes propiedades al archivo `application.properties`:
```properties
spring.cloud.gcp.sql.database-name=kotlindb
spring.cloud.gcp.sql.instance-connection-name=<PROJECT_ID>:<REGION>:kotlinbase
```

2. Crear los archivos necesarios:
- `.gcloudignore` para excluir archivos innecesarios:
```plaintext
target/
*.iml
.idea/
*.log
```

- `app.yaml` para definir el entorno de ejecución:
```yaml
runtime: java21
instance_class: F2
```

3. Empaquetar y desplegar la aplicación:
```bash
./mvnw package
gcloud app deploy
```

4. Verifica la URL proporcionada por Google Cloud:

```plaintext
https://<PROJECT_ID>.appspot.com
```

## 🛠️ Uso Local
**Requisitos**
  - Java 21 o superior.
  - Maven o Gradle.
  - Herramienta de cliente para bases de datos como DBeaver.

**Configuración**
 1. Clona este repositorio:
```bash
git clone https://github.com/geovannymcode/kotlin-gcp.git
cd kotlin-gcp
```

2. Configura las propiedades de la base de datos en `application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://<YOUR_DB_IP>:5432/kotlindb
spring.datasource.username=<YOUR_DB_USER>
spring.datasource.password=<YOUR_DB_PASSWORD>
```

3. Ejecuta la aplicación localmente:
```bash
./mvnw spring-boot:run
```

4. Prueba los endpoints con herramientas como Postman o cURL.

## 📚 Endpoints de la API
## 📚 Endpoints de la API

| Método | Endpoint         | Descripción                     |
|--------|-------------------|---------------------------------|
| GET    | `/api/speakers`      | Lista todos los speakers.      |
| POST   | `/api/speakers`      | Crea un nuevo speaker.         |
| GET    | `/api/speakers/{id}` | Consulta un speaker por ID.    |
| PUT    | `/api/speakers/{id}` | Actualizar un speaker por ID.    |


## 🛡️ Mejores Prácticas
- Seguridad en la base de datos: Usa conexiones seguras y elimina las IP públicas.
- Propiedades en producción: Usa variables de entorno en lugar de almacenar credenciales en texto plano.
- Escalabilidad: Configura App Engine para ajustarse al tráfico dinámico.

## 🌟 Conéctate conmigo
¡Sígueme para más contenido y proyectos como este!

- Web: [Geovanny Mendoza](https://geovannycode.com/)
- GitHub: [@geovannymcode](https://github.com/geovannymcode)
- Twitter: [@geovannycode](https://x.com/geovannycode)
- LinkedIn: [Geovanny Mendoza](https://www.linkedin.com/in/geovannycode/)
- YouTube: [Geovanny Mendoza](https://www.youtube.com/@geovannymendozagonzalez9119)


