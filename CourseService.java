package com.generation.courses;

import java.util.HashMap;
import java.util.Map;

public class CourseService {

    // Ahora usamos Map/HashMap en vez de List
    private Map<String, Student> students;
    private Map<String, Course> courses;

    public CourseService() {
        this.students = new HashMap<>();
        this.courses = new HashMap<>();
    }

    
    // MÉTODOS PARA AGREGAR DATOS
    
    public void addStudent(Student student) {
        // clave = id del estudiante
        students.put(student.getId(), student);
    }

    public void addCourse(Course course) {
        // clave = id del curso
        courses.put(course.getId(), course);
    }


    // LISTA DE CURSOS (TABLA)

    public void displayAllCourses() {
        System.out.println("=== Lista de Cursos Disponibles ===");
        System.out.println("+--------+---------------------------+----------+");
        System.out.printf("| %-6s | %-25s | %-8s |\n", "ID", "Nombre", "Créditos");
        System.out.println("+--------+---------------------------+----------+");

        for (Course c : courses.values()) {   // aquí usamos values() del Map
            System.out.printf("| %-6s | %-25s | %-8d |\n",
                    c.getId(), c.getName(), c.getCredits());
        }

        System.out.println("+--------+---------------------------+----------+");
    }


    // MÉTODOS PRINCIPALES


    public void enrollStudent(String studentId, String courseId) {
        // En HashMap usamos get(clave)
        Student student = students.get(studentId);
        Course course = courses.get(courseId);

        if (student == null) {
            System.out.println("No se encontró al estudiante con id: " + studentId);
            return;
        }

        if (course == null) {
            System.out.println("No se encontró el curso con id: " + courseId);
            return;
        }

        student.enroll(course);
        System.out.println("Curso " + course.getName() +
                " inscrito para el estudiante " + student.getName());
    }

    public void unEnrollStudent(String studentId, String courseId) {
        Student student = students.get(studentId);
        Course course = courses.get(courseId);

        if (student == null) {
            System.out.println("No se encontró al estudiante con id: " + studentId);
            return;
        }

        if (course == null) {
            System.out.println("No se encontró el curso con id: " + courseId);
            return;
        }

        student.unEnroll(course);
        System.out.println("Se dio de baja el curso " + course.getName() +
                " para el estudiante " + student.getName());
    }

    public void displayCourseInformation(String courseId) {
        Course course = courses.get(courseId);

        if (course == null) {
            System.out.println("No se encontró el curso con id: " + courseId);
            return;
        }

        System.out.println("===== Información del curso =====");
        System.out.println("ID: " + course.getId());
        System.out.println("Nombre: " + course.getName());
        System.out.println("Créditos: " + course.getCredits());
        System.out.println("=================================");
    }

    public void displayStudentInformation(String studentId) {
        Student student = students.get(studentId);

        if (student == null) {
            System.out.println("No se encontró al estudiante con id: " + studentId);
            return;
        }

        System.out.println("===== Información del estudiante =====");
        System.out.println("ID: " + student.getId());
        System.out.println("Nombre: " + student.getName());
        System.out.println("Cursos inscritos:");

        if (student.getEnrolledCourses().isEmpty()) {
            System.out.println("  (Sin cursos inscritos)");
        } else {
            for (Course c : student.getEnrolledCourses()) {
                System.out.println("  - " + c.getId() + " | " + c.getName()
                        + " (" + c.getCredits() + " créditos)");
            }
        }
        System.out.println("Total de cursos: " + student.totalEnrolledCourses());
        System.out.println("Total de créditos: " + student.totalCredits());

        
        System.out.println("======================================");
    }
}
