public class Aluguel {
    private Carro carro;
    private int diasAlugados;
    private double valorTotal;

    // Construtor
    public Aluguel(Carro carro, int diasAlugados) {
        this.carro = carro;
        this.diasAlugados = diasAlugados;
        this.valorTotal = calcularValorTotal();
    }

    // Método para calcular o valor total do aluguel
    private double calcularValorTotal() {
        return carro.getPrecoPorDia() * diasAlugados;
    }

    // Exibir resumo do aluguel
    public void exibirResumoAluguel() {
        System.out.println("\n--- Resumo do Aluguel ---");
        System.out.println(carro.exibirDetalhes());
        System.out.println("Dias alugados: " + diasAlugados);
        System.out.println("Valor total: R$ " + valorTotal);
    }
}