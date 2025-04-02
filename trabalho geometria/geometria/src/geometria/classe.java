package geometria;

public class Circulo extends Figura implements FiguraPlana {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public void exibirDetalhes() {
        System.out.println("Círculo - Área: " + calcularArea() + ", Perímetro: " + calcularPerimetro());
    }
}