public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double precoPorDia;

    // Construtor
    public Carro(String marca, String modelo, int ano, double precoPorDia) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.precoPorDia = precoPorDia;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getPrecoPorDia() {
        return precoPorDia;
    }

    // Método para exibir as informações do carro
    public String exibirDetalhes() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano + "\nPreço por Dia: R$ " + precoPorDia;
    }
}