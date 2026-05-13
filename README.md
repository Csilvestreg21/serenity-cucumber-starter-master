# Proyecto de Automatización - SauceDemo con Serenity BDD

Este proyecto es una solución de automatización de pruebas para el portal SauceDemo, desarrollada bajo los estándares de calidad de SQA. Se utiliza el patrón de diseño Screenplay, que permite crear pruebas mantenibles, legibles y altamente escalables.

## 🛠️ Tecnologías y Herramientas

```Gherkin
* Lenguaje: Java 17+.
* Framework: Serenity BDD.
* BDD: Cucumber con Gherkin.
* Patrón de Diseño: Screenplay.
* Gestor de Dependencias: Gradle.
```

## 📁 Estructura del Proyecto
El proyecto sigue la estructura estándar de Serenity, optimizada para la claridad técnica:

```Gherkin
src
  + main
  + test
    + java                        # Runners y definiciones de pasos (Glue code)
    + resources
      + features                  # Escenarios de prueba en lenguaje Gherkin
             login.feature        # Escenario de inicio de sesión de SauceDemo
```

## 🚀 Ejecución de las Pruebas
Para ejecutar la automatización en tu equipo (macOS) y generar el reporte de evidencias, utiliza el siguiente comando en la terminal:

```Gherkin
./gradlew clean test aggregate
```

## 📊 Reportes y Evidencia Visual
Una vez finalizada la ejecución, puedes encontrar el reporte detallado con las capturas de pantalla de cada paso en:

```Gherkin
target/site/serenity/index.html
```

+ Se ha configurado el archivo serenity.properties para incluir:
+ Capturas por acción: Cada clic e interacción queda registrado visualmente.
+ Retraso de pasos (Delay): Configurado en 1000ms para asegurar que las imágenes sean claras para la auditoría de calidad.

## 📋 Escenario Principal (Gherkin)

```Gherkin
Característica: Inicio de sesión en SauceDemo

  Escenario: Inicio de sesión exitoso
    Dado que el actor se encuentra en la página de inicio de sesión
    Cuando ingresa sus credenciales de acceso
    Entonces debería ver el catálogo de productos
```

## 👤 Información del Desarrollador
+ Nombre: Catalina Silvestre
+ Rol: QA Automation Analyst / Ingeniera de Sistemas
+ Repositorio: Csilvestreg2