public class ProductoDigital {

    private String nombre;
    private double precio;
    private int stock;

    // Constructor que inicializa los tres atributos
    public ProductoDigital(String nombre, double precio, int stock) {
        this.nombre = nombre;
        setPrecio(precio);
        setStock(stock);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    // Setters con validación (precio positivo, stock no negativo)
    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("Precio inválido, debe ser mayor que 0.");
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Stock inválido, no puede ser negativo.");
        }
    }

    // Método utilitario
    public void mostrarInfo() {
        System.out.println("Producto: " + nombre
                + " | Precio: $" + precio
                + " | Stock: " + stock);
    }
}
