package veiculos;

public class GerenciadorVeiculos {
    public static void main(String[] args) {
       
        Carro carro = new Carro("Toyota", "Corolla", 2022, 120000, 4);
        Moto moto = new Moto("Honda", "CB 500", 2021, 35000, 500);

       
        carro.exibirDetalhes();
        moto.exibirDetalhes();

      
        System.out.println("\nAplicando desconto de 10%:\n");

        carro.aplicarDesconto(10); 
        moto.aplicarDesconto(10);  

       
        carro.exibirDetalhes();
        moto.exibirDetalhes();
    }
}