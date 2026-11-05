import java.util.Scanner;

// EJERCICIO 2: todas las opciones trabajan con el arreglo completo (for + length)
public class MainClasificador {

    public static void main(String[] args) {
        double valor, umbral;
        int opc, positivos, negativos;
        boolean registrado = false;

        final int MAX = 3;
        Clasificador modelos[] = new Clasificador[MAX];
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n===== CLASIFICADOR =====");
            System.out.println("1. Registrar todos los clasificadores");
            System.out.println("2. Evaluar todos");
            System.out.println("3. Mostrar resultados de todos");
            System.out.println("4. Contar positivos y negativos");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opc = Integer.parseInt(sc.nextLine());

            if (opc >= 2 && opc <= 4 && !registrado) {
                System.out.println("Primero debe registrar los clasificadores (opción 1).");
                continue;
            }

            switch (opc) {
                case 1:
                    // llenar todo el arreglo
                    for (int i = 0; i < modelos.length; i++) {
                        System.out.print("Ingrese el valor de entrada " + (i + 1) + ": ");
                        valor = Double.parseDouble(sc.nextLine());
                        System.out.print("Ingrese el umbral " + (i + 1) + ": ");
                        umbral = Double.parseDouble(sc.nextLine());
                        modelos[i] = new Clasificador(valor, umbral);
                    }
                    registrado = true;
                    break;

                case 2:
                    for (int i = 0; i < modelos.length; i++) {
                        modelos[i].evaluar();
                    }
                    System.out.println("Todos los clasificadores fueron evaluados.");
                    break;

                case 3:
                    for (int i = 0; i < modelos.length; i++) {
                        modelos[i].mostrarResultado();
                    }
                    break;

                case 4:
                    positivos = 0;
                    negativos = 0;
                    for (int i = 0; i < modelos.length; i++) {
                        if (modelos[i].getResultado().equals("POSITIVO")) {
                            positivos++;
                        } else if (modelos[i].getResultado().equals("NEGATIVO")) {
                            negativos++;
                        }
                    }
                    System.out.println("Positivos: " + positivos + " | Negativos: " + negativos);
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
