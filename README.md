 ## Course Services Project – Java (POO)

Este proyecto implementa un sistema básico de gestión de cursos utilizando Programación Orientada a Objetos (POO) en Java.

##  Estructura del proyecto

```
   src/
      ├── Course.java
      ├── Student.java
      ├── CourseService.java
      └── Main.java
```

---

##  Clases principales

### Course

Modelo de datos que representa un curso.

* `id`
* `name`
* `credits`

### Student

Representa a un estudiante y administra su lista de cursos inscritos.

* `enroll(Course c)`
* `unEnroll(Course c)`
* `totalEnrolledCourses()`

### CourseService

Capa de negocio que gestiona estudiantes y cursos registrados.

* `addStudent()`
* `addCourse()`
* `enrollStudent()`
* `unEnrollStudent()`
* `displayCourseInformation()`
* `displayStudentInformation()`

### Main

Punto de entrada del programa.
Crea estudiantes, cursos, el servicio y prueba la funcionalidad del sistema.

---

##  Ejecución

1. Crear un proyecto Java en Eclipse/IntelliJ.
2. Copiar las clases anteriores en el package `com.generation.courses`.
3. Ejecutar `Main.java`.

---

##  Diagrama UML

```
Student 1 ---- * Course
CourseService 1 ---- * Student
CourseService 1 ---- * Course
```

---

##  Conceptos aplicados

* Programación Orientada a Objetos (POO)
* Relaciones 1 a muchos
* Encapsulamiento
* Listas (`ArrayList`)
* Búsqueda por ID
* Separación de responsabilidades
* Servicio como capa de negocio

---

##  Objetivo educativo

Este proyecto sirve como práctica para comprender:

* Cómo crear clases y objetos
* Cómo hacer que las clases colaboren entre sí
* Cómo modelar entidades reales en Java
* Cómo construir un pequeño sistema administrable

---

##  Autor

Angie Torres — Proyecto educativo (Java OOP)


