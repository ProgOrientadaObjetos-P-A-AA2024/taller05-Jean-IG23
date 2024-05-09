package Ejecutor;

import Jean.Estudiante;
import java.util.Scanner;

public class ejecutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        Estudiante[] estudiantes = new Estudiante[100];
        int contadorEstudiantes = 0;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Crear estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    scanner.nextLine();
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la calificación de la materia 1: ");
                    double califMateria1 = scanner.nextDouble();
                    System.out.print("Ingrese la calificación de la materia 2: ");
                    double califMateria2 = scanner.nextDouble();
                    System.out.print("Ingrese la calificación de la materia 3: ");
                    double califMateria3 = scanner.nextDouble();

                    estudiantes[contadorEstudiantes] = new Estudiante(nombre, califMateria1,
                            califMateria2, califMateria3);
                    contadorEstudiantes++;
                    System.out.println("Estudiante creado con éxito.");
                    break;
                case 2:
                    System.out.println("\nEstudiantes registrados:");
                    for (int i = 0; i < contadorEstudiantes; i++) {
                        Estudiante estudiante = estudiantes[i];
                        System.out.println("Nombre: " + estudiante.obtenerNombre());
                        System.out.println("Calificación Materia 1: " + estudiante.obtenerCalifMateria1());
                        System.out.println("Calificación Materia 2: " + estudiante.obtenerCalifMateria2());
                        System.out.println("Calificación Materia 3: " + estudiante.obtenerCalifMateria3());
                        System.out.println("Promedio de estudiante:"+ estudiante.calcularPromedio());
                        System.out.println("-------------------------");
                    }
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 3);
    }
}
