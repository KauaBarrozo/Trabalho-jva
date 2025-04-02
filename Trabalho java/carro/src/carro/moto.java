package veiculos;

public class Moto extends Veiculo implements Desconto {
    private int cilindradas;

    
    public Moto(String marca, String modelo, int ano, double preco, int cilindradas) {
        super(marca, modelo, ano, preco);
        this.cilindradas = cilindradas;
    }

   
    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

 
    public void exibirDetalhes() {
        System.out.println("=== Informações da Moto ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Cilindradas: " + cilindradas + "cc");
    }

    
    public void aplicarDesconto(double porcentagem) {
        double desconto = (getPreco() * porcentagem) / 100; 
        setPreco(getPreco() - desconto);
    }
}