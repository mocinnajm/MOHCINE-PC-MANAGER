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