import java.util.Scanner;

// EJERCICIO 4: ingreso de 1 en 1 mientras haya espacio;
// las demás opciones piden el índice del elemento a operar
public class MainProducto {

    public static void main(String[] args) {
        String nombre;
        double precio;
        int stock, opc, pos;

        final int MAX = 3;
        ProductoDigital productos[] = new ProductoDigital[MAX];
        int indice = 0;   // cantidad de productos ingresados
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n===== TIENDA ONLINE =====");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precio de un producto");
            System.out.println("3. Modificar stock de un producto");
            System.out.println("4. Mostrar un producto");
            System.out.println("5. Mostrar todos los productos");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opc = Integer.parseInt(sc.nextLine());

            switch (opc) {
                case 1:
                    // ingreso de 1 en 1
                    if (indice < MAX) {
                        System.out.print("Ingrese el nombre del producto: ");
                        nombre = sc.nextLine();
                        System.out.print("Ingrese el precio: ");
                        precio = Double.parseDouble(sc.nextLine());
                        System.out.print("Ingrese el stock: ");
                        stock = Integer.parseInt(sc.nextLine());
                        productos[indice++] = new ProductoDigital(nombre, precio, stock);
                        System.out.println("Producto agregado en la posición " + (indice - 1) + ".");
                    } else {
                        System.out.println("No hay más memoria");
                    }
                    break;

                case 2:
                case 3:
                case 4:
                    if (indice == 0) {
                        System.out.println("No hay productos registrados.");
                        break;
                    }
                    System.out.print("Ingrese el índice del producto (0 a " + (indice - 1) + "): ");
                    pos = Integer.parseInt(sc.nextLine());
                    if (pos < 0 || pos >= indice) {
                        System.out.println("Índice inválido.");
                        break;
                    }

                    if (opc == 2) {
                        System.out.print("Ingrese el nuevo precio: ");
                        precio = Double.parseDouble(sc.nextLine());
                        productos[pos].setPrecio(precio);
                    } else if (opc == 3) {
                        System.out.print("Ingrese el nuevo stock: ");
                        stock = Integer.parseInt(sc.nextLine());
                        productos[pos].setStock(stock);
                    } else {
                        productos[pos].mostrarInfo();
                    }
                    break;

                case 5:
                    if (indice == 0) {
                        System.out.println("No hay productos registrados.");
                    }
                    for (int i = 0; i < indice; i++) {
                        System.out.print("[" + i + "] ");
                        productos[i].mostrarInfo();
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
