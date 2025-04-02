package veiculos;

public class Carro extends Veiculo implements Desconto {
    private int numeroPortas;

  
    public Carro(String marca, String modelo, int ano, double preco, int numeroPortas) {
        super(marca, modelo, ano, preco);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public void exibirDetalhes() {
        System.out.println("=== Informações do Carro ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Número de portas: " + numeroPortas);
    }

    @Override
    public void aplicarDesconto(double porcentagem) {
        double desconto = (getPreco() * porcentagem) / 100;
        setPreco(getPreco() - desconto); 
    }
}