package com.generation.courses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CourseService courseService = new CourseService();

        // Puedes seguir creando algunos cursos base
        courseService.addCourse(new Course("C001", "Java Básico", 5));
        courseService.addCourse(new Course("C002", "Desarrollo Web", 4));
        courseService.addCourse(new Course("C003", "Bases de Datos", 3));

        int opcion;

        do {
        	System.out.println("=== Menú Cursos ===");
        	System.out.println("1) Registrar estudiante");
        	System.out.println("2) Inscribir estudiante a curso");
        	System.out.println("3) Ver información de estudiante");
        	System.out.println("4) Ver información de curso");
        	System.out.println("5) Dar de baja un curso a un estudiante");
        	System.out.println("0) Salir");

            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("ID del estudiante: ");
                    String idEst = scanner.nextLine();

                    System.out.print("Nombre del estudiante: ");
                    String nombreEst = scanner.nextLine();

                    Student nuevo = new Student(idEst, nombreEst);
                    courseService.addStudent(nuevo);
                    System.out.println("Estudiante registrado.\n");
                    break;

                case 2:
                    System.out.print("ID del estudiante a inscribir: ");
                    String idEstEnroll = scanner.nextLine();

                    courseService.displayAllCourses();

                    System.out.print("ID del curso: ");
                    String idCourseEnroll = scanner.nextLine();

                    courseService.enrollStudent(idEstEnroll, idCourseEnroll);
                    System.out.println("Inscripción procesada.\n");
                    break;


                case 3:
                    System.out.print("ID del estudiante: ");
                    String idEstInfo = scanner.nextLine();
                    courseService.displayStudentInformation(idEstInfo);
                    break;

                case 4:
                    System.out.print("ID del curso: ");
                    String idCourseInfo = scanner.nextLine();
                    courseService.displayCourseInformation(idCourseInfo);
                    break;
                    
                case 5:
                    System.out.print("ID del estudiante: ");
                    String idEstUn = scanner.nextLine();

                    // Puedes mostrar primero los cursos del estudiante, si quieres:
                    courseService.displayStudentInformation(idEstUn);

                    System.out.print("ID del curso a dar de baja: ");
                    String idCourseUn = scanner.nextLine();

                    courseService.unEnrollStudent(idEstUn, idCourseUn);
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida\n");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
