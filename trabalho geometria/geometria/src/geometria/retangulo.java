package geometria;

public class Retangulo extends Figura implements FiguraPlana {
    private double largura, altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public void exibirDetalhes() {
        System.out.println("Retângulo - Área: " + calcularArea() + ", Perímetro: " + calcularPerimetro());
    }
}