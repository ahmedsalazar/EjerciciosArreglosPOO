public class Motor {

    private String codigo;
    private boolean estado;   // true = encendido, false = apagado
    private int velocidad;

    public Motor(String codigo) {
        this.codigo = codigo;
        this.estado = false;
        this.velocidad = 0;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public boolean isEstado() {
        return estado;
    }

    public int getVelocidad() {
        return velocidad;
    }

    // Métodos
    public void encender() {
        estado = true;
        System.out.println("Motor " + codigo + " encendido.");
    }

    public void apagar() {
        estado = false;
        velocidad = 0;
        System.out.println("Motor " + codigo + " apagado.");
    }

    // Valida que la velocidad no supere 100 ni sea menor que 0
    public void ajustarVelocidad(int nuevaVelocidad) {
        if (nuevaVelocidad < 0 || nuevaVelocidad > 100) {
            System.out.println("Velocidad inválida, debe estar entre 0 y 100.");
        } else {
            velocidad = nuevaVelocidad;
            System.out.println("Motor " + codigo + ": velocidad ajustada a " + velocidad + ".");
        }
    }

    public void mostrarEstado() {
        System.out.println("Código: " + codigo
                + " | Estado: " + (estado ? "Encendido" : "Apagado")
                + " | Velocidad: " + velocidad);
    }
}
