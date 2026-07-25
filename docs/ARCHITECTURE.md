# Software Architecture

## Project

MOHCINE-PC-MANAGER

Sistema de gestión y diagnóstico del equipo Windows.

---

# Architecture Overview

El proyecto estará organizado por responsabilidades.

## src

Contendrá el código fuente principal de la aplicación.

---

# Main Components

## Core

Responsable de la lógica principal del sistema.

Ejemplos:

- configuración global
- gestión del sistema
- servicios principales
- modelos de datos

---

## Modules

Contendrá funcionalidades independientes.

Ejemplos:

- análisis del hardware
- análisis del software instalado
- limpieza del sistema
- optimización

---

## Reports

Responsable de generar informes.

Ejemplos:

- informes HTML
- informes JSON
- informes PDF
- históricos de diagnóstico

---

## Utils

Herramientas auxiliares reutilizables.

Ejemplos:

- manejo de archivos
- logs
- validaciones
- funciones comunes

---

## UI

Capa de interacción con el usuario.

Ejemplos:

- interfaz gráfica
- menús
- presentación de resultados

---

# Development Principles

- Código organizado por responsabilidades.
- Documentación antes de implementar.
- Control de versiones con Git.
- Cambios pequeños y bien documentados.
- Código mantenible y escalable.
## 5. Estructura del código fuente

El proyecto está organizado siguiendo una arquitectura modular para separar responsabilidades y facilitar el mantenimiento, escalabilidad y futuras ampliaciones.

La estructura principal dentro de `src` será:
src
│
├── Core
│ ├── Hardware
│ ├── System
│ ├── Storage
│ └── Security
│
├── Modules
│ ├── Diagnostics
│ ├── Cleanup
│ ├── Optimization
│ └── Software
│
├── Reports
│ ├── Generator
│ └── Templates
│
├── UI
│
└── Utils
├── Logger
├── Export
└── Helpers

### Core

Contiene los componentes principales del sistema.

Responsabilidades:

- Detección de hardware.
- Obtención de información del sistema operativo.
- Análisis del almacenamiento.
- Comprobaciones relacionadas con seguridad.

### Modules

Contiene funcionalidades independientes del programa.

Ejemplos:

- Diagnóstico general del equipo.
- Limpieza de archivos temporales.
- Recomendaciones de optimización.
- Gestión del software instalado.

### Reports

Gestiona la creación de informes generados por la aplicación.

Permitirá crear:

- Informes HTML.
- Informes PDF.
- Resúmenes de diagnóstico.

### UI

Contiene la interfaz de usuario.

Inicialmente podrá funcionar mediante consola y posteriormente evolucionar hacia una interfaz gráfica.

### Utils

Contiene herramientas comunes reutilizables:

- Sistema de logs.
- Gestión de archivos.
- Exportación de datos.
- Funciones auxiliares.