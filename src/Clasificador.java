public class Clasificador {

    private double valorEntrada;
    private double umbral;
    private String resultado;

    // El umbral se establece en el constructor
    public Clasificador(double valorEntrada, double umbral) {
        this.valorEntrada = valorEntrada;
        this.umbral = umbral;
        this.resultado = "SIN EVALUAR";
    }

    // Getters
    public double getValorEntrada() {
        return valorEntrada;
    }

    public double getUmbral() {
        return umbral;
    }

    public String getResultado() {
        return resultado;
    }

    // Setter
    public void setValorEntrada(double valorEntrada) {
        this.valorEntrada = valorEntrada;
        this.resultado = "SIN EVALUAR";
    }

    // Compara el valor con el umbral
    public void evaluar() {
        if (valorEntrada >= umbral) {
            resultado = "POSITIVO";
        } else {
            resultado = "NEGATIVO";
        }
    }

    public void mostrarResultado() {
        System.out.println("Valor: " + valorEntrada
                + " | Umbral: " + umbral
                + " | Resultado: " + resultado);
    }
}
