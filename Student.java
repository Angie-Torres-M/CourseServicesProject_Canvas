package com.generation.courses;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String id;
    private String name;
    private List<Course> enrolledCourses;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }


    // MÉTODOS 

    public void enroll(Course course) {
        // Agregar el curso si aún no está inscrito

        if (course == null) {
            System.out.println("No se puede inscribir un curso nulo.");
            return;
        }

        // Evitamos duplicados por ID
        for (Course c : enrolledCourses) {
            if (c.getId().equals(course.getId())) {
                System.out.println("El estudiante ya está inscrito en el curso: " + course.getName());
                return;
            }
        }

        enrolledCourses.add(course);
        System.out.println("Curso " + course.getName() + " inscrito para el estudiante " + name);
    }

    public void unEnroll(Course course) {
        // Quitar el curso de la lista si existe

        if (course == null) {
            System.out.println("No se puede desinscribir un curso nulo.");
            return;
        }

        boolean removed = enrolledCourses.removeIf(c -> c.getId().equals(course.getId()));

        if (removed) {
            System.out.println("Curso " + course.getName() + " desinscrito para el estudiante " + name);
        } else {
            System.out.println("El estudiante " + name + " no estaba inscrito en el curso: " + course.getName());
        }
    }

    public int totalEnrolledCourses() {
        // Regresa el número de cursos en la lista
        return enrolledCourses.size();
    }
    
    public int totalCredits() {
        int total = 0;

        for (Course c : enrolledCourses) {
            total += c.getCredits();   // sumar cada crédito
        }

        return total;
    }
 


    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", totalCursos=" + totalEnrolledCourses() +
                '}';
    }
}
