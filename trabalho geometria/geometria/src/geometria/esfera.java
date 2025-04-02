package geometria;

public class Esfera extends Figura implements FiguraEspacial {
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double calcularVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(raio, 3);
    }

    public void exibirDetalhes() {
        System.out.println("Esfera - Volume: " + calcularVolume());
    }
}