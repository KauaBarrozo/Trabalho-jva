abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double preco;

    public Veiculo(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public abstract void exibirDetalhes();

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }
    public double getPreco() { return preco; }

    public void setPreco(double preco) { this.preco = preco; }

    public String toString() {
        return getMarca() + " " + getModelo() + ", Ano: " + getAno() + ", Preço: " + getPreco();
    }
}

interface Desconto {
    void aplicarDesconto(double porcentagem);
}

class Carro extends Veiculo implements Desconto {
    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, double preco, int numeroPortas) {
        super(marca, modelo, ano, preco);
        this.numeroPortas = numeroPortas;
    }

    public void exibirDetalhes() {
        System.out.println("Detalhes do Carro: " + this.toString() + ", Portas: " + numeroPortas);
    }

    public void aplicarDesconto(double porcentagem) {
        double precoAntigo = getPreco();
        setPreco(getPreco() * (1 - porcentagem / 100));
        System.out.println("Desconto aplicado: " + (precoAntigo - getPreco()));
    }

    public String toString() {
        return super.toString() + ", Portas: " + numeroPortas;
    }
}

class Moto extends Veiculo implements Desconto {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, double preco, int cilindradas) {
        super(marca, modelo, ano, preco);
        this.cilindradas = cilindradas;
    }

    public void exibirDetalhes() {
        System.out.println("Detalhes da Moto: " + this.toString() + ", Cilindradas: " + cilindradas);
    }

    public void aplicarDesconto(double porcentagem) {
        double precoAntigo = getPreco();
        setPreco(getPreco() * (1 - porcentagem / 100));
        System.out.println("Desconto aplicado: " + (precoAntigo - getPreco()));
    }

    public String toString() {
        return super.toString() + ", Cilindradas: " + cilindradas;
    }
}

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Toyota", "Corolla", 2022, 80000, 4);
        Veiculo moto = new Moto("Honda", "CB500", 2021, 25000, 500);

        carro.exibirDetalhes();
        moto.exibirDetalhes();

        // Aplicando desconto
        System.out.println("\nAplicando 10% de desconto:");
        carro.aplicarDesconto(10);
        moto.aplicarDesconto(10);
        
        carro.exibirDetalhes();
        moto.exibirDetalhes();
    }
}