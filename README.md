<p>
  <img src="https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png" width="300"/>
</p>

# 🧠 S3 - Llanquihue Tour

Proyecto desarrollado para la asignatura **Desarrollo Orientado a Objetos I (PRY2202)** de Duoc UC.

---

## 📖 Descripción

Este proyecto implementa un modelo orientado a objetos para representar personas vinculadas a una agencia de turismo.

Se aplican conceptos fundamentales de Programación Orientada a Objetos como:

* Encapsulamiento
* Composición
* Herencia
* Constructores
* Método `toString()`

El caso de estudio corresponde a la agencia de turismo **Llanquihue Tour**.

---

## 📁 Estructura del Proyecto

```text
src/
├── app/
│   └── Main.java
│
└── model/
│   ├── Direccion.java
│   ├── Persona.java
│   ├── Rut.java
│   └── Empleado.java
│
└── util/
    └── InvalidRutException.java
```

---

## 🚀 Ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Compilar el proyecto.
3. Ejecutar la clase `Main`.
4. Verificar la salida por consola.

---

## 🧩 Clases Implementadas

### Direccion

Representa la dirección asociada a una persona.

### Persona

Clase base que almacena información general de una persona.

### Rut

Permite almacenar y validar el RUT de una persona.

### InvalidRutException

Excepción personalizada utilizada cuando el RUT ingresado no cumple con el formato esperado.

### Empleado

Clase derivada de Persona que incorpora una especialidad.

### Main

Clase principal utilizada para probar el funcionamiento del sistema.

---

## ☕ Requisitos

* Java JDK 25 o superior.
* IntelliJ IDEA Community Edition.

---

## 👨‍💻 Autor

Michael Salgado

Desarrollo Orientado a Objetos I - Duoc UC
