# HerenciaPOO

Este proyecto es una simulación simple de un sistema de biblioteca usando Programación Orientada a Objetos (POO) en Java. Se implementan clases como Usuario, Cliente, Administrador, Libro y Préstamo, basadas en un diagrama UML.

## ¿Cómo usarlo?

1. Abre una terminal en la carpeta `src`.
2. Compila el código con:
   ```bash
   javac *.java
   ```
3. Ejecuta el programa:
   ```bash
   java Main
   ```

## Clases principales

- **Usuario**: clase base con ID, nombre y correo.
- **Cliente**: hereda de Usuario.
- **Administrador**: puede registrar clientes, libros y hacer préstamos.
- **Libro**: representa un libro.
- **Prestamo**: contiene la lógica de un préstamo con estado y fechas.

---
Hecho por: Carlos Manuel Turizo Hernández