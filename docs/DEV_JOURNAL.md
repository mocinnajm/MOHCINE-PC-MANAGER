# Development Journal

## 26/07/2026

### Objetivo

Crear la base documental del proyecto MOHCINE-PC-MANAGER.

### Trabajo realizado

- Creada estructura inicial del repositorio.
- Configurado Git.
- Conectado repositorio local con GitHub.
- Creado documento ROADMAP.md.
- Publicada documentación inicial.

### Conceptos aprendidos

- Diferencia entre directorios y archivos.
- Uso de mkdir para crear carpetas.
- Uso de New-Item para crear archivos.
- Flujo básico de Git:
  - git add
  - git commit
  - git push

### Problemas encontrados

Confusión inicial entre crear carpetas y crear archivos.

### Solución

Aprendido:

- mkdir → crear directorios.
- New-Item → crear archivos.

### Próximo objetivo

Diseñar la arquitectura inicial del motor de diagnóstico.
## 26/07/2026 - Primera ejecución Java

- Creada estructura profesional de paquetes Java.
- Añadida clase App como punto de entrada.
- Creada clase SystemInfo para obtener información del sistema.
- Configurado .gitignore para archivos compilados.
- Primera compilación y ejecución correcta con Java 21.
## 26/07/2026

### Sprint 2 - Información del sistema

#### Funcionalidades añadidas

- Se implementó la clase `SystemInfo` para mostrar información del sistema.
- Se añadió monitorización de la memoria de la JVM mediante la clase `Runtime`.
- Se muestra la memoria total, libre y utilizada en MB.
- Se añadió información del disco mediante la clase `File`.
- Se muestra el espacio total y libre de la unidad principal en GB.

#### Aprendizajes

- Diferencia entre la memoria de la JVM y el almacenamiento del disco.
- Uso de la clase `Runtime` para acceder a la memoria de la JVM.
- Uso de la clase `File` para obtener información del sistema de archivos.
- Conversión de bytes a MB y GB para mostrar información legible.

#### Verificación

- Proyecto compilado correctamente con `javac`.
- Aplicación ejecutada correctamente desde la terminal.
- Información comprobada comparando los resultados con PowerShell.
## 26/07/2026

### Sprint 3 - Refactorización de memoria JVM

#### Mejoras realizadas

- Creada clase `MemoryInfo` con responsabilidad exclusiva sobre la memoria JVM.
- Eliminada lógica de memoria de `SystemInfo`.
- Implementado cálculo de memoria usada mediante total - libre.
- Añadida conversión reutilizable de bytes a MB.
- Mejorada la separación de responsabilidades del sistema.

#### Aprendizajes

- Aplicación del principio de responsabilidad única (SRP).
- Reducción del acoplamiento entre clases.
- Uso de clases especializadas para facilitar mantenimiento futuro.
## 26/07/2026

### Sprint 4 - Refactorización de información del disco

#### Mejoras realizadas

- Creada la clase `DiskInfo` con responsabilidad exclusiva sobre la información del almacenamiento.
- Eliminada la lógica de disco de la clase `SystemInfo`.
- Implementados métodos para obtener el espacio total y espacio libre del disco.
- Integrada la clase `DiskInfo` dentro de `SystemInfo`.
- Mejorada la separación de responsabilidades del sistema.

#### Aprendizajes

- Aplicación del principio de responsabilidad única (SRP).
- Uso de clases especializadas para reducir la complejidad de las clases principales.
- Separación entre clases coordinadoras y clases encargadas de obtener información específica.
- Importancia de probar cada componente antes de integrarlo en la aplicación.

#### Verificación

- Clase `DiskInfo` probada de forma independiente mediante `TestDisk`.
- Proyecto compilado correctamente con `javac`.
- Aplicación ejecutada correctamente desde la clase principal `App`.
- Información del disco comprobada comparando los resultados con PowerShell.
## 27/07/2026

### Sprint 5 - Arquitectura de análisis del sistema

#### Mejoras realizadas

- Creada la clase `SystemMetrics` para representar una fotografía del estado del sistema.
- Creada la clase `HealthAnalyzer` para analizar el estado del equipo.
- Separadas las responsabilidades entre obtención de datos, almacenamiento de datos y análisis.
- Implementada la primera lógica de diagnóstico para memoria y disco.
- Verificada la arquitectura mediante la clase temporal `TestHealth`.

#### Aprendizajes

- Diferencia entre obtener datos y analizarlos.
- Introducción de una capa de modelo (`model`) para transportar información entre componentes.
- Aplicación de una arquitectura por capas (`system`, `model`, `analysis`).
- Importancia de diseñar pensando en la evolución futura del proyecto.

#### Verificación

- Compilación correcta con `javac`.
- Prueba independiente de `HealthAnalyzer` mediante `TestHealth`.
- Resultados esperados obtenidos durante la ejecución.
## 27/07/2026

### Sprint 6 - Métricas del sistema y refactorización del análisis

#### Mejoras realizadas

- Creada clase `DiskInfo` con responsabilidad exclusiva sobre la información del disco.
- Añadido cálculo del porcentaje libre del disco mediante `double`.
- Evolucionada la clase `SystemMetrics` para trabajar con porcentajes en lugar de valores absolutos.
- Actualizado `HealthAnalyzer` para analizar porcentajes de uso de memoria y disco.
- Mejorada la arquitectura separando recopilación de datos y toma de decisiones.
- Verificada la compilación completa del proyecto.

#### Aprendizajes

- Diferencia entre valores absolutos y porcentajes para realizar diagnósticos más fiables.
- Importancia de separar:
  - recopilación de información;
  - almacenamiento de métricas;
  - análisis de estado.
- Aplicación del principio de responsabilidad única (SRP).
- Uso de `double` para cálculos con valores decimales.

#### Verificación

- Compilación completa realizada correctamente.
- Aplicación ejecutada correctamente.
- Información de memoria y disco comprobada en Windows 11.
## 28/07/2026

### Sprint 7 - Integración del sistema de diagnóstico

#### Mejoras realizadas

- Integrada la clase `SystemInfo` con los módulos de información del sistema.
- `MemoryInfo` gestiona la obtención de datos y porcentajes de memoria JVM.
- `DiskInfo` gestiona información del almacenamiento y porcentajes de uso.
- Creada la conexión entre `SystemMetrics` y `HealthAnalyzer`.
- Implementado análisis automático del estado del equipo.
- El sistema ahora puede determinar el estado de memoria y disco mediante reglas de salud.

#### Arquitectura actual
SystemInfo
|
|-- MemoryInfo
|
|-- DiskInfo
|
|-- SystemMetrics
|
v
HealthAnalyzer

#### Aprendizajes

- Separación de responsabilidades entre obtención de datos y análisis.
- Uso de clases especializadas para evitar duplicación de código.
- Importancia de trabajar con porcentajes para comparar diferentes equipos.
- Aplicación práctica del principio de responsabilidad única (SRP).
- Flujo de información entre objetos en Java.

#### Resultado

El sistema muestra información del ordenador y genera un diagnóstico automático:

- Memoria: Excelente
- Disco: Excelente
## 28/07/2026

### Sprint 8 - Mejora del sistema de estados de salud

#### Mejoras realizadas

- Creado el enum `HealthStatus` para representar estados del sistema.
- Separada la lógica de decisión de la presentación de resultados.
- `HealthAnalyzer` ahora devuelve estados en lugar de textos.
- Añadida descripción humana a cada estado.
- Eliminados números mágicos del análisis mediante constantes.
- Mejorada la mantenibilidad del código.

#### Aprendizajes

- Uso de enumeraciones (`enum`) para representar estados controlados.
- Separación entre lógica de negocio y presentación.
- Uso de constantes para reglas del sistema.
- Mejora de legibilidad y mantenimiento del código.

#### Resultado

El sistema analiza las métricas obtenidas y genera un diagnóstico:

- Memoria: Excelente
- Disco: Excelente
## Sprint 9 - Mejora visualización de métricas del sistema

### Objetivo

Mejorar la información mostrada al usuario añadiendo porcentajes de uso y disponibilidad de memoria y disco.

### Cambios realizados

- Añadida visualización del porcentaje de memoria usada.
- Añadida visualización del porcentaje de memoria libre.
- Añadida visualización del porcentaje de disco usado.
- Añadida visualización del porcentaje de disco libre.
- Utilizado `String.format("%.2f")` para mostrar valores decimales con dos cifras.
- Mejorada la legibilidad de la información mostrada por `SystemInfo`.

### Arquitectura actual

El flujo de información queda organizado de la siguiente manera:

Sistema operativo
↓
MemoryInfo / DiskInfo
↓
SystemMetrics
↓
HealthAnalyzer
↓
HealthStatus
↓
SystemInfo
↓
Usuario

### Aprendizajes

- Diferencia entre obtener datos y presentar información.
- Uso de métodos existentes para reutilizar cálculos.
- Importancia de mostrar información preparada para el usuario.
- Formateo de números decimales en Java mediante `String.format`.
- Continuación de la separación de responsabilidades entre clases.

### Resultado

El sistema ahora muestra información más completa:

- Porcentaje de memoria utilizada.
- Porcentaje de memoria disponible.
- Porcentaje de disco ocupado.
- Porcentaje de espacio libre.

Ejemplo de salida:

Memoria:
- Uso: 1,13 %
- Libre: 98,69 %

Disco:
- Uso: 40,87 %
- Libre: 59,13 %

El diagnóstico continúa funcionando correctamente:

- Memoria: Excelente.
- Disco: Excelente.
## Sprint 10 - HealthReport y mejora del diagnóstico

**Fecha:** 29/07/2026

### Objetivo

Mejorar el sistema de diagnóstico para que no solo devuelva un estado de salud, sino también información detallada sobre el resultado del análisis.

### Trabajo realizado

* Se creó la clase `HealthReport` en `core/model`.
* `HealthReport` almacena:

  * `HealthStatus`
  * Mensaje descriptivo
  * Valor analizado
* Se modificó `HealthAnalyzer` para devolver un objeto `HealthReport` en lugar de únicamente `HealthStatus`.
* Se actualizó `SystemInfo` para mostrar:

  * Estado del diagnóstico
  * Mensaje explicativo
  * Valor analizado
* Se verificó la compilación y la ejecución correcta del proyecto.

### Resultado

Salida actual del diagnóstico:

```text
----- DIAGNÓSTICO -----

Memoria: EXCELLENT
Mensaje: El consumo de memoria es correcto.
Valor analizado: 1,31 %

Disco: EXCELLENT
Mensaje: Existe suficiente espacio libre en el disco.
Valor analizado: 59,04 %
```

### Aprendizajes

Durante este sprint se reforzó el principio de separación de responsabilidades:

* `MemoryInfo` y `DiskInfo` obtienen datos del sistema.
* `SystemMetrics` agrupa las métricas.
* `HealthAnalyzer` analiza las métricas.
* `HealthReport` representa el resultado del análisis.
* `SystemInfo` presenta la información al usuario.

Esta arquitectura facilita la ampliación del proyecto con nuevos componentes como CPU, batería, red o temperatura sin modificar la estructura existente.
## Sprint 11 - Integración inicial de CPUInfo

**Fecha:** 30/07/2026

### Objetivo

Comenzar la integración del componente encargado de obtener información de la CPU.

### Trabajo realizado

* Se creó la clase `CPUInfo`.
* Se añadieron los atributos:

  * `architecture`
  * `availableProcessors`
* Se implementaron los getters correspondientes.
* Se integró `CPUInfo` dentro de `SystemInfo`.
* Se añadió una nueva sección "CPU" en la salida de la aplicación mostrando:

  * Arquitectura del sistema.
  * Número de procesadores disponibles para la JVM.
* Se verificó la compilación y la ejecución sin errores.

### Resultado

La aplicación muestra correctamente la información de la CPU junto con la memoria, el disco y el diagnóstico del sistema.

### Próximos pasos

Ampliar `CPUInfo` para obtener información más detallada del procesador y preparar su integración con el sistema de análisis.
## Sprint 11 - Refactorización de CPUInfo con toString()

**Fecha:** 01/08/2026

### Objetivo

Mejorar el diseño de la clase `CPUInfo` para que sea responsable de representar su propia información.

### Trabajo realizado

* Se implementó el método `toString()` en la clase `CPUInfo`.
* Se simplificó la clase `SystemInfo`, eliminando la impresión individual de cada atributo de la CPU.
* Ahora `SystemInfo` únicamente imprime el objeto `CPUInfo`, delegando la representación de la información en la propia clase.

### Resultado

La salida de la aplicación permanece exactamente igual, pero el código es más limpio y fácil de mantener.

### Aprendizajes

Se aplicó una refactorización basada en el principio de responsabilidad única (Single Responsibility Principle). Cada clase es responsable de representar su propia información, reduciendo el acoplamiento entre componentes.
## Sprint 12

### Objetivo
Implementar la exportación del informe del sistema a un archivo de texto.

### Trabajo realizado
- Creada la clase ReportExporter.
- Implementado el método export().
- Uso de FileWriter para generar system_report.txt.
- Integrado SystemSummary con ReportExporter.
- Exportadas las secciones:
  - Información del sistema
  - Memoria
  - Disco
  - CPU
  - Diagnóstico

### Resultado
El programa genera automáticamente un informe completo del estado del equipo.
## Sprint 13 - Fecha y hora separadas

### Objetivo
Separar la fecha y la hora en el informe del sistema para mejorar la legibilidad.

### Trabajo realizado
- Se añadieron los métodos `getCurrentDate()` y `getCurrentTime()` en `DateTimeInfo`.
- Se modificó `SystemInfo` para mostrar la fecha y la hora en líneas independientes.
- Se verificó el funcionamiento mediante compilación y ejecución del proyecto.

### Problemas encontrados
- Error de compilación porque los métodos `getCurrentDate()` y `getCurrentTime()` no existían.
- Confusión inicial entre `Date`, `LocalDate`, `LocalTime` y `LocalDateTime`.

### Aprendizajes
- Diferencia entre `LocalDate`, `LocalTime` y `LocalDateTime`.
- Uso de `DateTimeFormatter` con distintos patrones.
- Importancia de investigar un error antes de modificar el código.
- Aplicación del principio de responsabilidad única: `DateTimeInfo` obtiene y formatea la información; `SystemInfo` decide cómo mostrarla.
### Reflexión personal

En esta misión trabajé el proceso de traducir una idea a Java sin copiar el código directamente. Descubrí que, siguiendo un proceso de análisis y utilizando pequeñas pistas, puedo construir la solución por mí mismo. También comprendí que los desarrolladores no memorizan todo el código, sino que reutilizan patrones y resuelven los problemas paso a paso.







