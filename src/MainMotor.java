import java.util.Scanner;

// EJERCICIO 3: ingreso de 1 en 1 mientras haya espacio;
// las demás opciones piden el índice del elemento a operar
public class MainMotor {

    public static void main(String[] args) {
        String codigo;
        int opc, pos, vel;

        final int MAX = 3;
        Motor motores[] = new Motor[MAX];
        int indice = 0;   // cantidad de motores ingresados
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n===== CONTROL DE MOTORES =====");
            System.out.println("1. Agregar motor");
            System.out.println("2. Encender un motor");
            System.out.println("3. Apagar un motor");
            System.out.println("4. Ajustar velocidad de un motor");
            System.out.println("5. Mostrar un motor");
            System.out.println("6. Mostrar todos los motores");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opc = Integer.parseInt(sc.nextLine());

            switch (opc) {
                case 1:
                    // ingreso de 1 en 1
                    if (indice < MAX) {
                        System.out.print("Ingrese el código del motor: ");
                        codigo = sc.nextLine();
                        motores[indice++] = new Motor(codigo);
                        System.out.println("Motor agregado en la posición " + (indice - 1) + ".");
                    } else {
                        System.out.println("No hay más memoria");
                    }
                    break;

                case 2:
                case 3:
                case 4:
                case 5:
                    if (indice == 0) {
                        System.out.println("No hay motores registrados.");
                        break;
                    }
                    System.out.print("Ingrese el índice del motor (0 a " + (indice - 1) + "): ");
                    pos = Integer.parseInt(sc.nextLine());
                    if (pos < 0 || pos >= indice) {
                        System.out.println("Índice inválido.");
                        break;
                    }

                    if (opc == 2) {
                        motores[pos].encender();
                    } else if (opc == 3) {
                        motores[pos].apagar();
                    } else if (opc == 4) {
                        System.out.print("Ingrese la nueva velocidad (0-100): ");
                        vel = Integer.parseInt(sc.nextLine());
                        motores[pos].ajustarVelocidad(vel);
                    } else {
                        motores[pos].mostrarEstado();
                    }
                    break;

                case 6:
                    if (indice == 0) {
                        System.out.println("No hay motores registrados.");
                    }
                    for (int i = 0; i < indice; i++) {
                        System.out.print("[" + i + "] ");
                        motores[i].mostrarEstado();
                    }
                    break;

                case 0:
                    System.out.println("Fin del programa.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opc != 0);
    }
}
