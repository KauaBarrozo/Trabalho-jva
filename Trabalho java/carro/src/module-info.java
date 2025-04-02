package veiculos;

public class Desconto {

    
    public static void aplicarDesconto(Veiculo veiculo, double porcentagem) {
        double desconto = (veiculo.getPreco() * porcentagem) / 100;  
        veiculo.setPreco(veiculo.getPreco() - desconto);  
    }
}