import java.util.Scanner;

// EJERCICIO 1: todas las opciones trabajan con el arreglo completo (for + length)
public class MainLuz {

    public static void main(String[] args) {
        int id, nivel, opc;
        boolean registrado = false;

        final int MAX = 3;
        LuzInteligente luces[] = new LuzInteligente[MAX];
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n===== LUCES INTELIGENTES =====");
            System.out.println("1. Registrar todas las luces");
            System.out.println("2. Encender todas las luces");
            System.out.println("3. Apagar todas las luces");
            System.out.println("4. Ajustar brillo de todas las luces");
            System.out.println("5. Mostrar estado de todas las luces");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opc = Integer.parseInt(sc.nextLine());

            if (opc >= 2 && opc <= 5 && !registrado) {
                System.out.println("Primero debe registrar las luces (opción 1).");
                continue;
            }

            switch (opc) {
                case 1:
                    // llenar todo el arreglo
                    for (int i = 0; i < luces.length; i++) {
                        System.out.print("Ingrese el ID de la luz " + (i + 1) + ": ");
                        id = Integer.parseInt(sc.nextLine());
                        luces[i] = new LuzInteligente(id);
                    }
                    registrado = true;
                    break;

                case 2:
                    for (int i = 0; i < luces.length; i++) {
                        luces[i].encender();
                    }
                    break;

                case 3:
                    for (int i = 0; i < luces.length; i++) {
                        luces[i].apagar();
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el nuevo nivel de brillo (0-100): ");
                    nivel = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < luces.length; i++) {
                        luces[i].ajustarBrillo(nivel);
                    }
                    break;

                case 5:
                    for (int i = 0; i < luces.length; i++) {
                        luces[i].mostrarEstado();
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
