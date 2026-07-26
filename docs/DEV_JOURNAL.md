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
