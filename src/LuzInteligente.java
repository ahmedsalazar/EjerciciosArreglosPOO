public class LuzInteligente {

    private int idLuz;
    private int nivelBrillo;
    private boolean encendida;

    // Constructor: inicializa el idLuz
    public LuzInteligente(int idLuz) {
        this.idLuz = idLuz;
        this.nivelBrillo = 0;
        this.encendida = false;
    }

    // Getters
    public int getIdLuz() {
        return idLuz;
    }

    public int getNivelBrillo() {
        return nivelBrillo;
    }

    public boolean isEncendida() {
        return encendida;
    }

    // Setter
    public void setIdLuz(int idLuz) {
        this.idLuz = idLuz;
    }

    // Métodos
    public void encender() {
        encendida = true;
        System.out.println("Luz " + idLuz + " encendida.");
    }

    public void apagar() {
        encendida = false;
        System.out.println("Luz " + idLuz + " apagada.");
    }

    // Solo funciona si la luz está encendida y el nivel está entre 0 y 100
    public void ajustarBrillo(int nuevoNivel) {
        if (!encendida) {
            System.out.println("Luz " + idLuz + ": no se puede ajustar el brillo, la luz está apagada.");
        } else if (nuevoNivel < 0 || nuevoNivel > 100) {
            System.out.println("Luz " + idLuz + ": nivel inválido, debe estar entre 0 y 100.");
        } else {
            nivelBrillo = nuevoNivel;
            System.out.println("Luz " + idLuz + ": brillo ajustado a " + nivelBrillo + ".");
        }
    }

    public void mostrarEstado() {
        System.out.println("ID: " + idLuz
                + " | Estado: " + (encendida ? "Encendida" : "Apagada")
                + " | Brillo: " + nivelBrillo);
    }
}
