# CursoSpring2024-01-ParametrosYRutas 🚀

### 📋 Descripción del Proyecto
Este proyecto es parte de una práctica de clase sobre **manejo de parámetros y rutas** con Spring Boot. En esta práctica se desarrollan varios controladores que permiten gestionar diferentes tipos de **parámetros** para endpoints REST, incluyendo variables de ruta (`@PathVariable`), parámetros de solicitud (`@RequestParam`) y valores desde archivos de configuración (`@Value`). Además, se muestra cómo integrar vistas con **Thymeleaf** y cómo redirigir o reenviar solicitudes.

### 🎯 Objetivo
El objetivo principal de esta práctica es aprender a manejar diferentes tipos de **parámetros** y rutas dentro de un proyecto Spring Boot. Además, se pretende entender cómo usar anotaciones como `@Controller`, `@RestController`, `@GetMapping`, y `@PostMapping` para desarrollar APIs REST y controladores de vistas.

En esta práctica, aprenderás a:

- Utilizar **Spring Boot** para crear controladores REST y controladores de vistas. 🌐
- Entender cómo funcionan los **parámetros de rutas** (`@PathVariable`) y **parámetros de solicitud** (`@RequestParam`). 🛣️
- Utilizar valores de configuración con **`@Value`** para personalizar la aplicación y su comportamiento. 🛠️
- Redirigir (`redirect`) y reenviar (`forward`) peticiones HTTP en Spring. 🔄

### 🔍 Funcionalidades
- **Redirección de peticiones**: La ruta `/home` redirige automáticamente al listado de usuarios (`/list`).
- **Variables de ruta** (`@PathVariable`):
  - Endpoint `/api/var/baz/{message}` devuelve un objeto con el mensaje recibido.
  - Endpoint `/api/var/mix/{product}/{id}` devuelve un JSON con los valores `product` e `id` recibidos en la URL.
- **Parámetros de solicitud** (`@RequestParam`):
  - Endpoint `/api/params/foo` recibe un mensaje opcional, devolviendo un valor por defecto si no se proporciona.
  - Endpoint `/api/params/bar` recibe dos parámetros y los devuelve en una respuesta estructurada.
  - Endpoint `/api/params/request` maneja los parámetros desde el objeto `HttpServletRequest`.
- **Manejo de usuarios**: Vista que muestra detalles de un usuario (`/details`) y un listado de usuarios (`/list`).
- **Configuración de propiedades** (`@Value` y `Environment`): Acceso a valores definidos en el archivo `values.properties`.

### 🛠️ Tecnologías utilizadas
- **Java 17**
- **Spring Boot**
- **Thymeleaf** para la integración de vistas
- **Maven** como herramienta de construcción 📦
- **Jakarta Servlet** para manejar solicitudes HTTP 🚀

### ⚙️ Configuración
El proyecto utiliza un archivo de propiedades (`values.properties`) para almacenar valores de configuración como códigos, mensajes, listas y mapas de valores. Estos valores se inyectan en los controladores usando `@Value` y `Environment`, lo que facilita personalizar el comportamiento de la aplicación.

#### Archivo `values.properties`:
```
config.code=23232
config.username=nacho
config.message=Hola que tal como estás
config.listOfValues=hola,que,tal,hoy
config.valuesMap={product: 'Cpu Intel Core i7 12th', description: 'Alder Lake, 12 core, a 5 GHz', price: '1000'}
```

### 📂 Estructura del proyecto
- `controllers` - Contiene los controladores de vistas y API REST para manejar diferentes endpoints.
- `models` - Clases que representan el modelo de la aplicación (`User`, `ParamDto`, etc.).
- `dto` - Clases de transferencia de datos para estructurar las respuestas de la API (`ParamDto`, `ParamMixDto`, `UserDto`).
