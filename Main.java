package Actividad1;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue processQueue = new Queue();

        int option;
        do {
            System.out.println("\n--- Simulador de Procesos (Máximo 10) ---");
            System.out.println("1. Agregar proceso");
            System.out.println("2. Ejecutar proceso");
            System.out.println("3. Ver siguiente proceso");
            System.out.println("4. Mostrar todos los procesos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Ingrese el nombre del proceso: ");
                    String process = scanner.nextLine();

                    // Contar procesos actuales
                    int count = 0;
                    Queue tempQueue = new Queue();
                    while (!processQueue.isEmpty()) {
                        String p = processQueue.dequeue();
                        tempQueue.enqueue(p);
                        count++;
                    }
                    // Restaurar
                    while (!tempQueue.isEmpty()) {
                        processQueue.enqueue(tempQueue.dequeue());
                    }

                    if (count < 10) {
                        processQueue.enqueue(process);
                        System.out.println("Proceso agregado: " + process);
                    } else {
                        System.out.println("No se pueden agregar más procesos (límite alcanzado).");
                    }
                    break;

                case 2:
                    String executed = processQueue.dequeue();
                    if (executed != null) {
                        System.out.println("Proceso ejecutado: " + executed);
                    } else {
                        System.out.println("No hay procesos para ejecutar.");
                    }
                    break;

                case 3:
                    String next = processQueue.peek();
                    if (next != null) {
                        System.out.println("Siguiente proceso: " + next);
                    } else {
                        System.out.println("No hay procesos en la cola.");
                    }
                    break;

                case 4:
                    System.out.println("Procesos en cola:");
                    processQueue.display();
                    break;

                case 0:
                    System.out.println("Saliendo del simulador...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (option != 0);

        scanner.close();
    }
}
