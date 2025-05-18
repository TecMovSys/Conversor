## 👤 Autor

Desarrollado por **CshinoDev**  
GitHub: [TecMovSys](https://github.com/TecMovSys)  
Repositorio: [Conversor](https://github.com/TecMovSys/Conversor)

## **AluraLatam**
####  **Gracias a su apoyo academico en mi desarrollo profesional.**
Este Challenge fue desarrollado como parte de un curso en **[AluraLatam](https://app.aluracursos.com/)**  


# Conversor de Moneda en Java

Este es un proyecto de consola en Java que permite convertir entre diferentes monedas utilizando la **ExchangeRate API** y la librería **Gson 2.13.1** para procesar respuestas en formato JSON.

## 💡 Funcionalidades

El programa presenta un menú interactivo con las siguientes opciones:

1. Dólar a Peso argentino
2. Peso argentino a Dólar
3. Dólar a Real brasileño
4. Real brasileño a Dólar
5. Dólar a Peso colombiano
6. Peso colombiano a Dólar
7. Salir

El usuario ingresa una cantidad y el programa realiza la conversión mostrando el resultado.

## 🔧 Requisitos

- Java 11 o superior
- Archivo `gson-2.13.1.jar` (añadido al classpath)
- Conexión a internet (la aplicación consulta datos en tiempo real desde la API)

## 🔗 Tecnologías utilizadas

- [ExchangeRate API](https://www.exchangerate-api.com/)
- [Gson 2.13.1](https://github.com/google/gson)

## 🚀 Cómo compilar y ejecutar

### Compilación

```bash
javac -cp gson-2.13.1.jar AppConversor.java Conversor.java
